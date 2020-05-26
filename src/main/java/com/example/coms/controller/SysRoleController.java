package com.example.coms.controller;

import com.example.coms.service.SysPermService;
import com.example.coms.service.SysRolePermService;
import com.example.coms.service.SysRoleService;
import com.example.coms.service.SysUserRoleService;
import com.example.coms.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/sys_role")
public class SysRoleController {

    @Autowired
    private SysRoleService roleService;
    @Autowired
    private SysPermService permService;
    @Autowired
    private SysUserRoleService userRoleService;
    @Autowired
    private SysRolePermService rolePermService;

    @PostMapping
    public Result add(@RequestBody String body) {
        String tag = "add role";
        return Result.succ(tag);
    }

}
