package com.example.thannathrnyuwasin.newit;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        LatLng temple1 = new LatLng(18.7886032,98.9791301);
        mMap.addMarker(new MarkerOptions().position(temple1).title("วัดพระสิงวงรวิหาร"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((temple1),11));

        LatLng temple2 = new LatLng(18.7869744,98.9843863);
        mMap.addMarker(new MarkerOptions().position(temple2).title("วัดเจดีย์หลวง"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple2));

        LatLng temple3 = new LatLng(18.8049342,98.9198266);
        mMap.addMarker(new MarkerOptions().position(temple3).title("วัดพระธาตุดอยสุเทพ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple3));

        LatLng temple4 = new LatLng(18.7875832,98.9853002);
        mMap.addMarker(new MarkerOptions().position(temple4).title("วัดพันเตา"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple4));

        LatLng temple5 = new LatLng(18.7938425,98.9870759);
        mMap.addMarker(new MarkerOptions().position(temple5).title("วัดเชียงมั่น"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple5));

        LatLng temple6 = new LatLng(118.7833449,98.9489994);
        mMap.addMarker(new MarkerOptions().position(temple6).title("วัดอุโมงค์"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple6));

        LatLng temple7 = new LatLng(18.7882438,98.9655678);
        mMap.addMarker(new MarkerOptions().position(temple7).title("วัดสวนดอก"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple7));

        LatLng temple8 = new LatLng(18.7967124,98.980597);
        mMap.addMarker(new MarkerOptions().position(temple8).title("วัดโลกโมฬี"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple8));

        LatLng temple9 = new LatLng(18.8083491,98.9696835);
        mMap.addMarker(new MarkerOptions().position(temple9).title("วัดเจ็ดยอด"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple9));

        LatLng temple10 = new LatLng(18.7595242,98.9166954);
        mMap.addMarker(new MarkerOptions().position(temple10).title("วัดพระธาตุดอยคำ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple10));
    }



}
