package com.his.controller;

import com.his.bean.AccountType;
import com.his.bean.Department;
import com.his.dao.DepartmentDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetDepartment {
    @RequestMapping(value = "/getDepartment")
    public List<Department> getDepartment() throws Exception {
        DepartmentDao departmentDao = new DepartmentDao();
        List<Department> list=departmentDao.GetDepartment();
        return list;
    }
}
