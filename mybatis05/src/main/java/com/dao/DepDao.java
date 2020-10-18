package com.dao;

import com.domain.Dep;

import java.util.List;

public interface DepDao {

    /**延迟加载
     * 一对多查询
     * @param depid
     * @return
     */
    public Dep findById(Integer depid);

    /**
     * 一次性的一对多查询
     * @param depid
     * @return
     */
    public Dep findById2(Integer depid);

    /**
     * 使用过分页插件
     * @return
     */
    public List<Dep> fy();
}
