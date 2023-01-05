package com.amalsrm.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double total;
    String c1,s,s1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total=0.0;


    }
    // CheckBox onClick event handle
    public void checkClick(View view){
        CheckBox checkbox = (CheckBox)view;//same as radioButon
        boolean  ischeck = checkbox.isChecked();
        switch(checkbox.getId()){
            case R.id.check_100:
                s=checkbox.getText().toString();
                if(ischeck) total+=100;
                else{ total-=100;
                Toast.makeText(MainActivity.this,"ffhcvghvg"+total,Toast.LENGTH_SHORT).show();}
                break;
            case R.id.check_200:
                s1=checkbox.getText().toString();
                if(ischeck) total+=200;
                else total-=200;
                break;
            case R.id.check_300:
                if(ischeck) total+=300;
                else total-=300;
                break;
            case R.id.check_400:
                if(ischeck) total+=400;
                else total-=400;
                break;
            case R.id.check_500:
                if(ischeck) total+=500;
                else total-=500;
                break;
            default:
                break;
        }
        CheckBox c11=(CheckBox) findViewById(R.id.check_100);
        c1="54";
        Button bi=(Button)findViewById(R.id.button);
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=s+s1;
                Toast.makeText(MainActivity.this,"Total : "+str,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("chk",c1);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "opening browser..", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("https://google.com"));
                startActivity(myIntent);
            }
        });
    }

}