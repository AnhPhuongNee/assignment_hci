package com.example.pharma_chain_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login_page extends AppCompatActivity {
    final int RESULT_UPDATE_ACTIVITY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button btnLogin = findViewById(R.id.btn_login);
        TextView register = findViewById(R.id.register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(login_page.this, navigationbar.class );
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent();
               intent.setClass(view.getContext(), RegisterActivity.class);
               startActivityForResult(intent, RESULT_UPDATE_ACTIVITY);
            }
        });
    }

}