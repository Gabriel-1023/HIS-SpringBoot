package com.his.controller;

import com.his.dao.OtherDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GetRecordID {
    @RequestMapping("/getRecordID")
    public int getRecordID() throws Exception {
        OtherDao otherDao = new OtherDao();
        int AbleRecordID = otherDao.GetRecordID();
        return AbleRecordID;
    }
}
