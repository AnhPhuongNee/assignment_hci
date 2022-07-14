package com.example.pharma_chain_manager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class qr extends Fragment {


    public qr() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentManager frm = getFragmentManager();
        final FragmentTransaction frmt = frm.beginTransaction();
        View view = inflater.inflate(R.layout.fragment_qr, container, false);

        ImageButton btnback = view.findViewById(R.id.back_qr);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taikhoanFragment tk = new taikhoanFragment();
                frmt.replace(R.id.qr_page_f,tk);
                frmt.commit();
            }
        });

        return view;
    }
}