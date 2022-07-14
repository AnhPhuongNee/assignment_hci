package com.example.pharma_chain_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class dung_cu_y_te extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dung_cu_yte2);

        ImageButton btnbackdungcuyte = findViewById(R.id.back_dung_cu_y_te);
        btnbackdungcuyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        LinearLayout btnkhautrang = findViewById(R.id.btnkhautrang);
        btnkhautrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), productkhautrangview.class);
                startActivity(intent);
            }
        });

        LinearLayout btnkittest = findViewById(R.id.kittest);
        btnkittest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),productkittest.class);
                startActivity(intent);
            }
        });
        ImageButton btnkittest1 = findViewById(R.id.testcovid);
        btnkittest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),productkittest.class);
                startActivity(intent);
            }
        });
    }
}