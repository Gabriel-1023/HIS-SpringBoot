package com.his.bean;

public class PresTemplate
{
    int id;
    String Name;
    int UserID;
    String CreationDate;
    int UseRange;

    public PresTemplate() {
    }

    public PresTemplate(int id, String name, int useRange) {
        this.id = id;
        Name = name;
        UseRange = useRange;
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

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public int getUseRange() {
        return UseRange;
    }

    public void setUseRange(int useRange) {
        UseRange = useRange;
    }
}
