package com.his.bean;

public class RegisterClass
{
    int id;
    String RegisterCode;
    String RegisterName;
    int RegisterFee;
    int RegisterLimit;

    public RegisterClass(int id, String registerCode, String registerName, int registerFee, int registerLimit) {
        this.id = id;
        RegisterCode = registerCode;
        RegisterName = registerName;
        RegisterFee = registerFee;
        RegisterLimit = registerLimit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegisterCode() {
        return RegisterCode;
    }

    public void setRegisterCode(String registerCode) {
        RegisterCode = registerCode;
    }

    public String getRegisterName() {
        return RegisterName;
    }

    public void setRegisterName(String registerName) {
        RegisterName = registerName;
    }

    public int getRegisterFee() {
        return RegisterFee;
    }

    public void setRegisterFee(int registerFee) {
        RegisterFee = registerFee;
    }

    public int getRegisterLimit() {
        return RegisterLimit;
    }

    public void setRegisterLimit(int registerLimit) {
        RegisterLimit = registerLimit;
    }
}
