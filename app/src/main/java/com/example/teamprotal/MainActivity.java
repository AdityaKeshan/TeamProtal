package com.example.teamprotal;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView about1;
    Button side;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<Imge> numbers;
    GridLayoutManager gridLayoutManager;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers=new ArrayList<>();
        side=findViewById(R.id.side);
        side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CustomDialog(MainActivity.this).show();
            }
        });
        numbers.add(new Imge(R.drawable.img1));
        numbers.add(new Imge(R.drawable.img2));
        numbers.add(new Imge(R.drawable.img3));
        numbers.add(new Imge(R.drawable.img1));
        numbers.add(new Imge(R.drawable.img2));
        numbers.add(new Imge(R.drawable.img3));
        numbers.add(new Imge(R.drawable.img1));
        numbers.add(new Imge(R.drawable.img2));
        numbers.add(new Imge(R.drawable.img3));

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setOverflowIcon(getDrawable( R.drawable.ic_baseline_dehaze_24));
        toolbar.inflateMenu(R.menu.main_menu);
        about1=findViewById(R.id.about1);
        about1.setText("Hello I am a chef from the native part of India working in the carribean since the last 10 years more..");
        recyclerView=findViewById(R.id.recy);
        recyclerView.setHasFixedSize(true);
        adapter=new ImageAdapter(numbers);
        recyclerView.setAdapter(adapter);
        gridLayoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}