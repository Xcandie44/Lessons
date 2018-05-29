package com.example.lesson19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation anim;
    ImageView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = (ImageView) findViewById(R.id.imageView);

    }

    public void OnClick(View v){
        anim = AnimationUtils.loadAnimation(this,R.anim.animation1);
        s.startAnimation(anim);
    }
}
