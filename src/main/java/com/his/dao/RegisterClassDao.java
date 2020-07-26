package com.his.dao;

import com.his.bean.RegisterClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegisterClassDao extends BaseDao{
    public List<RegisterClass> GetRegisterClass() throws Exception {
        List<RegisterClass> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from registerclass";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt(1);
            String RegisterCode=rs.getString(2);
            String RegisterName=rs.getString(3);
            int RegisterFee=rs.getInt(4);
            int RegisterLimit=rs.getInt(6);
            RegisterClass registerClass = new RegisterClass(id,RegisterCode,RegisterName,RegisterFee,RegisterLimit);
            list.add(registerClass);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
}
