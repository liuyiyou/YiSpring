package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理
 * User: liuyiyou
 * Date: 6/23/15
 * Time: 9:23 AM
 */
@ControllerAdvice
public class OverallExceptionHandlerController {

    /**
     * 通过value值，可以定义多种异常处理方式
     * @param ex
     * @return
     */
    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("error2");
        mv.addObject("exception", ex);
        System.out.println("in testControllerAdvice");
        return mv;
    }
}
