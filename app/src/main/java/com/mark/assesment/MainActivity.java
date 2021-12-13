package com.mark.assesment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText us;
    Button ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us = findViewById(R.id.userm);
        ps = findViewById(R.id.pass);
        getSupportActionBar().hide();

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String arra = us.getText().toString();
                if (arra.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    intent.putExtra("NAME", arra);

                    startActivity(intent);
                }


            }

        });
    }
}
