package cn.liuyiyou.spring.velocity.service;

import cn.liuyiyou.spring.velocity.domain.User;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;

/**
 * User: liuyiyou
 * Date: 14-10-18
 * Time: 下午9:56
 */
public class TemplatePath {

    public static void loderTemplatePathDefault(){
        VelocityEngine velocityEngine = new VelocityEngine();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name","liuyiyou");
        velocityContext.put("age","18");
        StringWriter writer = new StringWriter();
//        velocityEngine.mergeTemplate("template/user5.vm","utf-8",velocityContext,writer)
        //user.vm在于项目同级下
        Template template =  velocityEngine.getTemplate("template/user2.vm","utf-8");
        template.merge(velocityContext, writer);
        System.out.println(writer.toString());

        StringWriter writer2 = new StringWriter();
        User user = new User();
        user.setName("liuyiyou");
        user.setAge(11);
        velocityContext.put("user",user);
        Template template2 = Velocity.getTemplate("user3.vm");
        template2.merge(velocityContext,writer2);
        System.out.println(writer2.toString());
    }

    public static void loaderTemplatePathFromFile(){
        loderTemplatePathDefault();
    }

    public static void loaderTemplatePathFromClass() throws IOException {

        Properties properties = new Properties();
        properties.setProperty("resource.loader","class");
        properties.setProperty("class.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

        VelocityEngine velocityEngine = new VelocityEngine(properties);
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name","liuyiyou");
        velocityContext.put("age","18");
        StringWriter writer = new StringWriter();
        File directory = new File("");
        System.out.println(directory.getCanonicalPath());
        System.out.println(directory.getAbsolutePath());
        //这个在SpringMVC项目下的velocity模块下的src/main/java下的cn.liuyiyou.spring.velocity.template/user5.vm 报错
        Template template =  Velocity.getTemplate("velocity/src/main/java/cn/liuyiyou/spring/velocity/template/user6.vm", "utf-8");
        //这个在SpringMVC项目template文件夹下，与main同级
        //Template template =  Velocity.getTemplate("template/user4.vm", "utf-8");
        template.merge(velocityContext,writer);
        System.out.println(writer.toString());


        StringWriter writer2 = new StringWriter();
        User user = new User();
        user.setName("liuyiyou");
        user.setAge(11);
        velocityContext.put("user",user);
        //在main/resources/user.vm下
        Template template2 =  velocityEngine.getTemplate("user5.vm","utf-8");
        template2.merge(velocityContext,writer2);
        System.out.println(writer2.toString());
    }

    public static void loaderTemplatePathFromJar(){
        Properties properties = new Properties();
        properties.setProperty("resource.loader","jar");
        properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH,"jar:file:webapp/WEB-INF/lib/vm.jar");
        VelocityEngine velocityEngine = new VelocityEngine(properties);
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name","liuyiyou");
        velocityContext.put("age","18");
        StringWriter writer = new StringWriter();
        Template template =  velocityEngine.getTemplate("template/user5.vm","utf-8");
        template.merge(velocityContext, writer);
        System.out.println(writer.toString());


    }

    public static void loaderTemplatePathFath(){
        Properties properties = new Properties();
        properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, TemplatePath.class.getResource("/").toString().replaceAll("^file:/", "").replaceAll("WEB-INF/classes", "vm")) ;
    }


    public static void main(String[] args) {
        System.out.println("默认使用的路径：");
        TemplatePath.loderTemplatePathDefault();
        System.out.println("使用文件路径，默认在与项目平级，而不是在项目下，如果以这样对方式输出文件：File savefile = new File(\"users\" + File.separator + \"my.htm\" + File.separator);");
        TemplatePath.loaderTemplatePathFromFile();
        System.out.println("使用类路径");
        try {
            TemplatePath.loaderTemplatePathFromClass();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("使用jar路径");
       // TemplatePath.loaderTemplatePathFromJar();
    }
}
