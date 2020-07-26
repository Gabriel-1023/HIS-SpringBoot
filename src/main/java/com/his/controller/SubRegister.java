package com.his.controller;

import com.his.dao.RegisterDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SubRegister {
    @RequestMapping("/subRegister")
    public void subRegister(int id) throws Exception {
        RegisterDao registerDao= new RegisterDao();
        registerDao.subRegister(id);
    }
}
