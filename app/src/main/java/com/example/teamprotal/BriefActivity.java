package com.example.teamprotal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class BriefActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    RecyclerView.Adapter adapter1,adapter2;
    ArrayList<Imges> numbers;
    Button side;
    ArrayList<Story> imgs;
    LinearLayoutManager layoutManager1,layoutManager2,layoutManager3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brief);
        side=findViewById(R.id.side_brief);

        side.setOnClickListener(v -> new CustomDialog(BriefActivity.this,R.id.briefcase).show());
        recyclerView1=findViewById(R.id.rec1);
        recyclerView2=findViewById(R.id.rec2);
        recyclerView3=findViewById(R.id.rec3);
        imgs=new ArrayList<>();
        numbers=new ArrayList<>();
        imgs.add(new Story());
        imgs.add(new Story());
        imgs.add(new Story());
        imgs.add(new Story());imgs.add(new Story());
        imgs.add(new Story());
        imgs.add(new Story());
        imgs.add(new Story());

        numbers.add(new Imges(R.drawable.masks,500,500));
        numbers.add(new Imges(R.drawable.dance,500,500));
        numbers.add(new Imges(R.drawable.camera,500,500));
        numbers.add(new Imges(R.drawable.sing,500,500));
        numbers.add(new Imges(R.drawable.masks,500,500));
        numbers.add(new Imges(R.drawable.dance,500,500));
        numbers.add(new Imges(R.drawable.camera,500,500));
        numbers.add(new Imges(R.drawable.sing,500,500));
        numbers.add(new Imges(R.drawable.masks,500,500));
        numbers.add(new Imges(R.drawable.dance,500,500));
        numbers.add(new Imges(R.drawable.camera,500,500));
        numbers.add(new Imges(R.drawable.sing,500,500));
        numbers.add(new Imges(R.drawable.masks,500,500));
        numbers.add(new Imges(R.drawable.dance,500,500));
        numbers.add(new Imges(R.drawable.camera,500,500));
        numbers.add(new Imges(R.drawable.sing,500,500));

        adapter1=new IMAdapter(imgs);
        adapter2=new ImgesAdapter(numbers);
        layoutManager1=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        layoutManager2=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        recyclerView1.setHasFixedSize(true);
        recyclerView3.setHasFixedSize(true);
        recyclerView1.setAdapter(adapter1);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter(adapter1);
        recyclerView2.setLayoutManager(layoutManager2);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView3.setAdapter(adapter2);
        recyclerView3.setLayoutManager(gridLayoutManager);


    }
}