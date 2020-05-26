package com.example.coms.controller;

import com.example.coms.service.SysPermService;
import com.example.coms.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/sys_perm")
public class SysPermController {

    @Autowired
    private SysPermService permService;
    @Autowired
    private ApplicationContext context;

    @GetMapping("/list/all")
    public Result listAllPermission() {
        String tag = "list menu,button,api permissions";
        return Result.succ(tag);
    }
}
