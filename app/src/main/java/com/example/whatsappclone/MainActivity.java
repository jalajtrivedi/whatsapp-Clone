package com.example.whatsappclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    TabLayout tabLayout;
    String data[]={"Chats","Calls", "Updates"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2= findViewById(R.id.myviewpage);
        tabLayout = findViewById(R.id.mytabslayout);

        DataAdapter dataAdapter = new DataAdapter(getSupportFragmentManager(),getLifecycle(),  3);
        viewPager2.setAdapter(dataAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(data[position])).attach();
    }
}