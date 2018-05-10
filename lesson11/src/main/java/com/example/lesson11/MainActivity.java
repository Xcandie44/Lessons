package com.example.lesson11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.text);
    }

    public void onOkClick(View v){
        tv.setText("Нажата кнопка ок");
        Toast.makeText(getApplicationContext(),"Нажата кнопка ок",Toast.LENGTH_SHORT).show();
    }
    public void onCancelClick(View v){
        tv.setText("Нажата кнопка cancel");
        Toast.makeText(getApplicationContext(),"Нажата кнопка cancel",Toast.LENGTH_SHORT).show();
    }
}
