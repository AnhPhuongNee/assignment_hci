package com.example.pharma_chain_manager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class voucherview2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher2);



        Button btndoiqua = findViewById(R.id.btndoiqua);
        btndoiqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Bạn không đủ điểm để đổi quà",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
