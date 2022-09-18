package com.example.fooddeliveryapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentManager fm = getSupportFragmentManager();
        FragmentNav nav = (FragmentNav) fm.findFragmentById(R.id.nav);

        FragmentSpecials specials = (FragmentSpecials) fm.findFragmentById(R.id.specials);

        if(nav == null) {
            nav = FragmentNav.newInstance();
            fm.beginTransaction().add(R.id.nav, nav).commit();
        }
        if(specials == null) {
            specials = FragmentSpecials.newInstance();
            fm.beginTransaction().add(R.id.specials, specials).commit();
        }
    }
}