package com.example.coms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_role_perm")
public class SysRolePerm implements Serializable {
    @TableId(type = IdType.NONE)
    @TableField("role_id")
    private Long roleId;
    @TableField("perm_val")
    private String permVal;
    @TableField("perm_type")
    private Integer permType;

}
