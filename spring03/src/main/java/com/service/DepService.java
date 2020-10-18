package com.service;

import com.dao.DepDao;
import com.domain.Dep;

import java.util.List;

public class DepService {

    //关联dao层对象
    private DepDao depDao;

    /**
     * 查找全部的数据
     * @return
     */
    public List<Dep> findAll(){
        return  depDao.findAll();
    }
}
