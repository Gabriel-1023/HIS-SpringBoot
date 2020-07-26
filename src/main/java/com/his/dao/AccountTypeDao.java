package com.his.dao;

import com.his.bean.AccountType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountTypeDao extends BaseDao{
    public List<AccountType> GetAccountType() throws Exception {
        List<AccountType> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from accounttype where `Delete`=1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt(1);
            String TypeCode=rs.getString(2);
            String Name=rs.getString(3);
            AccountType accountType = new AccountType(id,TypeCode,Name);
            list.add(accountType);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
}
