package com.his.controller;

import com.his.bean.Register;
import com.his.dao.RegisterDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetRegisterByRecordID {
    @RequestMapping("/getRegisterByRecordID")
    public List<Register> getRegisterByRecordID(int RecordID) throws Exception {
        RegisterDao registerDao = new RegisterDao();
        List<Register> list = registerDao.selectAllByRecordID(RecordID);
        return list;
    }
}
