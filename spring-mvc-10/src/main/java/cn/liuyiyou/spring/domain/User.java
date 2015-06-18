package cn.liuyiyou.spring.domain;




import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liuyiyou
 * Date: 14-7-15
 * Time: 下午9:07
 * To change this template use File | Settings | File Templates.
 */
public class User {


    private String username;

    private String nickname;

    private String password;


    private String email;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public static void main(String[] args) {
        Map<String,Object> map1 =new HashMap<String, Object>();
        map1.put("result","success");
        map1.put("message","这是使用Map封装的数据");
        System.out.println(map1.toString());

        JSONObject map2 = new JSONObject();
        try {
            map2.put("result","success");
            map2.put("message","这是使用Map封装的数据");
        } catch (JSONException e) {
        }

        System.out.println(map2.toString());


        /**
         * {message=这是使用Map封装的数据, result=success}
         *{"message":"这是使用Map封装的数据","result":"success"}
         * */
    }

}
