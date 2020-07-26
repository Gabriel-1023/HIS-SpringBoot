package com.his.controller;

import com.his.bean.RegisterClass;
import com.his.dao.RegisterClassDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetRegisterClass {
    @RequestMapping("/getRegisterClass")
    public List<RegisterClass> getRegisterClass() throws Exception {
        RegisterClassDao registerClassDao = new RegisterClassDao();
        List<RegisterClass> list = registerClassDao.GetRegisterClass();
        return list;
    }
}
