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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_perm")
public class SysPerm extends Model<SysPerm> {

    @TableId(type = IdType.INPUT)
    private String pval;    // 权限值，shiro的权限控制表达式
    private String parent;  // 父节点权限值
    private String pname;   // 权限名称
    private Integer ptype;  // 权限类型：1.菜单；2.按钮
    private Boolean leaf;   // 是否叶子节点
    private Date created;   // 创建时间
    private Date updated;   // 修改时间

    @TableField(exist = false)
    private List<SysPerm> children = new ArrayList<>();

    @Override
    protected Serializable pkVal() {
        return pval;
    }

}
