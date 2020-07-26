package com.his.bean;

public class Disease
{
    public int id;
    public String DiseaseCode;
    public String DiseaseName;
    public String DiseaseICD;
    public int DiseCategoryID;

    public Disease() {
    }

    public Disease(String diseaseName, String diseaseICD) {
        DiseaseName = diseaseName;
        DiseaseICD = diseaseICD;
    }

    public Disease(int id, String diseaseCode, String diseaseName, String diseaseICD, int diseCategoryID) {
        this.id = id;
        DiseaseCode = diseaseCode;
        DiseaseName = diseaseName;
        DiseaseICD = diseaseICD;
        DiseCategoryID = diseCategoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiseaseCode() {
        return DiseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        DiseaseCode = diseaseCode;
    }

    public String getDiseaseName() {
        return DiseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        DiseaseName = diseaseName;
    }

    public String getDiseaseICD() {
        return DiseaseICD;
    }

    public void setDiseaseICD(String diseaseICD) {
        DiseaseICD = diseaseICD;
    }

    public int getDiseCategoryID() {
        return DiseCategoryID;
    }

    public void setDiseCategoryID(int diseCategoryID) {
        DiseCategoryID = diseCategoryID;
    }
}
