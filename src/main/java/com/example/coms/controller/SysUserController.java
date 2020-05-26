package com.example.coms.controller;

import com.example.coms.service.SysRoleService;
import com.example.coms.service.SysUserRoleService;
import com.example.coms.service.SysUserService;
import com.example.coms.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/sys_user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    @PostMapping
    public Result add(@RequestBody String body) {
        String tag = "add sys user";
        log.info("{}, body: {}", tag, body);
        return Result.succ(tag);
    }
}
