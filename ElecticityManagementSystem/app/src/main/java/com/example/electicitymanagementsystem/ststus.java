package com.example.electicitymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

public class ststus extends AppCompatActivity {

    TextView a;
    Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ststus);
       a = (TextView)findViewById(R.id.bill);
       String b = String.valueOf(randomPriceGenerator());
       a.setText("Your Bill:"+ b);
       pay = (Button) findViewById(R.id.paybutton);
       pay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Paypage();
           }
       });


    }

    public int randomPriceGenerator(){
        Random rn = new Random();
        int n = 10000 - 1000 + 1;
        int i = rn.nextInt() % n;
        return(1000 + i);
    }

    public void Paypage(){
        Intent intent = new Intent(this,pay.class);
        startActivity(intent);
    }


}
