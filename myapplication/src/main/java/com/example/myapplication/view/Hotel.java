package com.example.myapplication.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.R;
import com.example.myapplication.model.dataHotel;
import com.example.myapplication.presenter.IPHotel;
import com.example.myapplication.presenter.PHotel;
import com.example.myapplication.util.putHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hotel extends Fragment implements IHotel{
    RecyclerView list;
    LinearLayoutManager mLayoutManager;
    putHotel put;
    LinearLayoutManager layoutManager;
    List<dataHotel> data = new ArrayList<>();
    ProgressBar load;
    adapterHotel adapterHotel;
    PHotel ipHotel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_hotel, null);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = (RecyclerView) view.findViewById(R.id.list_item);
        load = view.findViewById(R.id.load);
        ipHotel = new PHotel(this,getContext());
        ipHotel.LoadData();
//        getData();
    }

//    private void getData() {
//        put = new putHotel(getContext());
//        data = put.getdata();
//        load.setVisibility(View.VISIBLE);
//        layoutManager = new LinearLayoutManager(getContext());
//        adapterHotel = new adapterHotel(getContext(), data);
//        list.setAdapter(adapterHotel);
//        list.setLayoutManager(layoutManager);
//        Toast.makeText(getContext(), "Load danh sách thành công", Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void LoadData(List<dataHotel> data, com.example.myapplication.view.adapterHotel adapter) {
        mLayoutManager = new LinearLayoutManager(getContext());
        list.setAdapter(adapter);
        list.setLayoutManager(mLayoutManager);
    }

    @Override
    public void LoadSuccess(String text, Context context) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoadError(String text, Context context) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
