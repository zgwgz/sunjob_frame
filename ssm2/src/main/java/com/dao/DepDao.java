package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.domain.Dep;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface DepDao extends BaseMapper<Dep> {
    public IPage<Map> fenye(IPage<Map> ipage , @Param("p") Map map);
}
