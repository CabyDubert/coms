package com.example.coms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.coms.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

}
