package com.example.actividadbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity   implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int color;

        View contenedor = view.getRootView();

        switch (view.getId()) {
            case R.id.button:
                color = Color.parseColor("#748AF7"); // Azul
                break;
            case R.id.button2:
                color = Color.parseColor("#F7F574"); // Amarillo
                break;
            case R.id.button3:
                color = Color.parseColor("#74F788"); // Verde claro
                break;
            case R.id.button4:
                color = Color.parseColor("#D974F7"); // Morado
                break;
            default:
                color = Color.WHITE; // Blano
        }

        contenedor.setBackgroundColor(color);

    }
}


