package com.his.bean;

public class AccountType
{
    int id;
    String TypeCode;
    String Name;

    public AccountType(int id, String typeCode, String name) {
        this.id = id;
        TypeCode = typeCode;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String typeCode) {
        TypeCode = typeCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
