package com.example.myapplication.view;

import android.content.Context;

import com.example.myapplication.model.dataFood;

import java.util.List;

public interface IFood {
    void LoadData(List<dataFood> data, adapter_food adapter);
    void LoadSuccess(String text, Context context);
    void LoadError(String text,Context context);
}
