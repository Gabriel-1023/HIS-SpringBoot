package com.his.bean;

public class Register
{
    public int id;
    public int RecordID;
    public String Name;
    public int Gender;
    public String CardID;
    public String BirthDate;
    public String Address;
    public String ArriveTime;
    public int DetailTime;
    public int DeptID;
    public int UserID;
    public int RegisterClassID;
    public int AccountType;
    public String RegisterTime;
    public int RegUserID;
    public int RegisterStatus;

    public Register() {
    }

    public Register(String name, int gender, String cardID, String birthDate, String address) {
        Name = name;
        Gender = gender;
        CardID = cardID;
        BirthDate = birthDate;
        Address = address;
    }

    public Register(int id, int recordID, String name) {
        this.id = id;
        RecordID = recordID;
        Name = name;
    }

    public Register(int id, String arriveTime, int detailTime, int deptID, int registerStatus) {
        this.id = id;
        ArriveTime = arriveTime;
        DetailTime = detailTime;
        DeptID = deptID;
        RegisterStatus = registerStatus;
    }

    public Register(int recordID, String name, int gender, String cardID, String birthDate, String address, String arriveTime, int detailTime, int deptID, int userID, int registerClassID, int accountType, int regUserID) {
        RecordID = recordID;
        Name = name;
        Gender = gender;
        CardID = cardID;
        BirthDate = birthDate;
        Address = address;
        ArriveTime = arriveTime;
        DetailTime = detailTime;
        DeptID = deptID;
        UserID = userID;
        RegisterClassID = registerClassID;
        AccountType = accountType;
        RegUserID = regUserID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecordID() {
        return RecordID;
    }

    public void setRecordID(int recordID) {
        RecordID = recordID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String cardID) {
        CardID = cardID;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getArriveTime() {
        return ArriveTime;
    }

    public void setArriveTime(String arriveTime) {
        ArriveTime = arriveTime;
    }

    public int getDetailTime() {
        return DetailTime;
    }

    public void setDetailTime(int detailTime) {
        DetailTime = detailTime;
    }

    public int getDeptID() {
        return DeptID;
    }

    public void setDeptID(int deptID) {
        DeptID = deptID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getRegisterClassID() {
        return RegisterClassID;
    }

    public void setRegisterClassID(int registerClassID) {
        RegisterClassID = registerClassID;
    }

    public int getAccountType() {
        return AccountType;
    }

    public void setAccountType(int accountType) {
        AccountType = accountType;
    }

    public String getRegisterTime() {
        return RegisterTime;
    }

    public void setRegisterTime(String registerTime) {
        RegisterTime = registerTime;
    }

    public int getRegUserID() {
        return RegUserID;
    }

    public void setRegUserID(int regUserID) {
        RegUserID = regUserID;
    }

    public int getRegisterStatus() {
        return RegisterStatus;
    }

    public void setRegisterStatus(int registerStatus) {
        RegisterStatus = registerStatus;
    }
}
