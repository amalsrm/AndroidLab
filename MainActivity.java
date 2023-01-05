package com.amalsrm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s="hai";
        Button b=(Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), ""+s1+"" +s2, Toast.LENGTH_SHORT).show();
                Intent in=new Intent(MainActivity.this,MainActivity2.class);
                in.putExtra("abc",s);
                startActivity(in);
            }

        });
    }
    String s1,s2;
    public void clicks(View view){
        CheckBox checkBox = (CheckBox) view;
        boolean ischeck=checkBox.isChecked();
        switch(checkBox.getId())
        {
            case R.id.checkBox:
                if (ischeck)
                    s1=checkBox.getText().toString();
                break;
            case R.id.checkBox2:
                if (ischeck)
                    s2=checkBox.getText().toString();
                break;
            default:
                break;
        }

    }
}