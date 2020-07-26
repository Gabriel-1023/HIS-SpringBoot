package com.his;

import com.his.bean.Register;
import com.his.dao.RegisterDao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test
{
    public static void main(String[] args) throws Exception {
        Register register = new Register(111,"张三",71,"12323213","2000-01-11","上海","2020-07-17",2,1,1,1,1,10);
        RegisterDao registerDao = new RegisterDao();
        registerDao.addRegister(register);
    }
}
