package cn.liuyiyou.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: liuyiyou
 * Date: 14-11-26
 * Time: 下午8:55
 */
@Controller
@RequestMapping(value = "ztree/")
public class ZtreeController {

    @RequestMapping(value = "checkbox")
    public String checkBox(){
        return "ztree/checkbox";
    }
}
