package com.his.dao;

import com.his.bean.VO.PresTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrescriptionDao extends BaseDao {
    public int addPres(PresTemplate presTemplate) throws Exception {
        OtherDao otherDao = new OtherDao();
        int id = otherDao.getAblePresID();
        Connection conn = getConn();
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql="insert into prescription values (?,?,?,?,?,?,1)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setInt(2,presTemplate.getRecordID());
        ps.setInt(3,presTemplate.getRegisterID());
        ps.setInt(4,presTemplate.getUserID());
        ps.setString(5,presTemplate.getName());
        ps.setString(6,ft.format(dNow));
        ps.executeUpdate();
        ps.close();
        conn.close();
        closeConn();
        return id;
    }
}
