package com.mark.assesment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tt;
String arra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
             tt = findViewById(R.id.txt);
             arra = getIntent().getStringExtra("NAME");
//        Intent intent= getIntent();
//        arra = intent.getStringExtra("NAME");
        tt.setText(arra);
    }
}