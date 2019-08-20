package com.example.myapplication.presenter;

import android.content.Context;

import com.example.myapplication.model.data_map;
import com.example.myapplication.util.putdata;
import com.example.myapplication.view.Home2;
import com.example.myapplication.view.IHome2;
import com.example.myapplication.view.adapter_map;

import java.util.ArrayList;
import java.util.List;

public class PHome2 implements IPHome2{
    IHome2 view;
    Context context;
    adapter_map adapter;
    List<data_map> data = new ArrayList<>();
    putdata put;
    public PHome2(IHome2 view , Context context ) {
        this.view = view;
        this.context = context;
    }
    public void LoadData(){
        put = new putdata(context);
        data = put.getdata();
        adapter = new adapter_map(context, data);
        if(data.size() > 0){
            view.LoadData(data,adapter);
            view.LoadSuccess("Load Success !",context);
        }else{
            view.LoadError("Load Error !",context);
        }
    }
}
