package com.example.aplikasilistwisatasemarang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),WisataSemarang.class);
            startActivity(intent1);
        });

    }
}