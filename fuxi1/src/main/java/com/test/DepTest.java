package com.test;

import com.dao.DepDao;
import com.domain.Dep;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DepTest {
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

       // List<Dep> deps=dao.findAll();

        for (Dep dep : deps) {
            System.out.println(dep);
        }
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
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        //创建代理对象
        DepDao depDao = sqlSession.getMapper(DepDao.class);

        Dep dep=new Dep();
        dep.setDepname("哈哈");
        depDao.addOne(dep);
        sqlSession.commit();
        System.out.println(dep.getDepid());
        sqlSession.close();
    }
}
