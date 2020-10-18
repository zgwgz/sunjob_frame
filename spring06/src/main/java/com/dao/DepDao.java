package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.Dep;
import org.springframework.stereotype.Repository;

/**
 * 继承 mybatis-plus中的BaseMapper，不需要写方法
 */

@Repository
public interface DepDao extends BaseMapper<Dep> {

}
