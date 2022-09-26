package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.params.BlackLevelPattern;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    EditText et;
    public static double sum;
    int siman;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editTextNumberSigned);
        sum = 0;
        siman = 0;
    }

    public boolean check(String str){
        if(str.equals("") || str.equals("-") || str.equals(".") || str.equals("-."))
        {
            return false;
        }
        else {
            return  true;
        }
    }

    public void cul(int a,double b) {
        switch (a) {
            case 0:
                sum = b;
                break;
            case 1:
                sum = sum + (b);
                break;
            case 2:
                sum = sum - (b);
                break;
            case 3:
                sum = sum * (b);
                break;
            case 4:
                sum = sum / (b);
                break;
        }
    }


    public void plus(View view) {
        String st = et.getText().toString();
        boolean legalnum = check(st);
        if(legalnum) {
            Double answer1 = Double.parseDouble(st);
            cul(siman, answer1);
            siman = 1;
            et.setText("");
            et.setHint(sum+"+");
        }
        else{
            Toast.makeText(this, "Wrong input,try again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void sub(View view) {
        String st = et.getText().toString();
        boolean legalnum = check(st);
        if(legalnum) {
            Double answer1 = Double.parseDouble(st);
            cul(siman, answer1);
            siman = 2;
            et.setText("");
            et.setHint(sum+"-");
        }
        else{
            Toast.makeText(this, "Wrong input,try again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void mul(View view) {
        String st = et.getText().toString();
        boolean legalnum = check(st);
        if(legalnum) {
            Double answer1 = Double.parseDouble(st);
            cul(siman, answer1);
            siman = 3;
            et.setText("");
            et.setHint(sum+"x");
        }
        else{
            Toast.makeText(this, "Wrong input,try again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void div(View view) {
        String st = et.getText().toString();
        boolean legalnum = check(st);
        if(legalnum) {
            Double answer1 = Double.parseDouble(st);
            cul(siman, answer1);
            siman = 4;
            et.setText("");
            et.setHint(sum+"/");
        }
        else{
            Toast.makeText(this, "Wrong input,try again!", Toast.LENGTH_SHORT).show();
        }
    }

    public void equal(View view) {
        String st = et.getText().toString();
        boolean legalnum = check(st);
        if (legalnum) {
            Double answer1 = Double.parseDouble(st);
            cul(siman, answer1);
            String s = Double.toString(sum);
            et.setText(s);
            siman = 0;
        }
        else{
            Toast.makeText(this, "Wrong input,try again!", Toast.LENGTH_SHORT).show();
        }
    }


    public void ac(View view) {
        sum = 0.0;
        siman = 0;
        et.setText("");
        et.setHint("");
    }

    public void credits(View view) {
        Intent si = new Intent(this,intent2.class);
        si.putExtra("dorel",sum);
        startActivity(si);

    }
}