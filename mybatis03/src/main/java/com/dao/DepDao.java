package com.dao;

import com.domain.Dep;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
    @Insert("insert into dep(depname)values(#{depname})")
    //
    @Options(useGeneratedKeys = true,keyProperty = "depid")
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

    /**
     * 物理的分页查询
     * @param map
     */
    public List<Dep> findByFenYe(Map map);

}
