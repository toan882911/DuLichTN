package com.example.myapplication.model;

public class dataFood {
    String img,img2,img3;
    String name;
    String noidung,noidung2,madulich;

    public dataFood(String name, String noidung, String noidung2,String img,String img2,String img3,String madulich) {
        this.madulich=madulich;
        this.name = name;
        this.noidung = noidung;
        this.noidung2 = noidung2;
        this.img = img;
        this.img2 = img2;
        this.img3 = img3;
        this.madulich=madulich;
    }

    public String getImg() {
        return img;
    }

    public String getImg2() {
        return img2;
    }

    public String getImg3() {
        return img3;
    }

    public String getName() {
        return name;
    }

    public String getNoidung() {
        return noidung;
    }

    public String getNoidung2() {
        return noidung2;
    }

    public String getMadulich() {
        return madulich;
    }
}
