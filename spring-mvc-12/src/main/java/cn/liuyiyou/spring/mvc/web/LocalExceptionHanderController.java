package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 局部异常
 * User: liuyiyou
 * Date: 6/23/15
 * Time: 9:22 AM
 */
@Controller
public class LocalExceptionHanderController {

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        System.out.println("in testExceptionHandler");
        return mv;
    }


    @RequestMapping("/error")
    public String error(){
        int i = 5/0;
        return "hello";
    }
}
