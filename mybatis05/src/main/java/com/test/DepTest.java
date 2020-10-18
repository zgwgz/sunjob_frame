package com.test;

import com.dao.DepDao;
import com.domain.Dep;
import com.domain.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

public class DepTest {

    @Test
    public void test1() throws IOException {
        //获取参数信息
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建建造者
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        //创建工厂
        SqlSessionFactory sqlSessionFactory = sb.build(is);
        //创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        //创建代理对象
        DepDao depDao = sqlSession.getMapper(DepDao.class);

        Dep dep = depDao.findById(1);

        System.out.println(dep);
        Set<Emp> emps = dep.getEmps();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpname());
        }


    }

    @Test
    public void test2() throws IOException {
        //获取参数信息
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建建造者
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        //创建工厂
        SqlSessionFactory sqlSessionFactory = sb.build(is);
        //创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        //创建代理对象
        DepDao depDao = sqlSession.getMapper(DepDao.class);

        Dep dep = depDao.findById2(1);

        System.out.println(dep);
        Set<Emp> emps = dep.getEmps();
        for (Emp emp : emps) {
            System.out.println(emp.getEmpname());
        }


    }

    @Test
    public void test3() throws IOException {
        //获取参数信息
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建建造者
        SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
        //创建工厂
        SqlSessionFactory sqlSessionFactory = sb.build(is);
        //创建sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        DepDao depDao = sqlSession.getMapper(DepDao.class);

        //使用分页插件
        PageHelper.startPage(2,5);
        List<Dep> fy = depDao.fy();
        PageInfo<Dep> pageInfo=new PageInfo<Dep>(fy);

        for (Dep dep : fy) {

            System.out.println(dep);
        }

        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getList());




    }
}