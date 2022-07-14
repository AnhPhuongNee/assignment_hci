package com.example.pharma_chain_manager;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class taikhoanFragment extends Fragment {
    FragmentManager fm = getFragmentManager();


    public taikhoanFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_taikhoan, container, false);

        FragmentManager frm = getFragmentManager();
        final FragmentTransaction frmt = frm.beginTransaction();


        LinearLayout btnlogout = view.findViewById(R.id.dangxuat);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),login_page.class );
                startActivity(intent);
            }
        });

        TextView tvpoin = view.findViewById(R.id.poit);
        tvpoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tichluyFrament tlf = new tichluyFrament();
                frmt.replace(R.id.tk,tlf);
                frmt.commit();
            }
        });

        LinearLayout btnlichsumuahang= view.findViewById(R.id.lichsumuahang);
        btnlichsumuahang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),doncuatoi.class);
                startActivity(intent);
            }
        });

        LinearLayout btnmaqr = view.findViewById(R.id.btnqr);
        btnmaqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qr mqr = new qr();
                frmt.replace(R.id.tk,mqr);
                frmt.commit();
            }
        });
        LinearLayout thongtin = view.findViewById(R.id.thongtincanhan);
        thongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), thong_tin_ca_nhan.class);
                startActivity(intent);
            }
        });

        return view;
    }
}