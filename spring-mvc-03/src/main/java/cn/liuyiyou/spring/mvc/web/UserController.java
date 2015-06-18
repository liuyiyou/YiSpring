package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //默认名称为userController
@RequestMapping(value = "user/")
public class UserController {

    @RequestMapping(value = "list")
    public String list(){
        return "admin/list";
    }


}
