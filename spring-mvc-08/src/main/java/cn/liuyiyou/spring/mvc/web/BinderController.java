package cn.liuyiyou.spring.mvc.web;

import cn.liuyiyou.spring.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: liuyiyou
 * Date: 6/22/15
 * Time: 12:09 AM
 *
 * 绑定基本数据类型
 */

@Controller
public class BinderController {


    /**
     * 绑定基本数据类型，如果不匹配，则抛弃
     * @param id
     * @param name
     * @param age
     * @param emial
     * @param noUser
     * @return
     */
    @RequestMapping("base")
    @ResponseBody
    public User base(int  id, String name, int  age,String emial, String noUser){

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setEmial(emial);

        System.out.println(user);
        return user;
    }


    @RequestMapping(value = "baseBean",method = RequestMethod.GET)
    public String baseBeanForm(){
        return "baseBean";
    }



    /**
     * 绑定简单对象。如果有不匹配的则抛弃
     * @param user
     * @return
     */
    @RequestMapping("baseBean")
    @ResponseBody
    public User baseBean(User user){
        System.out.println(user);
        return user;
    }




}
