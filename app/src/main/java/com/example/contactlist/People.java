package com.example.contactlist;

public class People {
    private int facePicture;
    private String nameOfPeople, mail, phoneNumber;

    public People(int facePicture, String nameOfPeople, String mail, String phoneNumber) {
        this.facePicture = facePicture;
        this.nameOfPeople = nameOfPeople;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public int getFacePicture() {
        return facePicture;
    }

    public String getNameOfPeople() {
        return nameOfPeople;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
