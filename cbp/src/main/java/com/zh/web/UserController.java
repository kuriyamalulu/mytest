package com.zh.web;

import com.zh.po.User;
import com.zh.service.UserService;
import com.zh.web.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseVO<List<User>> getAll(){
        List<User> users = userService.getAll();
        return new ResponseVO<>(users,"查询成功",2000);
    }

    @PostMapping
    public ResponseVO<User> login(@RequestBody User loginUser){
        User user = userService.getUserByLoginName(loginUser.getUserLoginname());
        if (user == null){
            return new ResponseVO<>(null,"登录失败，用户名或密码错误",4000);
        } else if (user.getUserPassword().equals(loginUser.getUserPassword())){
            return new ResponseVO<>(user,"登录成功",2000);
        }
        return new ResponseVO<>(null,"登录失败，用户名或密码错误",4000);
    }
}
