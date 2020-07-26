package com.his.controller;

import com.his.bean.MedicalRecord;
import com.his.dao.MedicalRecordDao;
import com.his.dao.RegisterDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddRecord {
    @RequestMapping("/addRecord")
    public void addRecord(@RequestBody MedicalRecord medicalRecord) throws Exception {
        System.out.println(medicalRecord.getInfo());
        MedicalRecordDao medicalRecordDao = new MedicalRecordDao();
        medicalRecordDao.addRecord(medicalRecord);
        RegisterDao registerDao = new RegisterDao();
        registerDao.changeStatusTo2(medicalRecord.getRegisterID());
    }
}

