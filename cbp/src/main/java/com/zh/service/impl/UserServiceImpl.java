package com.zh.service.impl;
import com.zh.dao.UserMapper;
import com.zh.po.User;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
@Transactional//SpringBoot推荐基于注解进行事务控制
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByLoginName(String loginName) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userLoginname",loginName);
        User user = userMapper.selectOneByExample(example);
        return user;
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }
}
