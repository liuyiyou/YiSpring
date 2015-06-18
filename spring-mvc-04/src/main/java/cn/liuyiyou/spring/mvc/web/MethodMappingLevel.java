package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 方法级别：类下面的方法访问路径都需要加上类上的映射
 */

@Controller
public class MethodMappingLevel {


    /**
     * http://domain:port/method
     */
    @RequestMapping(value = "method")
    public String method(){
        return "method" ;
    }
}
