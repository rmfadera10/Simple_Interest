package com.letstravel.simple_interest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class Main2Activity extends AppCompatActivity {
private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2=(TextView)findViewById(R.id.textView11);

        Bundle bundle1=getIntent().getExtras();

        if(bundle1 != null){
            String result = bundle1.getString("Result");
            textView2.setText(result);
        }
        else {
            Toast.makeText(this, "No value", Toast.LENGTH_SHORT).show();
        }
    }
}
