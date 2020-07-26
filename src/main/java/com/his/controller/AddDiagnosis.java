package com.his.controller;

import com.his.bean.Diagnosis;
import com.his.bean.Disease;
import com.his.dao.DiagnosisDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AddDiagnosis {
    @RequestMapping("/addDiagnosis")
    public void addDiagnosis(@RequestBody Diagnosis diagnosis) throws Exception {
        System.out.println(diagnosis.DiseaseName);
        DiagnosisDao diagnosisDao = new DiagnosisDao();
        diagnosisDao.addDiagnosis(diagnosis);

    }
}
