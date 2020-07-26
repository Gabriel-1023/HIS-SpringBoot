package com.his.controller;

import com.his.bean.User;
import com.his.bean.VO.LoginIdPassword;
import com.his.dao.UserDao;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class Login {
    @RequestMapping(value = "/login")
    public User login(@RequestBody LoginIdPassword loginIdPassword) throws Exception {
        UserDao userDao = new UserDao();
        User u =userDao.selectById(loginIdPassword.getLoginId());
        if(u.getPassword().equals(loginIdPassword.getPassword()))
        {
            System.out.println(loginIdPassword.getLoginId()+" "+loginIdPassword.getPassword());
            System.out.println("登录成功");
            u.setPassword("");
            return u;
        }
        else
        {
            System.out.println(loginIdPassword.getLoginId()+" "+loginIdPassword.getPassword());
            System.out.println(u.getPassword());
            System.out.println("登录失败");
            return null;
        }
    }
}
