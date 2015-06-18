package cn.liuyiyou.spring.mvc.web;

import cn.liuyiyou.spring.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-15
 * Time: 下午9:34
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "validator")
public class ValidatorController {


    /**
     * 第二种：基于注解jSR303
     */

    @RequestMapping(value = "validatorByJsr", method = RequestMethod.GET)
    public String validatorByJsrForm(@ModelAttribute("user") User user) {
        return "/validator/validatorByJsr";
    }


    @RequestMapping(value = "validatorByJsr", method = RequestMethod.POST)
    public String validatorByJsr(@Valid @ModelAttribute("user") User user, BindingResult result,ModelMap modelMap) {

        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();

            for (FieldError fieldError:fieldErrors){
                String objectName= fieldError.getObjectName();
                System.out.println("objecName;"+ objectName);
                System.out.println("msg:"+ fieldError.getDefaultMessage());
                modelMap.put(fieldError.getField(),fieldError.getDefaultMessage());

            }

            return "validator/validatorByJsr";
        }
        return "validator/success";
    }
}
