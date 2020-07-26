package com.his.controller;

import com.his.bean.Register;
import com.his.bean.User;
import com.his.dao.RegisterDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetRegister {
    @RequestMapping("/getRegister")
    public List<Register> getRegister(int UserID,int Status) throws Exception {
        RegisterDao registerDao = new RegisterDao();
        List<Register> list = registerDao.selectRegister(UserID,Status);
        return list;
    }
}
