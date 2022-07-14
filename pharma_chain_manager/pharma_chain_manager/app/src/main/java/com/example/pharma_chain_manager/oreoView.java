package com.example.pharma_chain_manager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class oreoView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banh_thuong);

        Button btndoiqua2 = findViewById(R.id.btndoiqua2);
        btndoiqua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Bạn không đủ điểm để đổi quà",Toast.LENGTH_SHORT).show();
            }
        });
    }
}