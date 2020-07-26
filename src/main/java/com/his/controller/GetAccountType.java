package com.his.controller;

import com.his.bean.AccountType;
import com.his.dao.AccountTypeDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GetAccountType {
    @RequestMapping(value = "/getAccountType")
    public List<AccountType> getAccountType() throws Exception {
        AccountTypeDao accountTypeDao = new AccountTypeDao();
        List<AccountType> list = accountTypeDao.GetAccountType();
        return list;
    }
}
