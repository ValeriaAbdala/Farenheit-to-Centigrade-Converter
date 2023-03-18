package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editGrados = findViewById(R.id.grados);
        TextView txtConversion = findViewById(R.id.txt_conversion);
        Button boton = findViewById(R.id.btn_convertir);

        boton.setOnClickListener(v->{
            if(!editGrados.getText().toString().isEmpty() && editGrados.getText().toString().matches("[0-9]+")) {
                int grados = ((Integer.parseInt(editGrados.getText().toString()) - 32)*5/9);
                String conversion =  getString(R.string.Result,grados);
                txtConversion.setText(conversion);
            }else{
                Toast.makeText(this,R.string.Only_numbers,Toast.LENGTH_SHORT).show();
            }
        });

    }
}