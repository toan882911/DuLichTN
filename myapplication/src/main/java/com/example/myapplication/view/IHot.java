package com.example.myapplication.view;

import android.content.Context;

import com.example.myapplication.model.data_map;

import java.util.List;

public interface IHot {
    void LoadData(List<data_map> data, adapter_map adapter);
    void LoadSuccess(String text, Context context);
    void LoadError(String text,Context context);
}
