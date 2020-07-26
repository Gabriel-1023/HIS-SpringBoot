package com.his.dao;

import com.his.bean.Diagnosis;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DiagnosisDao extends BaseDao
{
    public void addDiagnosis(Diagnosis diagnosis) throws Exception {
        Connection conn = getConn();
        String sql = "insert into diagnosis(RecordID,RegisterID,DiseaseID,SickDate,DiseaseName) values (?,?,?,?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,diagnosis.getRecordID());
        ps.setInt(2,diagnosis.getRegisterID());
        ps.setInt(3,diagnosis.getDiseaseID());
        ps.setString(4,diagnosis.getSickDate());
        ps.setString(5,diagnosis.getDiseaseName());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
