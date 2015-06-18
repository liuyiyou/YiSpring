package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *用户管理
 */
@Controller
@RequestMapping(value = "user/")
public class UserController {

    @RequestMapping(value = "add")
    public String add(){
        return "add";
    }

    @RequestMapping(value = "delete")
    public String delete(){
        return "delete";
    }

    @RequestMapping(value = "update")
    public String update(){
        return "update";
    }

    @RequestMapping(value = "select")
    public String select(){
        return "select";
    }
}
