package cn.liuyiyou.spring.web;

import cn.liuyiyou.spring.domain.User;
import cn.liuyiyou.spring.domain.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-15
 * Time: 下午9:34
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class ValidatorController {


    @Autowired
    private UserValidator userValidator;



    /**
     * 第一种，使用spring自带的validator ,@ModelAttribute不能少，否则报错，因为前台使用了form:modelattribute
     */

    @RequestMapping(value = "validator", method = RequestMethod.GET)
    public String validatorForm(@ModelAttribute("user") User user) {
        return "validator/validatorForm";
    }

    /**
     * 第一种，使用spring自带的validator ,@ModelAttribute不能少，否则报错，因为前台使用了form:modelattribute
     */
    @RequestMapping(value = "validator", method = RequestMethod.POST)
    public String validatorBySpring(@ModelAttribute("user") User user,
                                    BindingResult result) {
        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "validator/validatorForm";
        }
        return "validator/success";
    }


    /**
     * 第一种，使用spring自带的validator
     */

    @RequestMapping(value = "validator2", method = RequestMethod.GET)
    public String validatorBySpringWithOutSpringTagForm(@ModelAttribute("user") User user) {
        return "validator/validatorForm2";
    }

    /**
     * 第一种，使用spring自带的validator
     */

    @RequestMapping(value = "validator2", method = RequestMethod.POST)
    public String validatorBySpringWithOutSpringTag(User user,
                                                    BindingResult result,ModelMap modelMap) {
        userValidator.validate(user, result);


        if (result.hasErrors()) {

            List<FieldError> fieldErrors = result.getFieldErrors();

            for (FieldError fieldError:fieldErrors){
                String objectName= fieldError.getObjectName();
                System.out.println("objecName;"+ objectName);
                System.out.println("msg:"+ fieldError.getDefaultMessage());
                System.out.println("code:"+fieldError.getCode());

                modelMap.put(fieldError.getField(),fieldError.getCode());

                modelMap.put("error",fieldError);
            }


            return "validator/validatorForm2";
        }
        return "validator/success";
    }


}
