package com.example.myapplication.model;

public class dataHotel {
    String img;
    String name;
    String address;
String madulich;

    public String getMadulich() {
        return madulich;
    }

    public dataHotel(String img, String name, String address, String madulich) {
        this.img = img;
        this.name = name;
        this.address = address;
        this.madulich=madulich;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
