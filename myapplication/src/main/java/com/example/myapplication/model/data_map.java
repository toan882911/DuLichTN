package com.example.myapplication.model;

public class data_map implements Idata_map{
    String name;
    String noidung,noidung2;
    String img,img2,img3,madulich;
    Double x;
    Double y;
    public data_map(String madulich, String name, String noidung, String noidung2, String img, String img2, String img3, Double x, Double y) {
        this.madulich=madulich;
        this.name = name;
        this.noidung = noidung;
        this.noidung2 = noidung2;
        this.img = img;
        this.img2 = img2;
        this.img3 = img3;
        this.x = x;
        this.y = y;
    }


    @Override
    public String getMadulich() {
        return madulich;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNoiDung() {
        return noidung;
    }

    @Override
    public String getNoiDung2() {
        return noidung2;
    }

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public String getImg2() {
        return img2;
    }

    @Override
    public String getImg3() {
        return img3;
    }

    @Override
    public Double getX() {
        return x;
    }

    @Override
    public Double getY() {
        return y;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNoidung() {
//        return noidung;
//    }
//
//    public void setNoidung(String noidung) {
//        this.noidung = noidung;
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img;
//    }
//
//    public Double getX() {
//        return x;
//    }
//
//    public void setX(Double x) {
//        this.x = x;
//    }
//
//    public Double getY() {
//        return y;
//    }
//
//    public void setY(Double y) {
//        this.y = y;
//    }
}
