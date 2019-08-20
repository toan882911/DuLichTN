package com.example.myapplication.presenter;

import android.content.Context;

import com.example.myapplication.model.dataFood;
import com.example.myapplication.util.putFood;
import com.example.myapplication.view.IFood;
import com.example.myapplication.view.adapter_food;

import java.util.ArrayList;
import java.util.List;

public class PFood implements IPFood {
    Context context;
    IFood view;
    adapter_food adapter;
    List<dataFood> data = new ArrayList<>();
    putFood put;
    public PFood(IFood view , Context context ) {
        this.view = view;
        this.context = context;
    }
    @Override
    public void LoadData() {
        put = new putFood(context);
        data = put.getdata();
        adapter = new adapter_food(context, data);
        if(data.size() > 0){
            view.LoadData(data,adapter);
            view.LoadSuccess("Load Success !",context);
        }else{
            view.LoadError("Load Error !",context);
        }
    }
}
