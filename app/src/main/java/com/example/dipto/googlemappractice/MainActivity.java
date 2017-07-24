package com.example.dipto.googlemappractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mymap ;
    LatLng office = new LatLng(23.750101, 90.392779) ;
    LatLng ulab = new LatLng(23.740823, 90.374510) ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mymap = googleMap ;


        LatLng myhome = new LatLng(23.7578944,90.4390535) ;
        mymap.addMarker(new MarkerOptions().position(myhome).title("10 tala building")) ;
        mymap.moveCamera(CameraUpdateFactory.newLatLngZoom(myhome, 12f));


        mymap.addMarker(new MarkerOptions()
                .position(office)
                .title("NextDot")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.new_marker)));
        mymap.moveCamera(CameraUpdateFactory.newLatLngZoom(office, 12f));


        mymap.addMarker(new MarkerOptions()
                .position(ulab)
                .title("University Of Liberal Arts")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.new_marker_2)));
        mymap.moveCamera(CameraUpdateFactory.newLatLngZoom(ulab, 12f));
    }
}
