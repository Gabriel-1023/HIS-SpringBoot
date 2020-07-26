package com.his.controller;

import com.his.bean.PresTemplate;
import com.his.dao.PresTempDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetTemplate {
    @RequestMapping("/getTemplate")
    public List<PresTemplate> getTemplate() throws Exception {
        PresTempDao presTempDao = new PresTempDao();
        List<PresTemplate> list = presTempDao.getTemplate();
        return list;
    }
}
