package com.his.bean.VO;

public class CashDetail
{
    public int id;
    public String DrugsName;
    public Double DrugsPrice;
    public int Amount;
    public String AddTime;
    public int Status;

    public CashDetail() {
    }

    public CashDetail(int id, String drugsName, Double drugsPrice, int amount, String addTime, int status) {
        this.id = id;
        DrugsName = drugsName;
        DrugsPrice = drugsPrice;
        Amount = amount;
        AddTime = addTime;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrugsName() {
        return DrugsName;
    }

    public void setDrugsName(String drugsName) {
        DrugsName = drugsName;
    }

    public Double getDrugsPrice() {
        return DrugsPrice;
    }

    public void setDrugsPrice(Double drugsPrice) {
        DrugsPrice = drugsPrice;
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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
