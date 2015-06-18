package cn.liuyiyou.spring.mvc.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 必须加value属性。否则报错：non-compatible bean definition of same name and class
 */
@Controller("adminUserController")      //默认名称为userController,加了value之后就是adminUserController
@RequestMapping(value = "admin/user/")
public class UserController {

    @RequestMapping(value = "list")
    public String list(){
        return "admin/list";
    }


}
