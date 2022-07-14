package com.example.pharma_chain_manager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class navigationbar extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    home mhome = new home();
    SupportFragment supportFragment = new SupportFragment();
    tichluyFrament tichluyfragment= new tichluyFrament();
    giohangfragment giohangFragment = new giohangfragment();
    taikhoanFragment taikhoanfragment = new taikhoanFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationbar);

        bottomNavigationView = findViewById(R.id.buttomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mhome).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,mhome)
                                .commit();
                        return true;
                    case R.id.ic_tichluy:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,tichluyfragment)
                                .commit();
                        return true;
                    case R.id.ic_hotro:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,supportFragment)
                                .commit();
                        return true;
                    case R.id.ic_giohang:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,giohangFragment)
                                .commit();
                        return true;
                    case R.id.ic_taikhoan:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,taikhoanfragment)
                                .commit();
                        return true;
                }
                return false;
            }
        });
    }
}