package com.his.controller;

import com.his.bean.Disease;
import com.his.dao.DiseaseDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetDisease {
    @RequestMapping("/getDisease")
    public List<Disease> getDisease(String Name) throws Exception {
        DiseaseDao diseaseDao = new DiseaseDao();
        List<Disease> list = diseaseDao.getDisease(Name);
        return list;
    }
}
