package com.example.miprimerapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int matematicas = 5;
        int quimica = 5;
        int fisica = 5;
        int resultado1 = 0;

        resultado1 = (matematicas + quimica + fisica) / 3;

        if (resultado1 >= 6) {
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        } else if (resultado1 <= 5) {
            Toast.makeText(this, "Reprobado", Toast.LENGTH_LONG).show();
        }
    }
}