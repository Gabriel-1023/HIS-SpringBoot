package com.his.dao;

import com.his.bean.PresDetail;
import com.his.bean.Register;
import com.his.bean.VO.CashDetail;
import com.his.bean.VO.PresTemplate;
import com.his.bean.VO.Release;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OtherDao extends BaseDao {
    public int GetRecordID() throws Exception {
        Connection conn= getConn();
        int AbleRecordID=0;
        String sql = "select max(RecordID)+1 from register";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next())
        {
            AbleRecordID=rs.getInt(1);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return AbleRecordID;
    }
    public List<CashDetail> getCashList(int RecordID) throws Exception{
        List<CashDetail> list = new ArrayList<>();
        Connection conn = getConn();
//        String sql = "SELECT presdetail.id,DrugsName,DrugsPrice,Amount,AddTime,`Status` from register,prescription,presdetail,drugs where register.id=prescription.RegisterID and prescription.id=presdetail.PresID\n" +
//                "and presdetail.DrugsID=drugs.id and register.RecordID=?  and `Status`=1";
        String sql = "SELECT cashdetail.id,cashdetail.`Name`,Fee,Amount,AddTime,cashdetail.`status`\n" +
                "FROM cashdetail,register\n" +
                "where RecordID=? and cashdetail.RegisterID=register.id AND CashTime is NULL";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,RecordID);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt(1);
            String DrugsName=rs.getString(2);
            Double DrugsPrice=rs.getDouble(3);
            int Amount=rs.getInt(4);
            String AddTime=rs.getString(5);
            int Status=rs.getInt(6);
            CashDetail cashDetail = new CashDetail(id,DrugsName,DrugsPrice,Amount,AddTime,Status);
            list.add(cashDetail);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
    public void cash(int cashid,int SubUserID) throws Exception
    {
        Connection connection = getConn();
        String sql="UPDATE cashdetail set CashTime=?,SubUserID=? where id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ps.setString(1,ft.format(dNow));
        ps.setInt(2,SubUserID);
        ps.setInt(3,cashid);
        ps.executeUpdate();
        ps.close();
        connection.close();
        closeConn();
    }
    public List<Release> getRelease(int RecordID) throws Exception {
        List<Release> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "SELECT cashdetail.id,cashdetail.`Name`,Fee,Amount,AddTime,`user`.`Name`\n" +
                "FROM cashdetail,`user`,register\n" +
                "WHERE cashdetail.AddUserID=`user`.id\n" +
                "and register.id = cashdetail.RegisterID\n" +
                "and cashdetail.CashTime is not null\n" +
                "and RecordID=? and cashdetail.status=1";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,RecordID);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt(1);
            String Name=rs.getString(2);
            Double Fee=rs.getDouble(3);
            int Amount=rs.getInt(4);
            String AddTime=rs.getString(5);
            String AddUserName=rs.getString(6);
            Release release = new Release(id,Name,Fee,Amount,AddTime,AddUserName);
            list.add(release);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
    public void release(int cashid) throws Exception {
        Connection conn = getConn();
        String sql = "update cashdetail set status=2 where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,cashid);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public int getAblePresID()throws Exception
    {
        int id=0;
        Connection conn = getConn();
        String sql="select max(id)+1 from prescription";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            id=rs.getInt(1);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return id;
    }
    public int selectRegisterIDByPresID(int PresID) throws Exception {
        int id=0;
        Connection conn = getConn();
        String sql="select RegisterID from prescription where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,PresID);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            id=rs.getInt(1);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return id;
    }
    public int selectDeptIDByRegisterID(int RegisterID) throws Exception {
        int id=0;
        Connection conn = getConn();
        String sql="select DeptID from register where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,RegisterID);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            id=rs.getInt(1);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return id;
    }
    public Double selectFeeByDrugsID(int DrugsID) throws Exception {
        Double Fee=0.0;
        Connection conn = getConn();
        String sql="select DrugsPrice from Drugs where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,DrugsID);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            Fee=rs.getDouble(1);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return Fee;
    }
    public void insertToCashDetail(PresDetail presDetail, int RegisterID, int DeptID, Double Fee) throws Exception {
        Connection conn = getConn();
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql="insert into cashdetail(RegisterID,`Type`,`Name`,Fee,Amount,DeptID,AddTime,AddUserID)" +
                "values (?,1,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,RegisterID);
        ps.setString(2,presDetail.getDrugsName());
        ps.setDouble(3,Fee);
        ps.setInt(4,presDetail.getAmount());
        ps.setInt(5,DeptID);
        ps.setString(6,ft.format(dNow));
        ps.setInt(7,9);
        ps.executeUpdate();
        ps.close();
        conn.close();
        closeConn();
    }
}
