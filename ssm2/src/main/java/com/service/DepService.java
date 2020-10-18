package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dao.DepDao;
import com.domain.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DepService {
    @ Autowired
    private DepDao dao;

    public IPage<Dep> fenye(IPage<Dep> page, QueryWrapper queryWrapper){
        IPage page1 = dao.selectPage(page, queryWrapper);
        return  page1;
    }

    public IPage<Map> fenye2(IPage<Map> page, Map m){
        IPage page1=dao.fenye(page, m);
        return  page1;
    }
}
