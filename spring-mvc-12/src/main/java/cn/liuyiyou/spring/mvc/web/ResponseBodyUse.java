package cn.liuyiyou.spring.mvc.web;

import cn.liuyiyou.spring.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * User: liuyiyou
 * Date: 6/18/15
 * Time: 10:10 AM
 *
 */
@Controller
public class ResponseBodyUse {


    /**
     * 返回中文字符串
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "returnStr")
    public String returnStr(){
        return "中文";
    }


    /**
     * 返回Map
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "returnMap")
    public Map<String,String> returnMap(){
        Map<String,String> result = new HashMap<String, String>();

        result.put("key1","key1值");
        result.put("key2","key2值");

        return result;
    }

    /**
     * 返回javaBean
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "returnJavaBean")
    public User returnJavaBean(){
        User user = new User();
        user.setId(1);
        user.setName("liuyiyou中文");
        user.setEmail("137515110@qq.com");
        return  user;
    }
}
