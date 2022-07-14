package com.example.pharma_chain_manager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class productkhautrangview extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productkhautrangview);

        Button btnbuy = findViewById(R.id.btnmua);
        btnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               muahang();
            }
        });
    }

    private void muahang(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buy_dialog);
        Window window = dialog.getWindow();
        if(window == null){
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);

        Button btnaddcart = dialog.findViewById(R.id.btnaddtocart);
        btnaddcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Sản phẩm đã được thêm vào giỏ hàng",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        dialog.show();
    }
}