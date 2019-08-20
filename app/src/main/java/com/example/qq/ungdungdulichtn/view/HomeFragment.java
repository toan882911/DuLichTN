package com.example.qq.ungdungdulichtn.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.qq.ungdungdulichtn.MainActivity;
import com.example.qq.ungdungdulichtn.R;
import com.example.qq.ungdungdulichtn.model.data_map;
import com.example.qq.ungdungdulichtn.util.putdata;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    putdata pd;
    MainActivity main;
    RecyclerView list;
    LinearLayoutManager mLayoutManager;
    adapter_map adapter_map;
    List<data_map> data = new ArrayList<>();

    EditText key;
    ImageButton back, search;

    RelativeLayout show, showk;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pd = new putdata(getContext());
        list = (RecyclerView) view.findViewById(R.id.list_item);
        key = (EditText) view.findViewById(R.id.key);
        back = (ImageButton) view.findViewById(R.id.back);
        search = (ImageButton) view.findViewById(R.id.search);
        show = (RelativeLayout) view.findViewById(R.id.show);
        showk = (RelativeLayout) view.findViewById(R.id.showk);
        loadData();
    }
    private void loadData(){
        mLayoutManager = new LinearLayoutManager(getContext());

        data = pd.getdata();

        adapter_map = new adapter_map(getContext(), data);
        list.setAdapter(adapter_map);
        list.setLayoutManager(mLayoutManager);
    }
}
