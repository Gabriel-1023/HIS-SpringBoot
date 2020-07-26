package com.his.dao;

import com.his.bean.MedicalRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MedicalRecordDao extends BaseDao
{
    public void addRecord(MedicalRecord medicalRecord) throws Exception {
        Connection conn = getConn();
        String sql = "insert into medicalrecord(RecordID,RegisterID,info) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,medicalRecord.getRecordID());
        ps.setInt(2,medicalRecord.getRegisterID());
        ps.setString(3,medicalRecord.getInfo());
        ps.executeUpdate();
        ps.close();
        conn.close();
        closeConn();
    }

}
