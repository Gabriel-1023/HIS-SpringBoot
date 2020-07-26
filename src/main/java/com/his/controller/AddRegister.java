package com.his.controller;

import com.his.bean.Register;
import com.his.dao.RegisterDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddRegister
{
    @RequestMapping("/addRegister")
    public void addRegister(@RequestBody Register register) throws Exception {
        System.out.println(register.getName());
        RegisterDao registerDao = new RegisterDao();
        registerDao.addRegister(register);
    }
}
