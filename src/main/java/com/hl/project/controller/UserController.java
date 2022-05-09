package com.hl.project.controller;
import com.hl.project.core.Result;
import com.hl.project.core.ResultGenerator;
import com.hl.project.model.User;
import com.hl.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2022/05/09.
*/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/create")
    public Result create(User user) {
        userService.create(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        userService.delete(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/view")
    public Result view(@RequestParam String id) {
        User user = userService.view(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.list();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}