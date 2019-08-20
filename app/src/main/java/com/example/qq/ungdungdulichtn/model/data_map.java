package com.example.qq.ungdungdulichtn.model;

public class data_map {
    String name;
    String noidung;
    String img;
    Double x;
    Double y;

    public data_map(String name, String noidung, String img, Double x, Double y) {
        this.name = name;
        this.noidung = noidung;
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
