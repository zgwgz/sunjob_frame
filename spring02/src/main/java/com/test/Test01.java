package com.test;

import com.domain.Dep;
import com.service.DepService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {
    @Test
    public  void test01(){
        //创建核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DepService service= (DepService) ac.getBean("DepService");
        List<Dep> list = service.findAll();
        for (Dep dep : list) {
            System.out.println(dep);
        }
    }
}
