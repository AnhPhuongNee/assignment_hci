package com.example.pharma_chain_manager;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class home extends Fragment {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private  photoAdaptor photoAdaptor;
    ImageButton btnkhautrang;
    ImageButton btnvitaminc;
    ImageButton btnkittest;
    ImageButton btnxitmui;
    ImageButton btnmuathuoc;
    LinearLayout btnmua;
    LinearLayout btndoncuatoi;

    public home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.viewpaper);
        circleIndicator = view.findViewById(R.id.circle);

        photoAdaptor = new photoAdaptor( view.getContext(), getListPhoto());
        viewPager.setAdapter(photoAdaptor);

        circleIndicator.setViewPager(viewPager);
        photoAdaptor.registerDataSetObserver(circleIndicator.getDataSetObserver());

        btnkhautrang = view.findViewById(R.id.khautrang);
        btnkhautrang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),productkhautrangview.class );
                startActivity(intent);
            }
        });

        btnvitaminc = view.findViewById(R.id.vitaminc);
        btnvitaminc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),productvitaminc.class);
                startActivity(intent);
            }
        });

        btnkittest = view.findViewById(R.id.testcovid);
        btnkittest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),productkittest.class);
                startActivity(intent);
            }
        });

        btnxitmui = view.findViewById(R.id.xitmui);
        btnxitmui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),productxitmui.class);
                startActivity(intent);
            }
        });

        btnmua = view.findViewById(R.id.mua_thuoc);
        btnmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),can_mua_thuoc_page.class);
                startActivity(intent);
            }
        });
        btnmuathuoc = view.findViewById(R.id.can_mua_thuoc);
        btnmuathuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),can_mua_thuoc_page.class);
                startActivity(intent);
            }
        });

        btndoncuatoi = view.findViewById(R.id.don_cua_toi);
        btndoncuatoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),don_cua_toi45.class);
                startActivity(intent);
            }
        });

        LinearLayout btndungcuyte= view.findViewById(R.id.btndung_cu_y_te);
        btndungcuyte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),dung_cu_y_te.class);
                startActivity(intent);
            }
        });

        LinearLayout  btntimnhathuoc = view.findViewById(R.id.btntim_nha_thuoc);
        btntimnhathuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),MapsActivity.class);
                startActivity(intent);
            }
        });



        return view;
    }
    private List<photo> getListPhoto(){
        List<photo> List = new ArrayList<>();
        List.add(new photo(R.drawable.detailsale));
        List.add(new photo(R.drawable.detailsale2));
        List.add(new photo(R.drawable.ima3));
        List.add(new photo(R.drawable.ima4));
        List.add(new photo(R.drawable.ima5));
        return List;
    }
}