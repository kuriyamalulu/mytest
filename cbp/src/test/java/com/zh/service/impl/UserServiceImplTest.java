package com.zh.service.impl;

import com.zh.po.User;
import com.zh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserByLoginName() {
        User user = userService.getUserByLoginName("zhangsan");
        System.out.println(user);
    }

//    @Test
//    public void getAll() {
//        List<User> all = userService.getAll();
//        for (User user : all) {
//            System.out.println(user);
//        }
//    }
}
