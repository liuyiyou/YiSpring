package cn.liuyiyou.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: liuyiyou
 */

@Controller
public class RequestMappingRules {


    /**
     * 通过路径 :http://localhost:8080/mvc-05/byPath
     */
    @RequestMapping("byPath")
    @ResponseBody
    public String byPath() {
        return "the path is : byPath";
    }

    /**
     * 通过请求方法:http://localhost:8080/mvc-05/byHttpMethod
     */
    @RequestMapping(value = "byHttpMethod", method = RequestMethod.GET)
    @ResponseBody
    public String byHttpMethod() {
        return "the path is : byHttpMethod and method is: get";
    }


    /**
     * 通过请求方法:http://localhost:8080/mvc-05/byHttpMethod
     */
    @RequestMapping(value = "byHttpMethod", method = RequestMethod.POST)
    @ResponseBody
    public String byHttpMethodPOST() {
        return "路径是：http://localhost:8080/mvc-05/byHttpMethod，访问方式POST";
    }

    /**
     * 通过请求参数： http://localhost:8080/mvc-05/byQueryParamter?foo=aaa
     */
    @RequestMapping(value = "byQueryParamter", method = RequestMethod.GET, params = "foo")
    @ResponseBody
    public String byQueryParamter() {
        return "the path is : byQueryParamter?foo=xxx and method is :get";
    }


    /**
     * 通过请求参数：http://localhost:8080/mvc-05/byHttpMethod
     * 通过请求参数：http://localhost:8080/mvc-05/byQueryParamter?bar=aaaa
     */
    @RequestMapping(value = "byQueryParamter", method = RequestMethod.GET, params = "!foo")
    @ResponseBody
    public String byQueryParamter2() {
        return "the path is : byQueryParamter?bar=xxx and method is :getxxxx";
    }


    /**
     * 通过请求头：http://localhost:8080/mvc-05/byRequestHeader:  HTTP Status 415 -
     *
     * error: The server refused this request because the request entity is in a format not
     * supported by the requested resource for the requested method.
     */
    @RequestMapping(value = "byRequestHeader", headers = "content-type=text/*")
    @ResponseBody
    public String byRequestHeader() {
        return "the paht is: byRequestHeader and headers is : content-type=text/*";
    }


    /**
     * 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
     * @return
     */
    @RequestMapping(value = "byConsumes", consumes = {"text/plain", "application/*"})
    @ResponseBody
    public String byConsumes() {
        return "the paht is: byRequestHeader and consumes is : text/plain\", \"application/*";
    }


    /**
     * 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
     * @return
     */
    @RequestMapping(value = "byProduces", produces = {"text/plain", "application/*"})
    @ResponseBody
    public String byProduces() {
        return "the paht is: byProduces and produces is :\"text/plain\", \"application/*\" ";
    }




}
