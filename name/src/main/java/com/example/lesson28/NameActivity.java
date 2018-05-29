package com.example.lesson28;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        et = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View v){
        Intent intent = new Intent();
        intent.putExtra("name",et.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
