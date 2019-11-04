package com.example.electicitymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class portal extends AppCompatActivity {
    Button qw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        qw = (Button)findViewById(R.id.homeeyy);
        qw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Payment was Successfull", LENGTH_SHORT).show();

                homepage();

            }
        });
    }

    public void homepage(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
