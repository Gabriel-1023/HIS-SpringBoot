package com.his.bean.VO;

public class Release {
    public int id;
    public String Name;
    public Double Fee;
    public int Amount;
    public String AddTime;
    public String AddUserName;

    public Release(int id, String name, Double fee, int amount, String addTime, String addUserName) {
        this.id = id;
        Name = name;
        Fee = fee;
        Amount = amount;
        AddTime = addTime;
        AddUserName = addUserName;
    }

    public Release() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getFee() {
        return Fee;
    }

    public void setFee(Double fee) {
        Fee = fee;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getAddTime() {
        return AddTime;
    }

    public void setAddTime(String addTime) {
        AddTime = addTime;
    }

    public String getAddUserName() {
        return AddUserName;
    }

    public void setAddUserName(String addUserName) {
        AddUserName = addUserName;
    }
}
