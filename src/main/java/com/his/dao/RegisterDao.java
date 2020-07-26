package com.his.dao;

import com.his.bean.Register;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterDao extends BaseDao {
    public Register selectByRecordID(int RecordID) throws Exception {
        Register register = null;
        Connection conn = getConn();
        String sql = "select * from register where RecordID=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,RecordID);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            String Name=rs.getString(3);
            int Gender=rs.getInt(4);
            String CardID=rs.getString(5);
            String BirthDate=rs.getString(6);
            String Address=rs.getString(7);
            register = new Register(Name,Gender,CardID,BirthDate,Address);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return register;
    }
    public List<Register> selectRegister(int UserID,int status) throws Exception {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ft2 = new SimpleDateFormat("HH");
        System.out.println("当前时间为: " + ft.format(dNow));
        List<Register> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from register where ArriveTime=? and DetailTime=? and UserID=? and RegisterStatus=? and `Delete`=1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,ft.format(dNow));
        if(Integer.parseInt(ft2.format(dNow))<12)
        {
            ps.setInt(2,1);
            System.out.println("上午");
        }
        else
        {
            ps.setInt(2,2);
            System.out.println("下午");
        }
        ps.setInt(3,UserID);
        ps.setInt(4,status);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int RegisterID = rs.getInt(1);
            int RecordID = rs.getInt(2);
            String Name = rs.getString(3);
            Register register = new Register(RegisterID,RecordID,Name);
            list.add(register);
        }
        return list;
    }
    public void addRegister(Register register) throws Exception {
        Connection conn = getConn();
        String sql = "{CALL AddRegister(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        CallableStatement ps = conn.prepareCall(sql);
        ps.setInt(1,register.getRecordID());
        ps.setString(2,register.getName());
        ps.setInt(3,register.getGender());
        ps.setString(4,register.getCardID());
        ps.setString(5,register.getBirthDate());
        ps.setString(6,register.getAddress());
        ps.setString(7,register.getArriveTime());
        ps.setInt(8,register.getDetailTime());
        ps.setInt(9,register.getDeptID());
        ps.setInt(10,register.getUserID());
        ps.setInt(11,register.getRegisterClassID());
        ps.setInt(12,register.getAccountType());
        ps.setInt(13,register.getRegUserID());
        ps.registerOutParameter(14,Types.VARCHAR);
        ResultSet rs = ps.executeQuery();
        rs.close();
        ps.close();
        conn.close();
    }
    public void changeStatusTo2(int RegisterID) throws Exception {
        Connection conn = this.getConn();
        String sql = "update register set RegisterStatus=2 where id=?";
        PreparedStatement ps =conn.prepareStatement(sql);
        ps.setInt(1,RegisterID);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public List<Register> selectAllByRecordID(int RecordID) throws Exception {
        List<Register> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from register where RecordID=? and `Delete`=1 and ArriveTime=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,RecordID);
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(2,ft.format(dNow));
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt(1);
            String ArriveTime=rs.getString(8);
            int DetailTime = rs.getInt(9);
            int DeptID = rs.getInt(10);
            int RegisterStatus = rs.getInt(16);
            Register register = new Register(id,ArriveTime,DetailTime,DeptID,RegisterStatus);
            list.add(register);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
    public void subRegister(int RegisterID) throws Exception {
        Connection conn = this.getConn();
        String sql = "update register set `Delete`=0 where id=?";
        PreparedStatement ps =conn.prepareStatement(sql);
        ps.setInt(1,RegisterID);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
