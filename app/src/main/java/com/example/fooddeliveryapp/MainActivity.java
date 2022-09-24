package com.example.fooddeliveryapp;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static boolean LOGGED = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView nav = findViewById(R.id.nav);
        nav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentSpecials()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch(menuItem.getItemId()) {
                        case R.id.specials:
                            selectedFragment = new FragmentSpecials();
                            break;
                        case R.id.explore:
                            selectedFragment = new FragmentExplore();
                            break;
                        case R.id.checkout:
                            if(LOGGED == false){
                                selectedFragment = new FragmentLogin();
                            } else {
                                selectedFragment = new FragmentCheckout(FragmentLogin.USER);
                            }
                            break;
                        case R.id.orders:
                            if(LOGGED == false) {
                                selectedFragment = new FragmentLogin();
                            } else
                            {
                                selectedFragment = new FragmentUserOrders();
                            }
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    return true;
                }
            };
    }