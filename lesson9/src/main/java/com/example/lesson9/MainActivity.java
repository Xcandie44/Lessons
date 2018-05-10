package com.example.lesson9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button ok,can;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        ok = (Button) findViewById(R.id.button);
        can = (Button) findViewById(R.id.button2);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
                        tv.setText("ОК");
                    break;
                    case R.id.button2:
                        tv.setText("Cancel");
                }
            }
        };
        ok.setOnClickListener(click);
        can.setOnClickListener(click);
    }


}
