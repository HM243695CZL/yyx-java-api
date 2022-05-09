package com.hl.project.controller;
import com.hl.project.core.Result;
import com.hl.project.core.ResultGenerator;
import com.hl.project.model.User;
import com.hl.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2022/05/09.
*/
@RestController
@Api(tags = {"用户管理"})
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/create")
    public Result create(@RequestBody User user) {
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
    @ApiOperation("获取所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码"),
            @ApiImplicitParam(name = "size", value = "每页条数")
    })
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.list();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}