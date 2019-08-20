package com.example.qq.ungdungdulichtn.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qq.ungdungdulichtn.R;
import com.example.qq.ungdungdulichtn.model.data_map;
import com.example.qq.ungdungdulichtn.util.SquareImageView;

import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

public class adapter_map extends RecyclerView.Adapter {
    private Context context;
    private LayoutInflater inflater;
    List<data_map> data = Collections.emptyList();
    adapter_map adapter = this;

    public adapter_map(Context context, List<data_map> data) {
        this.context = context;
        inflater= LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_map, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyHolder myHolder = (MyHolder) holder;
        final  data_map current = data.get(position);
        myHolder.name.setText(current.getName());
        int resId = context.getResources().getIdentifier(current.getImg(), "drawable", context.getPackageName());


        Glide.with(context).load(resId).into(myHolder.icon);
        myHolder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        myHolder.map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyHolder extends RecyclerView.ViewHolder{
        TextView name;
        SquareImageView icon;

        ImageButton map;
        public MyHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);

            icon = (SquareImageView) itemView.findViewById(R.id.img);
            map = (ImageButton) itemView.findViewById(R.id.map);
        }
    }
    @SuppressLint("MissingPermission")
    private boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }
}
