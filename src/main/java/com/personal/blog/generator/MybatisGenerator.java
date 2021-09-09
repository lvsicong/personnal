package com.personal.blog.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * mybatis 逆向工程类
 * @author 吕思聪
 * @date 2021/9/8 2:46 下午
 */
public class MybatisGenerator {
    public static void main(String[] args) throws Exception {
        String today = "2021-9-9";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = sdf.parse(today);
        Date date = new Date();
        System.out.println(now.toString());
        if(date.getTime()>now.getTime()+1000*60*60*24){
            System.err.println("--------未成功运行--------");
            System.err.println("--------未成功运行--------");
            System.err.println("本程序有破坏作用，应只运行一次，如果必须再次执行，要修改today变量为今天");
            return;
        }
        if (false){
            return;
        }
        boolean overwite = true;
        ArrayList<String> warrnings = new ArrayList<>();
        InputStream is = MyBatisGenerator.class.getClassLoader().getResource("generatorConfig.xml").openStream();
        ConfigurationParser cp = new ConfigurationParser(warrnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback = new DefaultShellCallback(overwite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warrnings);
        myBatisGenerator.generate(null);
        System.out.println("代码生成成功，只能执行一次，以后会覆盖掉mapper、xml、pojo等文件作出的修改");
    }
}
