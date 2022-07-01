package com.example.sensor_10119111;
// nim = 10119111
// nama = fauzi f
// kelas = if 3

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Initialize view
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        // Initialize map fragment
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);

        // Async map
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {

                LatLng Lokasi1 = new LatLng(-6.995137548022757, 107.56373307844926);
                LatLng Lokasi2 = new LatLng(-6.997053058432691, 107.56855850164513);
                LatLng Lokasi3 = new LatLng(-6.996829430794417, 107.56940876188271);
                LatLng Lokasi4 = new LatLng(-6.996099978025022, 107.57019733130925);
                LatLng Lokasi5 = new LatLng(-7.001108109464758, 107.56803900471736);
                LatLng Rumah = new LatLng(-6.997857052111427, 107.56809984392477);
                googleMap.setMapType(googleMap.MAP_TYPE_HYBRID);
                googleMap.addMarker(new MarkerOptions().position(Lokasi1).title("CC Ma Enon 2"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi2).title("Dapur bu alex"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi3).title("Kedai Baso juaraG"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi4).title("Azta Food Bandung"));
                googleMap.addMarker(new MarkerOptions().position(Lokasi5).title("Kedai Berkah By DTQA"));
                googleMap.addMarker(new MarkerOptions().position(Rumah).title("Rumah"));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Rumah, 17));

                // when map is loaded
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(LatLng latLng) {
                        // when clicked on map
                        // Initialize marker options
                        MarkerOptions markerOptions = new MarkerOptions();

                        // Set position of marker
                        markerOptions.position(latLng);

                        // Set title of marker
                        markerOptions.title(latLng.latitude + " : " + latLng.longitude);

                        // Remove all marker
                        googleMap.clear();

                        // Animating to zoom the marker
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));

                        // Add marker on map
                        googleMap.addMarker(markerOptions);
                    }
                });
            }
        });

        // Return view
        return view;
    }
}