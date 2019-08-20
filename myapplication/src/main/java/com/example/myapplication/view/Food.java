package com.example.myapplication.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.model.dataFood;
import com.example.myapplication.presenter.PFood;
import com.example.myapplication.presenter.PHotel;

import java.util.ArrayList;
import java.util.List;

public class Food extends Fragment implements IFood {
    RecyclerView list;
    LinearLayoutManager mLayoutManager;
    LinearLayoutManager layoutManager;
    List<dataFood> data = new ArrayList<>();
    PFood pFood;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_food, null);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = (RecyclerView) view.findViewById(R.id.list_item);
        pFood = new PFood(this,getContext());
        pFood.LoadData();
//        getData();
    }
    @Override
    public void LoadData(List<dataFood> data, adapter_food adapter) {
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
