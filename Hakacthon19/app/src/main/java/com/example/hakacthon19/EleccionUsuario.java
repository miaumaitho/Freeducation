package com.example.hakacthon19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EleccionUsuario extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eleccion_usuario);

        Button btnAsesor = (Button)findViewById(R.id.btnEAsesor);
        btnAsesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EleccionUsuario.this, InicioSesion.class));
            }
        });

        Button btnEAlumno = (Button)findViewById(R.id.btnEAlumno);
        btnEAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EleccionUsuario.this, InicioSesionAlumno.class));
            }
        });

    }
}