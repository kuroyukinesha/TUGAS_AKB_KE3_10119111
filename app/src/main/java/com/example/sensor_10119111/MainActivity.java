package com.example.sensor_10119111;
// nim = 10119111
// nama = fauzi f
// kelas = if 3

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Initialize fragment
//        Fragment fragment = new MapFragment();
//
//        // Open fragment
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment,fragment)
//                .commit();

        // -------

        BottomNavigationView bottomNavigationView = findViewById((R.id.bottomNavigationView));
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.profileFragment, R.id.mapFragment, R.id.infoFragment).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
}