package com.test;

import com.dao.EmpDao;
import com.domain.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestEmp {
   // @Test
   /* public void testAddOne() throws IOException {
        //获取参数信息
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建建造者
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        //创建工厂
        SqlSessionFactory sqlSessionFactory = sb.build(is);
        //创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);

        Emp emp=new Emp();
        emp.setEmpname("钟国威");
        empDao.addEmp(emp);
        sqlSession.commit();
        System.out.println(emp.getEmpid());
    }*/



     @Test
    public void testUpdate() throws IOException {
        //获取参数信息
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建建造者
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        //创建工厂
        SqlSessionFactory sqlSessionFactory = sb.build(is);
        //创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);

        Emp emp=new Emp();
        //emp.setEmpname("钟国威2");
        empDao.updateEmp(emp);
        sqlSession.commit();
       // System.out.println(emp.getEmpid());
    }
    @Test
    public void testFindByCondition() throws IOException {
        //获取参数信息
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建建造者
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        //创建工厂
        SqlSessionFactory sqlSessionFactory = sb.build(is);
        //创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Emp emp=new Emp();
        emp.setEmpname("钟国威");
        List<Emp> emps=empDao.FindByCondition(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }

    }


}
