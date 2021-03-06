package com.example.pharma_chain_manager;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.pharma_chain_manager.databinding.ActivityMaps2Binding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;
    private LocationManager locationManager;

    private final LatLng LC1 = new LatLng(10.790425, 106.688791);
    private final LatLng LC2 = new LatLng(10.736759, 106.718017);
    private final LatLng LC3 = new LatLng(10.848219, 106.806450);
    private final LatLng LC4 = new LatLng(10.848709, 106.808430);
    private final LatLng LC5 = new LatLng(10.848209, 106.809401);
    private final LatLng LC6 = new LatLng(10.845332, 106.808387);
    private final LatLng LC7 = new LatLng(10.843931, 106.808028);
    private final LatLng LC8 = new LatLng(10.844557, 106.810479);
    private final LatLng LC9 = new LatLng(10.840975, 106.813322);

    private Marker markerLC1;
    private Marker markerLC2;
    private Marker markerLC3;
    private Marker markerLC4;
    private Marker markerLC5;
    private Marker markerLC6;
    private Marker markerLC7;
    private Marker markerLC8;
    private Marker markerLC9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng fpt = new LatLng(10.841318, 106.809880);
        mMap.addMarker(new MarkerOptions().position(fpt).title("FPT UNIVERSITY"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fpt));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));

        markerLC1 = mMap.addMarker(new MarkerOptions().position(LC1).title("Nh?? Thu???c FPT Long Ch??u").snippet("1286 ??. Nguy???n Duy Trinh, Long Tr?????ng, Th??nh ph??? Th??? ?????c, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC1.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC1.setTag(0);
        markerLC2 = mMap.addMarker(new MarkerOptions().position(LC2).title("Nh?? Thu???c T??y ??nh H???").snippet("RRF5+758, V?? V??n H??t, Long Tr?????ng, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC2.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC2.setTag(0);
        markerLC3 = mMap.addMarker(new MarkerOptions().position(LC3).title("Nh?? Thu???c Ho??ng Ch??u").snippet("s??? 1 ???????ng L?? Lu, Tr?????ng Th???nh, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC3.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC3.setTag(0);
        markerLC4 = mMap.addMarker(new MarkerOptions().position(LC4).title("Nh?? Thu???c H???i ????ng").snippet("250 L?? Xu??n Oai, Long Tr?????ng, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC4.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC4.setTag(0);
        markerLC5 = mMap.addMarker(new MarkerOptions().position(LC5).title("Nh?? Thu???c T?? Nh??n Nh???t Hi???n").snippet("5 ???????ng L?? Lu, Tr?????ng Th???nh, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC5.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC5.setTag(0);
        markerLC6 = mMap.addMarker(new MarkerOptions().position(LC6).title("Nh?? Thu???c Nguy??n An").snippet("47 ???????ng L?? Lu, Tr?????ng Th???nh, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC6.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC6.setTag(0);
        markerLC7 = mMap.addMarker(new MarkerOptions().position(LC7).title("Nh?? Thu???c An Khang").snippet("41 ???????ng L?? Lu, Tr?????ng Th???nh, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC7.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC7.setTag(0);
        markerLC8 = mMap.addMarker(new MarkerOptions().position(LC8).title("Nh?? Thu???c Minh An").snippet("86A L?? Xu??n Oai, Tr?????ng Th???nh, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC8.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC8.setTag(0);
        markerLC9 = mMap.addMarker(new MarkerOptions().position(LC9).title("Nh?? Thu???c Ph????ng Th???o 2").snippet("416 L?? Xu??n Oai, Long Tr?????ng, Qu???n 9, Th??nh ph??? H??? Ch?? Minh, Vi???t Nam"));
        markerLC9.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC9.setTag(0);
    }
}