package com.example.pharma_chain_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class don_cua_toi45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_cua_toi45);

        RelativeLayout btnthongtin= findViewById(R.id.thongtin);
        btnthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), thong_tin_don_hang.class);
                startActivity(intent);
            }
        });

        ImageButton btnback= findViewById(R.id.backtdoncuatoi45);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(view.getContext(), navigationbar.class);
                startActivity(intent);
            }
        });
    }
}