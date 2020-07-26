package com.his.controller;

import com.his.bean.Register;
import com.his.dao.RegisterDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GetRecordInfo {
    @RequestMapping("/getRecordInfo")
    public Register getRecordInfo(int RecordID) throws Exception {
        RegisterDao registerDao = new RegisterDao();
        Register register=registerDao.selectByRecordID(RecordID);
        return register;
    }
}
