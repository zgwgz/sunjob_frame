package com.dao;

import com.domain.Dep;

import java.util.List;

public interface DepDao {
    /**
     * 查找所有的部门
     * @return
     */
    public List<Dep> findAll();
}
