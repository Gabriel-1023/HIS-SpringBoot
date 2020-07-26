package com.his.dao;

import com.his.bean.Disease;
import com.his.dao.BaseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DiseaseDao extends BaseDao {
    public List<Disease> getDisease(String Name) throws Exception {
        List<Disease> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from disease where (DiseaseName like ? or DiseaseName like ? or DiseaseName like ?) limit 10 ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"%"+Name+"%");
        ps.setString(2,Name+"%");
        ps.setString(3,"%"+Name);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String DiseaseCode = rs.getString(2);
            String DiseaseName = rs.getString(3);
            String DiseaseICD = rs.getString(4);
            int DiseCategoryID = rs.getInt(5);
            Disease disease = new Disease(id,DiseaseCode,DiseaseName,DiseaseICD,DiseCategoryID);
            list.add(disease);
        }
        return list;
    }

}
