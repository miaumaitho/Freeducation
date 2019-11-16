package com.example.hakacthon19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InicioSesionAlumno extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion_alumno);

        Button btnInicio = findViewById(R.id.btnIngresarAlumno);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InicioSesionAlumno.this, AlumnosMain.class));
            }
        });
    }
}
