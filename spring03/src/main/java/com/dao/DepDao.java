package com.dao;

import com.domain.Dep;

import java.util.List;

public interface DepDao {
    /**
     * 查找全部
     * @return
     */
    public List<Dep> findAll();
}
