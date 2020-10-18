package com.dao;

import com.domain.Emp;

import java.util.List;

public interface EmpDao {
    /**
     * 新增一名员工
     * @param emp
     */
    public void addEmp(Emp emp);

    /**
     * 修改用户信息
     * @param emp
     */
    public void updateEmp(Emp emp);

    /**
     * 条件查找员工信息
     * @param emp
     * @return
     */
    public List<Emp> FindByCondition(Emp emp);




}
