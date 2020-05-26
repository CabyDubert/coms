package com.example.coms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.coms.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

}
