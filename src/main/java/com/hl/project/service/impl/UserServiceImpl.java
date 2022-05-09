package com.hl.project.service.impl;

import com.hl.project.dao.UserMapper;
import com.hl.project.model.User;
import com.hl.project.service.UserService;
import com.hl.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Created by CodeGenerator on 2022/05/09.
*/
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper UserMapper;
}