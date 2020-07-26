package com.his.controller;

import com.his.bean.VO.Release;
import com.his.dao.OtherDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetRelease {
    @RequestMapping("/getRelease")
    public List<Release> getRelease(int RecordID) throws Exception {
        OtherDao otherDao = new OtherDao();
        List<Release> list = otherDao.getRelease(RecordID);
        return list;
    }
}
