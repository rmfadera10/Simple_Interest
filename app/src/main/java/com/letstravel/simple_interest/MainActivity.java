package com.letstravel.simple_interest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editPrinciple, editTime,editRate;
private Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrinciple=(EditText)findViewById(R.id.editText);
        editTime=(EditText)findViewById(R.id.editText2);
        editRate=(EditText)findViewById(R.id.editText3);

        btncalculate=(Button)findViewById(R.id.button);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Float principle=Float.parseFloat(editPrinciple.getText().toString());
               Float time=Float.parseFloat(editTime.getText().toString());
               Float rate=Float.parseFloat(editRate.getText().toString());
               Float Result=(principle*time*rate)/100;
                Toast.makeText(MainActivity.this, "Simple Interest is"+Result, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Result", Result);
                startActivity(intent);
            }
        });

    }
}
