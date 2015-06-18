package cn.liuyiyou.spring.mvc.web;


import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: liuyiyou
 * Date: 6/17/15
 * Time: 6:09 PM
 */
public class HelloController  {




    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mv = new ModelAndView("hello.jsp");
        ModelMap modelMap = new ModelMap();
        modelMap.put("message","this is message");
        mv.addAllObjects(modelMap);
        return mv;
    }
}
