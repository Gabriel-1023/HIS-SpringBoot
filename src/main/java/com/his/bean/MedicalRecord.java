package com.his.bean;

public class MedicalRecord
{
    public int id;
    public int RecordID;
    public int RegisterID;
    public String info;

    public MedicalRecord() {
    }

    public MedicalRecord(int recordID, int registerID, String info) {
        RecordID = recordID;
        RegisterID = registerID;
        this.info = info;
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

    public int getRegisterID() {
        return RegisterID;
    }

    public void setRegisterID(int registerID) {
        RegisterID = registerID;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
