package com.his.bean;

public class User {
    public int id;
    public String LoginId;
    public String Password;
    public String Name;
    public int IsShift;
    public int TitleID;
    public int UserType;
    public int DeptID;
    public int RegisterClassID;
    public int Delete;

    public User(int id, String loginId, String password, String name, int isShift, int titleID, int userType, int deptID, int registerClassID, int delete) {
        this.id = id;
        LoginId = loginId;
        Password = password;
        Name = name;
        IsShift = isShift;
        TitleID = titleID;
        UserType = userType;
        DeptID = deptID;
        RegisterClassID = registerClassID;
        Delete = delete;
    }

    public User(int id, String name) {
        this.id = id;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String loginId) {
        LoginId = loginId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIsShift() {
        return IsShift;
    }

    public void setIsShift(int isShift) {
        IsShift = isShift;
    }

    public int getTitleID() {
        return TitleID;
    }

    public void setTitleID(int titleID) {
        TitleID = titleID;
    }

    public int getUserType() {
        return UserType;
    }

    public void setUserType(int userType) {
        UserType = userType;
    }

    public int getDeptID() {
        return DeptID;
    }

    public void setDeptID(int deptID) {
        DeptID = deptID;
    }

    public int getRegisterClassID() {
        return RegisterClassID;
    }

    public void setRegisterClassID(int registerClassID) {
        RegisterClassID = registerClassID;
    }

    public int getDelete() {
        return Delete;
    }

    public void setDelete(int delete) {
        Delete = delete;
    }
}
