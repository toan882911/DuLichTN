package com.example.myapplication.view;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class DetailFood extends AppCompatActivity {
    ImageView img,img2,img3;
    TextView text,text2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        anhxa();
        CollapsingToolbarLayout coll = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        ImageButton imgbtn=(ImageButton) findViewById(R.id.back);
        Intent intent = getIntent();
        String nd = intent.getStringExtra("noidung");
        String nd2 = intent.getStringExtra("noidung2");
        String tit = intent.getStringExtra("tit");
        String image = intent.getStringExtra("img");
        String image2 = intent.getStringExtra("img2");
        String image3 = intent.getStringExtra("img3");

        coll.setTitle(tit);
        text.setText(nd);
        text2.setText(nd2);
        int resID=this.getResources().getIdentifier(image,"drawable",this.getPackageName());
        int resID2=this.getResources().getIdentifier(image2,"drawable",this.getPackageName());
        int resID3=this.getResources().getIdentifier(image3,"drawable",this.getPackageName());
        img.setImageResource(resID);
        img2.setImageResource(resID2);
        img3.setImageResource(resID3);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void anhxa(){
        img=(ImageView) findViewById(R.id.img);
        img2=(ImageView) findViewById(R.id.img2);
        img3=(ImageView) findViewById(R.id.img3);
        text=(TextView) findViewById(R.id.noidung);
        text2=(TextView) findViewById(R.id.noidung2);
    }

    private boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }
}
