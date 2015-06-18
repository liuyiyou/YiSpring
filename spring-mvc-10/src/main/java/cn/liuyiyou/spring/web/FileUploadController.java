package cn.liuyiyou.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;
import org.springframework.web.servlet.config.AnnotationDrivenBeanDefinitionParser;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: liuyiyou
 * Date: 14-11-13
 * Time: 下午8:28
 */
@Controller
public class FileUploadController {



    DefaultAnnotationHandlerMapping

    @RequestMapping(value = "fileUploadForm")
    public String fileUploadForm(){
        return "fileupload/fileupload";
    }



    @RequestMapping(value = "fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file")  List<MultipartFile> files,@RequestParam("data") String data){



        if (files!=null){
            System.out.println(files.size());
        }

        Map<String,Object> result = new HashMap<String, Object>();
        result.put("success",false);
        result.put("info","falseMessage");

        System.out.println(data);
        return data;
    }

    @RequestMapping(value = "jsonStringForm")
    public String jsonStringForm(){
        return "fileupload/jsonTest";
    }

    @RequestMapping(value="/jsonString")
    @ResponseBody
    public Map<String,Object> jsonString(@RequestParam("data") String data){
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("success",false);
        result.put("info",data);
        System.out.println(new Date());
        System.out.println(data);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("");

    }
}
