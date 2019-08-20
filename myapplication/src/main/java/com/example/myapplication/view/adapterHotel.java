package com.example.myapplication.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.dataHotel;
import com.example.myapplication.model.data_map;
import com.example.myapplication.util.SquareImageView;

import java.util.Collections;
import java.util.List;

public class adapterHotel extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<dataHotel> data = Collections.emptyList();


    // create constructor to innitilize context and data sent from Home
    public adapterHotel(Context context, List<dataHotel> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_hotel, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }


    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        // Get current position of item in recyclerview to bind data and assign values from list
        final MyHolder myHolder = (MyHolder) holder;
        final dataHotel current = data.get(position);


        myHolder.ad.setText(current.getAddress());


        myHolder.name.setText(current.getName());

        int resId = context.getResources().getIdentifier(current.getImg(), "drawable", context.getPackageName());
        myHolder.icon.setImageResource(resId);


    }


    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView ad;
        SquareImageView icon;


        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            ad = (TextView) itemView.findViewById(R.id.ad);

            icon = (SquareImageView) itemView.findViewById(R.id.img);

        }

    }


}
