package com.example.lesson102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bot_tv = (TextView) findViewById(R.id.bot_tv);
        Button bot_button = (Button) findViewById(R.id.bot_button);
        LinearLayout bot_layout = (LinearLayout) findViewById(R.id.bot_layout);
        bot_layout.setBackgroundResource(R.color.bottomcolor);
        bot_button.setText(R.string.bottombutton);
        bot_tv.setText(R.string.bottomtext);
    }
}
