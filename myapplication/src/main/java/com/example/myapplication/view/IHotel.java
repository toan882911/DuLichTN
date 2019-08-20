package com.example.myapplication.view;

import android.content.Context;

import com.example.myapplication.model.dataHotel;

import java.util.List;

public interface IHotel {
    void LoadData(List<dataHotel> data, adapterHotel adapter);
    void LoadSuccess(String text, Context context);
    void LoadError(String text,Context context);
}
