package com.his.controller;

import com.his.bean.VO.CashDetail;
import com.his.dao.OtherDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetCashDetail {
    @RequestMapping("/getCashDetail")
    public List<CashDetail> getCashDetail(int RecordID) throws Exception {
        OtherDao otherDao = new OtherDao();
        List<CashDetail> list = otherDao.getCashList(RecordID);
        return list;
    }
}
