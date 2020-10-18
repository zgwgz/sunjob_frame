package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.DepDao;
import com.domain.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepService {

    @Autowired
    private DepDao dao;
    public List<Dep> findAll(){
        //使用mp中的方法
        //使用包装类进行查询操作，条件构造器
        QueryWrapper<Dep> depQueryWrapper = new QueryWrapper<>();
        depQueryWrapper.eq("depid",107);

       List<Dep>  dep = dao.selectList(depQueryWrapper);
        return dep;
    }
}
