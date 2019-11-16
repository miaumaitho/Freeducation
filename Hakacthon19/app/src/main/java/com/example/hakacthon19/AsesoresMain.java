package com.example.hakacthon19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AsesoresMain extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asesores_main);
        //

        Button downloadButton= (Button) findViewById(R.id.btnModulos);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*String url = "http://www.cursosinea.conevyt.org.mx/descargables/mevyt_pdfs/matematicas_empezar/01_matematicas_pe_libro.pdf";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);*/
            }
        });
    }


}
