package com.his.dao;

import com.his.bean.PresDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PresDetailDao extends BaseDao {
    public List<PresDetail> getPresDetail(int id) throws Exception {
        List<PresDetail> list = new ArrayList<>();
        Connection conn =getConn();
        String sql="select presdetail.id,DrugsID,DrugsName,UseMethod,UseAmount,Frequency,Amount,Status from presdetail,drugs where PresID=? and drugs.id=presdetail.DrugsID";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int PresDetailID=rs.getInt(1);
            int DrugsID=rs.getInt(2);
            String DrugsName=rs.getString(3);
            String UseMethod=rs.getString(4);
            String UseAmount=rs.getString(5);
            String Frequency=rs.getString(6);
            int Amount=rs.getInt(7);
            int Status=rs.getInt(8);
            PresDetail presDetail = new PresDetail(PresDetailID,id,DrugsID,DrugsName,UseMethod,UseAmount,Frequency,Amount,Status);
            list.add(presDetail);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
    public void addPresDetail(PresDetail presDetail) throws Exception
    {
        Connection conn = getConn();
        String sql="insert into presdetail values (null,?,?,?,?,?,?,1)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,presDetail.getPresID());
        ps.setInt(2,presDetail.getDrugsID());
        ps.setString(3,presDetail.getUseMethod());
        ps.setString(4,presDetail.getUseAmount());
        ps.setString(5,presDetail.getFrequency());
        ps.setInt(6,presDetail.getAmount());
        ps.executeUpdate();
        ps.close();
        conn.close();
        closeConn();
    }
}
