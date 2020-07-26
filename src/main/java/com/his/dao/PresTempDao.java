package com.his.dao;

import com.his.bean.PresTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PresTempDao extends BaseDao {
    public List<PresTemplate> getTemplate() throws Exception {
        List<PresTemplate> list = new ArrayList<>();
        Connection conn= getConn();
        String sql = "select * from prescriptiontemplate";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id = rs.getInt(1);
            String Name = rs.getString(2);
            int UseRange = rs.getInt(5);
            PresTemplate presTemplate = new PresTemplate(id,Name,UseRange);
            list.add(presTemplate);
        }
        return list;
    }
    public int addTemp(com.his.bean.VO.PresTemplate p) throws Exception {
        Connection conn = getConn();
        String sql = "{CALL AddTemp(?,?,?,?,?,?)}";
        CallableStatement ps = conn.prepareCall(sql);
        ps.setInt(1,p.getRecordID());
        ps.setInt(2,p.getRegisterID());
        ps.setInt(3,p.getUserID());
        ps.setString(4,p.getName());
        ps.setInt(5,p.getPresID());
        ps.registerOutParameter(6, Types.INTEGER);
        ResultSet rs = ps.executeQuery();
        int PresID = ps.getInt(6);
        rs.close();
        ps.close();
        conn.close();
        return PresID;
    }
}
