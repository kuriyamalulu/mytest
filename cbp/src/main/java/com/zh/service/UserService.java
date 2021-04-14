package com.zh.service;
import com.zh.po.User;

import java.util.List;


public interface UserService {
    User getUserByLoginName(String loginName);
    List<User> getAll();
}
