package com.example.myapplication.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.bumptech.glide.Glide;
import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.data_map;
import com.example.myapplication.util.SquareImageView;
import com.squareup.picasso.Picasso;


import java.util.Collections;
import java.util.List;

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
//        Picasso.get().load(current.getImg()).into(myHolder.icon);
        int resId = context.getResources().getIdentifier(current.getImg(), "drawable", context.getPackageName());

//        Glide.with(context).load(resId).into(myHolder.icon);
        myHolder.icon.setImageResource(resId);
        myHolder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Detail.class);
                intent.putExtra("noidung",current.getNoiDung());
                intent.putExtra("noidung2",current.getNoiDung2());
                intent.putExtra("tit",current.getName());
                intent.putExtra("img",current.getImg());
                intent.putExtra("img2",current.getImg2());
                intent.putExtra("img3",current.getImg3());
                intent.putExtra("x",current.getX());
                intent.putExtra("y",current.getY());
                context.startActivity(intent);
            }
        });
        myHolder.map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNetworkConnected(context)){
                    Intent intent2 = new Intent(context,Maps.class);
                    intent2.putExtra("x",current.getX());
                    intent2.putExtra("tit",current.getName());
                    intent2.putExtra("y",current.getY());
                    context.startActivity(intent2);
                }else{
                    Toast.makeText(context, "Not Internet !", Toast.LENGTH_SHORT).show();
                }
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
