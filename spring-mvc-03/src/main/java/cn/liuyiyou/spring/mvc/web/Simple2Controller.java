package cn.liuyiyou.spring.mvc.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 继承AbstractController。可以看到，这种方法扩展性比较差。一个类只能处理一个请求
 */
public class Simple2Controller extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return  new ModelAndView("simple2");
    }
}
