package com.example.myapplication.presenter;

import android.content.Context;

import com.example.myapplication.model.data_map;
import com.example.myapplication.util.PutDataHot;
import com.example.myapplication.util.putdata;
import com.example.myapplication.view.IHot;
import com.example.myapplication.view.adapter_map;

import java.util.ArrayList;
import java.util.List;

public class PHot implements IPHot {
    Context context;
    adapter_map adapter;
    IHot view;
    List<data_map> data = new ArrayList<>();
    PutDataHot put;
    public PHot(IHot view , Context context) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void LoadData() {
        put = new PutDataHot(context);
        data = put.getData();
        adapter = new adapter_map(context, data);
        if(data.size() > 0){
            view.LoadData(data,adapter);
            view.LoadSuccess("Load Success !",context);
        }else{
            view.LoadError("Load Error !",context);
        }
    }
}
