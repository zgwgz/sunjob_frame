package com.dao;

import com.domain.Dep;

import java.util.List;

public interface DepDao {
    /**
     * 查询所有的数据
     * @return
     */
    public List<Dep> findAll();

    /**
     * 插入一条数据
     * @param dep
     */
    public int addOne(Dep dep);

    /**
     * 修改一条数据
     * @param dep
     */
    public void updateOne(Dep dep);

    /**
     * 删除一条数据
     * @param id
     */
    public void deleteOne(Integer id);

}
