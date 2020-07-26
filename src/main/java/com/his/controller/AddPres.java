package com.his.controller;

import com.his.bean.VO.PresTemplate;
import com.his.dao.PrescriptionDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddPres {
    @RequestMapping("/addPres")
    public int addPres(@RequestBody PresTemplate presTemplate) throws Exception {
        PrescriptionDao prescriptionDao = new PrescriptionDao();
        int id = prescriptionDao.addPres(presTemplate);
        return id;
    }
}
