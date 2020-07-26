package com.his.bean;

public class Department {
    int id;
    String DeptCode;
    String DeptName;
    int DeptCategoryID;
    int DeptType;

    public Department(int id, String deptCode, String deptName, int deptCategoryID, int deptType) {
        this.id = id;
        DeptCode = deptCode;
        DeptName = deptName;
        DeptCategoryID = deptCategoryID;
        DeptType = deptType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptCode() {
        return DeptCode;
    }

    public void setDeptCode(String deptCode) {
        DeptCode = deptCode;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public int getDeptCategoryID() {
        return DeptCategoryID;
    }

    public void setDeptCategoryID(int deptCategoryID) {
        DeptCategoryID = deptCategoryID;
    }

    public int getDeptType() {
        return DeptType;
    }

    public void setDeptType(int deptType) {
        DeptType = deptType;
    }
}
