package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> countryNameList=new ArrayList<>();
    private ArrayList<String> detailsList=new ArrayList<>();
    private ArrayList<Integer> imageList=new ArrayList<>();
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNameList.add("India");
        countryNameList.add("USA");
        countryNameList.add("Germany");
        countryNameList.add("India");
        countryNameList.add("USA");
        countryNameList.add("Germany");
        countryNameList.add("India");
        countryNameList.add("USA");
        countryNameList.add("Germany");
        countryNameList.add("India");
        countryNameList.add("USA");
        countryNameList.add("Germany");
        countryNameList.add("India");
        countryNameList.add("USA");
        countryNameList.add("Germany");

        detailsList.add("This is India flag");
        detailsList.add("This is USA flag");
        detailsList.add("This is Germany flag");
        detailsList.add("This is India flag");
        detailsList.add("This is USA flag");
        detailsList.add("This is Germany flag");
        detailsList.add("This is India flag");
        detailsList.add("This is USA flag");
        detailsList.add("This is Germany flag");
        detailsList.add("This is India flag");
        detailsList.add("This is USA flag");
        detailsList.add("This is Germany flag");
        detailsList.add("This is India flag");
        detailsList.add("This is USA flag");
        detailsList.add("This is Germany flag");

        imageList.add(R.drawable.ind);
        imageList.add(R.drawable.usa);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.ind);
        imageList.add(R.drawable.usa);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.ind);
        imageList.add(R.drawable.usa);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.ind);
        imageList.add(R.drawable.usa);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.ind);
        imageList.add(R.drawable.usa);
        imageList.add(R.drawable.germany);


        adapter=new RecyclerAdapter(countryNameList,detailsList,imageList,MainActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new LinePaint());
    }
}