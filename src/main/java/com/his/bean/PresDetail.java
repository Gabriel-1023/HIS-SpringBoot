package com.his.bean;

public class PresDetail {
    public int id;
    public int PresID;
    public int DrugsID;
    public String DrugsName;
    public String UseMethod;
    public String UseAmount;
    public String Frequency;
    public int Amount;
    public int Status;

    public PresDetail() {
    }

    public PresDetail(int id, int presID, int drugsID, String drugsName, String useMethod, String useAmount, String frequency, int amount, int status) {
        this.id = id;
        PresID = presID;
        DrugsID = drugsID;
        DrugsName = drugsName;
        UseMethod = useMethod;
        UseAmount = useAmount;
        Frequency = frequency;
        Amount = amount;
        Status = status;
    }

    public String getDrugsName() {
        return DrugsName;
    }

    public void setDrugsName(String drugsName) {
        DrugsName = drugsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPresID() {
        return PresID;
    }

    public void setPresID(int presID) {
        PresID = presID;
    }

    public int getDrugsID() {
        return DrugsID;
    }

    public void setDrugsID(int drugsID) {
        DrugsID = drugsID;
    }

    public String getUseMethod() {
        return UseMethod;
    }

    public void setUseMethod(String useMethod) {
        UseMethod = useMethod;
    }

    public String getUseAmount() {
        return UseAmount;
    }

    public void setUseAmount(String useAmount) {
        UseAmount = useAmount;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String frequency) {
        Frequency = frequency;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
