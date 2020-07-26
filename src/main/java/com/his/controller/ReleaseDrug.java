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
public class ReleaseDrug {
    @RequestMapping("/releaseDrug")
    public void releaseDrug(@RequestBody List<cashid> list) throws Exception {
        for(cashid i:list)
        {
            System.out.println(i.cashid);
            System.out.println(i.SubUserID);
            OtherDao otherDao = new OtherDao();
            otherDao.release(i.cashid);
        }
    }
}
