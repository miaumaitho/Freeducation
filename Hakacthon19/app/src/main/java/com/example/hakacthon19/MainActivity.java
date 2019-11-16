package com.example.hakacthon19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tvTitle);
        Spannable wordtoSpan = new SpannableString("FREEDUCATION");
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.WHITE), 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(getColor(R.color.colorAccent)), 3, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(wordtoSpan);

        Button btn = (Button)findViewById(R.id.btnInicio);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EleccionUsuario.class));
            }
        });

    }



}
