package com.example.teamprotal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog implements View.OnClickListener {
    int id;
    Activity activity;
    public CustomDialog(@NonNull Activity context) {
        super(context);
        activity=context;
        this.id=0;
    }
    public CustomDialog(@NonNull Activity context,int id) {
        super(context);
        activity=context;
        this.id=id;
    }
    public void click(View v)
    {
        if(v.getId()==R.id.flash)
        {
            dismiss();
            activity.startActivity(new Intent(activity,FlashActivity.class));
        }
        else
        {
            dismiss();
            activity.startActivity(new Intent(activity,BriefActivity.class));
        }
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(1);
        setContentView(R.layout.dialog_layout);
        ImageButton img4=findViewById(R.id.flash);
        ImageButton img1=findViewById(R.id.briefcase);
        ImageButton img2=findViewById(R.id.send);
        ImageButton img3=findViewById(R.id.home);
        img1.setOnClickListener(this::click);
        img2.setOnClickListener(this::click);
        img3.setOnClickListener(this::click);
        img4.setOnClickListener(this::click);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        if(id!=0)
        {
            ImageButton img=findViewById(id);
            switch (id)
            {
                case R.id.home: img.setImageResource(R.drawable.ic_home1);
                break;
                case R.id.briefcase: img.setImageResource(R.drawable.ic_briefacse1);
                    break;
                case R.id.flash: img.setImageResource(R.drawable.ic_flash1);
                    break;
                case R.id.send: img.setImageResource(R.drawable.ic_send1);
                    break;
            }
        }
    }

    @Override
    public void onClick(View v) {
dismiss();
    }
}
