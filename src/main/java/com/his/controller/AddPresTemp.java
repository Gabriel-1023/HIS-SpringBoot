package com.his.controller;

import com.his.bean.VO.PresTemplate;
import com.his.dao.OtherDao;
import com.his.dao.PresTempDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddPresTemp
{
    @RequestMapping("/addPresTemp")
    public int addPresTemp(@RequestBody PresTemplate p) throws Exception {
        PresTempDao presTempDao = new PresTempDao();
        int PresID = presTempDao.addTemp(p);
        return PresID;
    }
}
