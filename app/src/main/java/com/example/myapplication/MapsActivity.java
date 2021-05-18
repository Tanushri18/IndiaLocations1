package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class MapsActivity<val> extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ArrayList<LatLng> locationArrayList;
    LatLng Agartala=new LatLng(23.829321,91.277847);
    LatLng Aizawl =new LatLng(23.727106,92.717636);
    LatLng Ajmer =new LatLng(26.449896,74.639915);
    LatLng Akola=new LatLng(20.707228,77.00296);
    LatLng Akot =new LatLng(21.1,77.059998);
    LatLng Alipurduar =new LatLng(26.49189,89.5271);
    LatLng Almora =new LatLng(29.594189,79.653893);
    LatLng Amalner =new LatLng(21.04241,75.063873);
    LatLng Ambala =new LatLng(30.37818,76.776695);
    LatLng Ambernath =new LatLng(19.186354,73.191948);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);

       locationArrayList = new ArrayList<>();
        locationArrayList.add( Agartala);
        locationArrayList.add(Aizawl);
        locationArrayList.add(Ajmer);
        locationArrayList.add( Akola);
        locationArrayList.add(Akot);
        locationArrayList.add( Alipurduar);
        locationArrayList.add(Almora);
        locationArrayList.add(Amalner);
        locationArrayList.add(Ambala);
        locationArrayList.add( Ambernath);

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
        for (int i = 0; i < locationArrayList.size(); i++) {

            // below line is use to add marker to each location of our array list.
            mMap.addMarker(new MarkerOptions().position(locationArrayList.get(i)).title("Marker"));

            // below lin is use to zoom our camera on map.
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18.0f));

            // below line is use to move our camera to the specific location.
            mMap.moveCamera(CameraUpdateFactory.newLatLng(locationArrayList.get(i)));
        }


       // LatLng sydney = new LatLng(-34, 151);
       // mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
