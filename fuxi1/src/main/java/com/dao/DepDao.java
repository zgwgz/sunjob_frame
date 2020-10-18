package com.dao;

import com.domain.Dep;

import java.util.List;

public interface DepDao {
    /**
     *查找全部
     * @return
     */
    public List<Dep> findAll();

    /**
     * 新增
     */
    public void addOne(Dep dep);


    public void addByBatch(List<Dep> deps);
}
