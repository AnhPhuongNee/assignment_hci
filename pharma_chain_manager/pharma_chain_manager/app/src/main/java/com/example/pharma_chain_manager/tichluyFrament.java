package com.example.pharma_chain_manager;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class tichluyFrament extends Fragment {


    public tichluyFrament() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tichluy_frament, container, false);

        Button btngift = view.findViewById(R.id.btn_gift);
        ImageButton ibtninfo = view.findViewById(R.id.btn_info);
        ImageButton ibtninfo2 = view.findViewById(R.id.btn_info2);
        ImageButton ibtninfo3 = view.findViewById(R.id.btn_info3);

        btngift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Bạn không đủ điểm để đổi quà",Toast.LENGTH_SHORT).show();
            }
        });

        ibtninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), voucherview.class);
                startActivity(intent);
            }
        });
        ibtninfo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), voucherview2.class);
                startActivity(intent);
            }
        });
        ibtninfo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), oreoView.class);
                startActivity(intent);
            }
        });
        return view;

    }
}