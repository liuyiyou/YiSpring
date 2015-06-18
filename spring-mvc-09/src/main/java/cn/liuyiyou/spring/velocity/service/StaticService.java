package cn.liuyiyou.spring.velocity.service;

import cn.liuyiyou.spring.velocity.domain.User;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.resource.ResourceManager;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 * User: liuyiyou
 * Date: 14-10-16
 * Time: 下午11:06
 */
@Service
public class StaticService {

    public static void doStatic() throws IOException {

        User user = new User();
        user.setName("liuyiyou");
        user.setAge(11);

        VelocityEngine velocityEngine = new VelocityEngine();
        //加载属性文件
       // Resource resource = new ClassPathResource("velocity.properties");
       // Properties properties = PropertiesLoaderUtils.loadProperties(resource);
       // /初始化
        Properties properties = new Properties();
        properties.setProperty(Velocity.OUTPUT_ENCODING,"UTF-8");
        properties.setProperty(Velocity.INPUT_ENCODING,"UTF-8");
        velocityEngine.init(properties);
        VelocityContext velocityContext = new VelocityContext();
        Template template = Velocity.getTemplate("user1.vm")        ;
        velocityContext.put("user", user);
        File savefile = new File("users" + File.separator + "my.htm" + File.separator);
        if (!savefile.getParentFile().exists())
            savefile.getParentFile().mkdirs();
        FileOutputStream outstream = new FileOutputStream(savefile);
        OutputStreamWriter writer = new OutputStreamWriter(outstream, "UTF-8");
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        template.merge(velocityContext, bufferWriter);
        bufferWriter.flush();
        outstream.close();
        bufferWriter.close();
    }

    public static void main(String[] args) {
        try {
            StaticService.doStatic();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
