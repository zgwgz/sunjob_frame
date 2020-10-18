package com.service.impl;

import com.dao.DepDao;
import com.domain.Dep;
import com.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepServiceImpl implements DepService {

    @Autowired
    private DepDao depDao;

    public DepDao getDepDao() {
        return depDao;
    }

    public void setDepDao(DepDao depDao) {
        this.depDao = depDao;
    }

    public List<Dep> findAll() {
       return  depDao.findAll();
    }
}
