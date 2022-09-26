package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class intent2 extends AppCompatActivity {
    TextView tv;
    Button btn;
    Double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        tv = findViewById(R.id.textView);
        Intent gi = getIntent();
        sum = gi.getDoubleExtra("dorel",-100000);
        tv.setText("This is the last result calculated by the calculator: "+sum);

    }

    public void back(View view) {
        finish();


    }
}