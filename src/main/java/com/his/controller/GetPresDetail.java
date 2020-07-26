package com.his.controller;

import com.his.bean.PresDetail;
import com.his.dao.PresDetailDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.util.List;

@CrossOrigin
@RestController
public class GetPresDetail {
    @RequestMapping("/getPresDetail")
    public List<PresDetail> getPresDetail(int id) throws Exception {
        PresDetailDao presDetailDao= new PresDetailDao();
        List<PresDetail> list = presDetailDao.getPresDetail(id);
        return list;
    }
}
