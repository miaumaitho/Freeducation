package com.example.hakacthon19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Modulos extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulos);

        ImageButton downloadLetras=findViewById(R.id.ibtnPalabra);
        ImageButton downloadMates=findViewById(R.id.ibtnMates);
        ImageButton downloadFiguras=findViewById(R.id.ibtnFiguras);

        downloadLetras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.cursosinea.conevyt.org.mx/descargables/mevyt_pdfs/la_palabra/01_lp_libro.pdf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        downloadMates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.cursosinea.conevyt.org.mx/descargables/mevyt_pdfs/matematicas_empezar/01_matematicas_pe_libro.pdf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        downloadFiguras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.cursosinea.conevyt.org.mx/descargables/mevyt_pdfs/figuras_medidas/01_figuras_medidas_libro.pdf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

}
