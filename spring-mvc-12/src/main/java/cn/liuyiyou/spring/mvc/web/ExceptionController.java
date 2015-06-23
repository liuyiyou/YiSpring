package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: liuyiyou
 * Date: 6/19/15
 * Time: 3:28 PM
 */
@Controller
public class ExceptionController {


    //没有该页面，返回404
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    //返回500  ,如果有全局异常，则会由全局异常处理
    @RequestMapping("exception")
    @ResponseBody
    public String exception(){
        throw new RuntimeException("runtimexception");
    }


    @RequestMapping("500")
    public String hello500(){
        return "500";
    }
}
