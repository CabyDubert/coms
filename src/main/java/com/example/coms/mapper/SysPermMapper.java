package com.example.coms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.coms.entity.SysPerm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysPermMapper extends BaseMapper<SysPerm> {

}
