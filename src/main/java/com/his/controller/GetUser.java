package com.his.controller;

import com.his.bean.User;
import com.his.dao.UserDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetUser {
    @RequestMapping("/getUser")
    public List<User> getUser(int selectDept,int selectRegisterClass) throws Exception {
        UserDao userDao = new UserDao();
        List<User> list = userDao.selectUser(selectDept,selectRegisterClass);
        return list;
    }
}
