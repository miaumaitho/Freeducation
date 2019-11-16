package com.example.hakacthon19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AlumnosMain extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alumnos_main);

        Button btnInicio = findViewById(R.id.btnTutoriaA);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AlumnosMain.this, TutoriasCalendario.class));
            }
        });
    }
}
