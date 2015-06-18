package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 通过注解来实现控制器
 */
@Controller
public class MostUsedController {


    @RequestMapping("add")
    public String add(){
        return "add";
    }

    @RequestMapping("delete")
    public String delete(){
        return "delete";
    }

    @RequestMapping("update")
    public String update(){
        return "update";
    }

    @RequestMapping("find")
    public String find(){
        return "find";
    }
}
