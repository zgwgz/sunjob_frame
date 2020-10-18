package com.dao;

import com.domain.Dep;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepDao {

    /**
     * 查找所有dep
     * @return
     */
    public List<Dep> findAll();

    /**
     * 删除
     * @param id
     */
    public void deleteDep(Integer id);

}
