package com.example.lesson16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            llMain = (LinearLayout) findViewById(R.id.llMain);
            rgGravity = (RadioGroup) findViewById(R.id.radiogroup);

            etName = (EditText) findViewById(R.id.etName);
            btnCreate = (Button) findViewById(R.id.btnCreate);
            btnCreate.setOnClickListener((View.OnClickListener) MainActivity.this);
            btnClear = (Button) findViewById(R.id.btnClear);
            btnClear.setOnClickListener(MainActivity.this);
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),String.valueOf(e),Toast.LENGTH_LONG).show();
        }
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreate:
                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                int btnGravity = Gravity.LEFT;

                switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.radio1:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.radio2:
                        btnGravity = Gravity.CENTER_HORIZONTAL;
                        break;
                    case R.id.radio3:
                        btnGravity = Gravity.RIGHT;
                        break;
                }
                lParams.gravity = btnGravity;
                Button btnNew = new Button(this);
                btnNew.setText(etName.getText().toString());
                llMain.addView(btnNew, lParams);
                break;

            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}

