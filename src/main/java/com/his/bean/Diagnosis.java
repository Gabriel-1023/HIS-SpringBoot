package com.his.bean;

public class Diagnosis
{
    public int id;
    public int RecordID;
    public int RegisterID;
    public int DiseaseID;
    public String DiseaseName;
    public String SickDate;

    public Diagnosis() {
    }

    public Diagnosis(int recordID, int registerID, int diseaseID, String diseaseName, String sickDate) {
        RecordID = recordID;
        RegisterID = registerID;
        DiseaseID = diseaseID;
        DiseaseName = diseaseName;
        SickDate = sickDate;
    }

    public String getDiseaseName() {
        return DiseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        DiseaseName = diseaseName;
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

    public int getDiseaseID() {
        return DiseaseID;
    }

    public void setDiseaseID(int diseaseID) {
        DiseaseID = diseaseID;
    }

    public String getSickDate() {
        return SickDate;
    }

    public void setSickDate(String sickDate) {
        SickDate = sickDate;
    }
}
