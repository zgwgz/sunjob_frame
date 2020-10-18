package com.dao;

import com.domain.Emp;

import java.util.Set;

public interface EmpDao {
    /**
     * 通过depid查找 emp
     * @param did
     * @return
     */
   public Set<Emp> findByDid(Integer did);

    /**
     * 实现多对一 或者一对一
     * @param empid
     * @return
     */
  public Emp findById(Integer empid);
}
