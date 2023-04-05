package com.example.recycleviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<ItemData>userList;
    Adapter1 adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecylerView();


    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ItemData(1,"Ashish","Singh",8534043));
        userList.add(new ItemData(2,"Ashish","Singh",8534043));
        userList.add(new ItemData(3,"Ashish","Singh",8534043));
        userList.add(new ItemData(4,"Ashish","Singh",8534043));
        userList.add(new ItemData(5,"Ashish","Singh",8534043));
        userList.add(new ItemData(6,"Ashish","Singh",8534043));
        userList.add(new ItemData(7,"Ashish","Singh",8534043));
        userList.add(new ItemData(8,"Ashish","Singh",8534043));
        userList.add(new ItemData(9,"Ashish","Singh",8534043));
        userList.add(new ItemData(10,"Ashish","Singh",8534043));
        userList.add(new ItemData(11,"Ashish","Singh",8534043));
        userList.add(new ItemData(12,"Ashish","Singh",8534043));
        userList.add(new ItemData(13,"Ashish","Singh",8534043));


    }

    private void initRecylerView() {
        recyclerView=findViewById(R.id.recyclerview11);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter1=new Adapter1(userList);
        recyclerView.setAdapter(adapter1);
        adapter1.notifyDataSetChanged();
    }
}