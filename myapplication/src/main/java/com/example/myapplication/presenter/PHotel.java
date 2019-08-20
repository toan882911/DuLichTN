package com.example.myapplication.presenter;

import android.content.Context;

import com.example.myapplication.model.dataHotel;
import com.example.myapplication.util.putHotel;
import com.example.myapplication.view.IHotel;
import com.example.myapplication.view.adapterHotel;

import java.util.ArrayList;
import java.util.List;

public class PHotel {
    IHotel view;
    Context context;
    adapterHotel adapter;
    List<dataHotel> data = new ArrayList<>();
    putHotel put;
    public PHotel(IHotel view , Context context ) {
        this.view = view;
        this.context = context;
    }
    public void LoadData(){
        put = new putHotel(context);
        data = put.getdata();
        adapter = new adapterHotel(context, data);
        if(data.size() > 0){
            view.LoadData(data,adapter);
            view.LoadSuccess("Load Success !",context);
        }else{
            view.LoadError("Load Error !",context);
        }
    }
}
