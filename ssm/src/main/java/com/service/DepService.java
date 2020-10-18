package com.service;

import com.dao.DepDao;
import com.domain.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Depservice")
public class DepService {

    @Autowired
    private DepDao dao;

    /**
     * 查找所有方法
     * @return
     */
    public List<Dep> findAll(){
        return dao.findAll();
    }

    /**
     * 删除指定的dep
     * @param id
     */
    public void deleteDep(Integer id){
        dao.deleteDep(id);
    }
}
