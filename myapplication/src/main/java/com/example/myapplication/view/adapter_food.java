package com.example.myapplication.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.dataFood;
import com.example.myapplication.model.dataHotel;
import com.example.myapplication.util.SquareImageView;

import java.util.Collections;
import java.util.List;

public class adapter_food extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private Context context;
    private LayoutInflater inflater;
    List<dataFood> data = Collections.emptyList();
    public adapter_food(Context context, List<dataFood> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = inflater.inflate(R.layout.custom_food, parent, false);
        adapter_food.MyHolder holder = new adapter_food.MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final adapter_food.MyHolder myHolder = (adapter_food.MyHolder) holder;
        final dataFood current = data.get(position);


        myHolder.ad.setText(current.getNoidung().substring(0,87)+"...");


        myHolder.name.setText(current.getName());

        int resId = context.getResources().getIdentifier(current.getImg(), "drawable", context.getPackageName());
        myHolder.icon.setImageResource(resId);
        myHolder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailFood.class);
                intent.putExtra("noidung",current.getNoidung());
                intent.putExtra("noidung2",current.getNoidung2());
                intent.putExtra("tit",current.getName());
                intent.putExtra("img",current.getImg());
                intent.putExtra("img2",current.getImg2());
                intent.putExtra("img3",current.getImg3());
                context.startActivity(intent);
            }
        });
    }

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
