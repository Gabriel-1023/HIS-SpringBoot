package com.his.dao;

import com.his.bean.Disease;
import com.his.bean.Drug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DrugDao extends BaseDao {
    public List<Drug> getDrug(String Name) throws Exception {
        List<Drug> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from drugs,constantitem where (DrugsName like ? or DrugsName like ? or DrugsName like ?) and DrugsDosageID=constantitem.id limit 10 ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"%"+Name+"%");
        ps.setString(2,Name+"%");
        ps.setString(3,"%"+Name);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String DrugsName = rs.getString(3);
            String DrugsFormat = rs.getString(4);
            String DrugsUnit = rs.getString(5);
            String DrugsDosage = rs.getString("ConstantName");
            Drug drug = new Drug(id,DrugsName,DrugsFormat,DrugsUnit,DrugsDosage);
            list.add(drug);
        }
        return list;
    }
}
