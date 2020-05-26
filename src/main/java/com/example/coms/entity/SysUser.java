package com.example.coms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Long uid;

    /**
     * 主库uid
     */
    @TableField(value = "master_uid")
    private Long masterUid;
    /**
     * 登录名，不可改
     */
    private String uname;
    /**
     * 用户昵称，可改
     */
    private String nick;
    /**
     * 已加密的登录密码
     */
    private String pwd;
    /**
     * 加密盐值
     */
    private String salt;
    /**
     * 是否锁定
     */
    @TableField(value = "is_lock")
    private Boolean lock;
    /**
     * 用户类型 1 超级管理员 2 多仓库管理员 3 仓库操作员
     */
    @TableField(value = "user_type")
    private Integer userType;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 修改时间
     */
    private Date updated;


    @Override
    protected Serializable pkVal() {
        return uid;
    }

    @TableField(exist = false)
    private List<SysRole> roleList = new ArrayList<>();    //用户所有角色值，在管理后台显示用户的角色
    @TableField(exist = false)
    private Set<AuthVo> roles = new HashSet<>();    //用户所有角色值，用于shiro做角色权限的判断
    @TableField(exist = false)
    private Set<AuthVo> perms = new HashSet<>();    //用户所有权限值，用于shiro做资源权限的判断
    @TableField(exist = false)
    private String warehouse;
}
