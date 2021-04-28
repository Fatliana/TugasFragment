package com.example.tugasfragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugasfragment.R;
import com.example.tugasfragment.fragment.Buah;
import com.example.tugasfragment.fragment.Hewan;
import com.example.tugasfragment.fragment.Planet;


public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnbuah, btnhwn, btnplant, btnExit;

    Buah fragmentBuah;
    Hewan fragmentHewan;
    Planet fragmentPlanet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbuah = findViewById(R.id.btn_buah);
        btnhwn = findViewById(R.id.btn_hwn);
        btnplant = findViewById(R.id.btn_plant);
        btnExit = findViewById(R.id.btn_exit);

        btnbuah.setOnClickListener(this);
        btnhwn.setOnClickListener(this);
        btnplant.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    void menuBuah() {
        fragmentBuah = new Buah();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentBuah);
        ft.commit();
    }

    void menuHewan() {
        fragmentHewan = new Hewan();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHewan);
        ft.commit();
    }

    void menuPlanet() {
        fragmentPlanet = new Planet();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentPlanet);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnbuah) {
            menuBuah();
        }
        if (v == btnhwn) {
            menuHewan();
        }
        if (v == btnplant) {
            menuPlanet();
        }
        if (v == btnExit) {
            menuExit();
        }
    }
}
