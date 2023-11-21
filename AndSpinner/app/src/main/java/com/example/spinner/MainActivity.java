package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.txt_valor1);
        et2 = findViewById(R.id.txt_valor2);
        spinner1 = findViewById(R.id.spinner);
        tv1 = findViewById(R.id.txt_Resultado);
        String [] opciones ={"sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_geekpedia,opciones);
        spinner1.setAdapter(adapter);
    }
    //Método del botón
    public void Calcular (View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int =Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);
        String seleccion = spinner1.getSelectedItem().toString();
        if (seleccion.equals("sumar")){
            int suma =  valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (seleccion.equals("restar")) {
            int resta =  valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }  else if (seleccion.equals("multiplicar")) {
            int mult=  valor1_int * valor2_int;
            String resultado = String.valueOf(mult);
            tv1.setText(resultado);
        }  else if (seleccion.equals("dividir")) {

            if (valor2_int!=0){
                int div = valor1_int/valor2_int;
                String resultado = String.valueOf(div);
                tv1.setText(resultado);
            } else{
                Toast.makeText(this, "No se puede dividir entre cero",Toast.LENGTH_LONG).show();
            }
        }
    }
}