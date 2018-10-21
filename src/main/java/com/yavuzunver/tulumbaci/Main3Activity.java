package com.yavuzunver.tulumbaci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.heatmaps.HeatmapTileProvider;


public class Main3Activity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync( this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng galataKulesi = new LatLng(41.025629, 28.974138);
        mMap.addMarker(new MarkerOptions().position(galataKulesi).title("Burası Galata Kulesi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(galataKulesi));
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(41.047967,28.933790))
                .title("BURADASINIZ")
                .snippet("Eyüp Sultan Cami"));
    }
}

