package com.his.dao;



import com.his.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends BaseDao{
    public User selectById(String LoginId) throws Exception {
        User u = null;
        Connection conn = getConn();
        String sql = "select * from user where LoginId=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,LoginId);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            int id=rs.getInt(1);
            String Password=rs.getString(3);
            String Name=rs.getString(4);
            int IsShift=rs.getInt(5);
            int TitleID=rs.getInt(6);
            int UserType=rs.getInt(7);
            int DeptID=rs.getInt(8);
            int RegisterClassID=rs.getInt(9);
            int Delete=rs.getInt(10);
            u=new User(id,LoginId,Password,Name,IsShift,TitleID,UserType,DeptID,RegisterClassID,Delete);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return u;
    }
    public List<User> selectUser(int DeptID,int RegisterClassID) throws Exception {
        List<User> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from user where DeptID=? and RegisterClassID=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,DeptID);
        ps.setInt(2,RegisterClassID);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String Name = rs.getString(4);
            User u = new User(id,Name);
            list.add(u);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
}
