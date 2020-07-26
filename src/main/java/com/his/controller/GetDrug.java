package com.his.controller;

import com.his.bean.Drug;
import com.his.dao.DrugDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetDrug {
    @RequestMapping("/getDrug")
    public List<Drug> getDrug(String Name) throws Exception {
        DrugDao drugDao = new DrugDao();
        List<Drug> list = drugDao.getDrug(Name);
        return list;
    }
}
