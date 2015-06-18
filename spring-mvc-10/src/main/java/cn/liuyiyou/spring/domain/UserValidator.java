package cn.liuyiyou.spring.domain;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-15
 * Time: 下午9:52
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User)target;
        if(StringUtils.isEmpty(user.getUsername())){
            //1:使用这种方式，会报错(No message found under code 'empty.user.username.user.username' for locale 'zh_CN'.)，因为rejectValue的第二个参数都是errorcode
            //errors.rejectValue("username","empty.user.username");
            //errors.rejectValue("username","用户名不能为空");

            //2:正确用法：rejectValue(String filed,String errorcode,Object[] errorArgs,String defaultMessage)
           // errors.rejectValue("username","empty.user.username");
            errors.rejectValue("username","empty.user.username","用户名不能为空Default");

            //使用该种方式，不需要配置ResourceBundleMessageSource
           // ValidationUtils.rejectIfEmpty(errors,"username","empty.user.username","用户名不能为空");
        } else {
           int length =  user.getUsername().length();
            if(length<=3){
                errors.rejectValue("username","min.length.user.username","用户名长度不能小于3Default");
            }else if (length>=6){
                errors.rejectValue("username","max.length.user.username","用户名不能大于6Default");
            }

        }



        if (user.getPassword() == null || user.getPassword() == "") {
            errors.rejectValue("password", "empty.user.password","密码不能为空");
           // errors.rejectValue("password","用户密码不能为空");
           // errors.reject("password","用户密码不能为空");
            //ValidationUtils.
        }


    }
}
