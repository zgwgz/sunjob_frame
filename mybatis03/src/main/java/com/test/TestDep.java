package com.test;

import com.dao.DepDao;
import com.domain.Dep;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDep {
    @Test
    public void testFindAll() throws IOException {
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
        //执行方法
        List<Dep> deps = depDao.findAll();
        //遍历输出
        for (Dep dep : deps) {
            System.out.println(dep);
        }

        sqlSession.close();
        is.close();
    }


@Test
    public void testFFenye() throws IOException {
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
        //执行方法
        Map map=new HashMap();
        map.put("offset",0);
        map.put("size",1);
        List<Dep> deps = depDao.findByFenYe(map);
        //遍历输出
        for (Dep dep : deps) {
            System.out.println(dep);
        }

        sqlSession.close();
        is.close();
    }

    @Test
    public void testAddOne() throws IOException {
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
        Dep dep=new Dep();
        dep.setDepname("清洁布");

        depDao.addOne(dep);
        System.out.println(dep.getDepid());
        sqlSession.commit();
    }
}
