package test;

import com.domain.Student;
import com.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student= (Student) ac.getBean("student");
        System.out.println(student);
    }
    @Test
    public void test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Service service= (Service) ac.getBean("service");
        service.hello();
    }

}
