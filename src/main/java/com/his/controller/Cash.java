package com.his.controller;

import com.his.bean.VO.cashid;
import com.his.dao.OtherDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class Cash
{
    @RequestMapping("/Cash")
    public void cash(@RequestBody List<cashid> list) throws Exception {
        for(cashid i:list)
        {
            System.out.println(i.cashid);
            System.out.println(i.SubUserID);
            OtherDao otherDao = new OtherDao();
            otherDao.cash(i.cashid,i.SubUserID);
        }
    }
}
