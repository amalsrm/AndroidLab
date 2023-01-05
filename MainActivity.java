package com.amalsrm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Float num1,num2,num3;
    Boolean add=false,mul=false,div=false,sub=false,clear=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText display=(EditText) findViewById(R.id.ed1);
        Button bplus=(Button)findViewById(R.id.bplus);
        Button bminus=(Button)findViewById(R.id.bminus);
        Button bmul=(Button)findViewById(R.id.bmul);
        Button bdiv=(Button)findViewById(R.id.bdiv);
        Button bequal=(Button)findViewById(R.id.bequal);
        Button bclear=(Button)findViewById(R.id.bclear);

        Button b1=(Button) findViewById(R.id.b1);
        Button b2=(Button) findViewById(R.id.b2);
        Button b3=(Button) findViewById(R.id.b3);
        Button b4=(Button) findViewById(R.id.b4);
        Button b5=(Button) findViewById(R.id.b5);
        Button b6=(Button) findViewById(R.id.b6);
        Button b7=(Button) findViewById(R.id.b7);
        Button b8=(Button) findViewById(R.id.b8);
        Button b9=(Button) findViewById(R.id.b9);
        Button b0=(Button) findViewById(R.id.b0);
        Button bdot=(Button)findViewById(R.id.bdot);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"0");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText().length()!=0)
                {
                    num1=Float.parseFloat(display.getText().toString());
                    display.setText("");
                    add=true;
                }

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText().length()!=0){
                    num1=Float.parseFloat(display.getText().toString());
                    sub=true;
                    display.setText("");
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText()!=null)
                {
                    num1=Float.parseFloat(display.getText().toString());
                    display.setText("");
                    mul=true;
                }

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText()!=null)
                {
                    num1=Float.parseFloat(display.getText().toString());
                    display.setText("");
                    div=true;
                }

            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+".");

            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    display.setText("");

            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (add){
                    num2=Float.parseFloat(display.getText().toString());
                    num3=(num1+num2);
                    display.setText(num3+"");
                    Toast.makeText(getApplicationContext(),"ac",Toast.LENGTH_SHORT).show();
                    add=false;
                }
                if (sub){
                    num2=Float.parseFloat(display.getText().toString());
                    display.setText(num1-num2+"");
                    sub=false;
                }
                if (mul){
                    num2=Float.parseFloat(display.getText().toString());
                    display.setText(num1*num2+"");
                    mul=false;
                }
                if (div){
                    num2=Float.parseFloat(display.getText().toString());
                    display.setText(num1/num2+"");
                    div=false;
                }
            }
        });
    }
}