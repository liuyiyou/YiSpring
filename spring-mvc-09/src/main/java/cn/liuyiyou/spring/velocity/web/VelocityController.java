package cn.liuyiyou.spring.velocity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * User: liuyiyou
 * Date: 14-10-8
 * Time: 下午10:50
 * Desc：环境搭建测试
 */
@Controller
public class VelocityController {



    @RequestMapping(value = "/test")
    public ModelAndView test(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        Map params = new HashMap();
        params.put("sex", "fff");
        params.put("name", "www");
        params.put("count1", new Integer(1234234));
        params.put("count2", 1234456);
        mv.addAllObjects(params);
        return mv;
    }
    @RequestMapping(value = "/h1")
    public ModelAndView h2(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("nest/h1");
        mv.addObject("h1", 1111111);
        mv.addObject("h2", 222222222);
        return mv;
    }
}
