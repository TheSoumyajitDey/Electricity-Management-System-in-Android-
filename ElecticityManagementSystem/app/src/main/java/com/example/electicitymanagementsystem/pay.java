package com.example.electicitymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pay extends AppCompatActivity {


    Button a ,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
      a = (Button) findViewById(R.id.paybutton1);
      b = (Button) findViewById(R.id.paybutton2);
      a.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              nextPage();
          }
      });
      b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              nextPage();
          }
      });

    }

    public void nextPage(){
        Intent intent = new Intent(this,portal.class);
        startActivity(intent);
    }

}
