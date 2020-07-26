package com.his.bean;

public class Drug {
    public int id;
    public String DrugsName;
    public String DrugsFormat;
    public String DrugsUnit;
    public String DrugsDosage;

    public Drug() {
    }

    public Drug(int id, String drugsName, String drugsFormat, String drugsUnit, String drugsDosage) {
        this.id = id;
        DrugsName = drugsName;
        DrugsFormat = drugsFormat;
        DrugsUnit = drugsUnit;
        DrugsDosage = drugsDosage;
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

    public String getDrugsFormat() {
        return DrugsFormat;
    }

    public void setDrugsFormat(String drugsFormat) {
        DrugsFormat = drugsFormat;
    }

    public String getDrugsUnit() {
        return DrugsUnit;
    }

    public void setDrugsUnit(String drugsUnit) {
        DrugsUnit = drugsUnit;
    }

    public String getDrugsDosage() {
        return DrugsDosage;
    }

    public void setDrugsDosage(String drugsDosage) {
        DrugsDosage = drugsDosage;
    }
}
