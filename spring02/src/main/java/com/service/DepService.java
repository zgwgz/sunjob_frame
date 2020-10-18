package com.service;

import com.domain.Dep;

import java.util.List;

public interface DepService {

    /**
     * 查找所有dep
     * @return
     */
    public List<Dep> findAll();
}
