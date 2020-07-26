package com.his.dao;

import com.his.bean.AccountType;
import com.his.bean.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao extends BaseDao {
    public List<Department> GetDepartment() throws Exception {
        List<Department> list = new ArrayList<>();
        Connection conn = getConn();
        String sql = "select * from department";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            int id=rs.getInt(1);
            String DeptCode=rs.getString(2);
            String DeptName=rs.getString(3);
            int DeptCategoryID=rs.getInt(4);
            int DeptType=rs.getInt(5);
            Department department = new Department(id,DeptCode,DeptName,DeptCategoryID,DeptType);
            list.add(department);
        }
        rs.close();
        ps.close();
        conn.close();
        closeConn();
        return list;
    }
}
