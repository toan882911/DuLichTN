package com.example.myapplication.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.model.data_map;

import com.example.myapplication.presenter.IPHot;
import com.example.myapplication.presenter.PHot;
import com.example.myapplication.util.putdata;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static java.security.AccessController.getContext;

public class
Hot extends Fragment implements IHot {
    RecyclerView list;
    LinearLayoutManager mLayoutManager;

    IPHot ipHot;
    putdata dt;
    EditText key;
    ImageButton back, search;
    adapter_map adapter;
    RelativeLayout show, showk;
    List<data_map> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_hot, null);
        return rootview;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        anhxa(view);
        dt = new putdata(getContext());
        data =dt.getdata();
        ipHot = new PHot(this, getContext());
        ipHot.LoadData();
        searchDD();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setVisibility(View.VISIBLE);
                showk.setVisibility(View.GONE);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setVisibility(View.GONE);
                showk.setVisibility(View.VISIBLE);
                key.requestFocus();
            }
        });
    }

    private void searchDD() {
        key.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String result = unAccent(charSequence.toString().toLowerCase());
                List<data_map> data1 = new ArrayList<>();
                for (int j = 0; j < data.size(); j++){
                    String name = unAccent(data.get(j).getName().toLowerCase());
                    if (name.contains(result)){
                        data1.add(new data_map(data.get(j).getMadulich(),data.get(j).getName(), data.get(j).getNoiDung(),data.get(j).getNoiDung2(), data.get(j).getImg(),data.get(j).getImg2(),data.get(j).getImg3(), data.get(j).getX(), data.get(j).getY()));
                    }
                }
                list.setLayoutManager(new LinearLayoutManager(getContext()));
                adapter = new adapter_map(getContext(), data1);
                list.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void anhxa(View view) {
        list = (RecyclerView) view.findViewById(R.id.list_item);
        key = (EditText) view.findViewById(R.id.key);
        back = (ImageButton) view.findViewById(R.id.back);
        search = (ImageButton) view.findViewById(R.id.search);
        show = (RelativeLayout) view.findViewById(R.id.show);
        showk = (RelativeLayout) view.findViewById(R.id.showk);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void LoadData(List<data_map> data, adapter_map adapter) {
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
    public String unAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }
}
