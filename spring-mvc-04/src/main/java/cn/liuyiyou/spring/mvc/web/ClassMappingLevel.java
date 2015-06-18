package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类级别：类下面的方法访问路径都需要加上类上的映射
 */

@Controller
@RequestMapping(value = "class/")
public class ClassMappingLevel {


    /**
     * http://domain:port/class/method
     */
    @RequestMapping(value = "method")
    public String method(){
        return "class" ;
    }
}
