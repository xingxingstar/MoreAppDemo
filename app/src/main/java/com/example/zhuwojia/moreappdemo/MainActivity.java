package com.example.zhuwojia.moreappdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView iv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_show = (ImageView) findViewById(R.id.iv_show);
    }

    public void onClick(View view) {
        Glide.with(MainActivity.this).load(Constant.url).into(iv_show);
    }
}
