package com.his.controller;

import com.his.bean.PresDetail;
import com.his.dao.OtherDao;
import com.his.dao.PresDetailDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddDetail {
    @RequestMapping("/addDetail")
    public void addDetail(@RequestBody PresDetail presDetail) throws Exception {
        System.out.println(presDetail.getPresID());
        PresDetailDao presDetailDao = new PresDetailDao();
        presDetailDao.addPresDetail(presDetail);
        OtherDao otherDao=new OtherDao();
        int RegisterID = otherDao.selectRegisterIDByPresID(presDetail.getPresID());
        OtherDao otherDao2=new OtherDao();
        int DeptID = otherDao2.selectDeptIDByRegisterID(RegisterID);
        OtherDao otherDao3=new OtherDao();
        Double Fee = otherDao3.selectFeeByDrugsID(presDetail.getDrugsID());
        OtherDao otherDao4=new OtherDao();
        otherDao4.insertToCashDetail(presDetail,RegisterID,DeptID,Fee);
    }
}
