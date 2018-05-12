package com.example.lesson18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    TextView tvResult; String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        tvResult = (TextView) findViewById(R.id.tvResult);


    }

    public void onClick(View v){
        float num1 = 0;
        float num2 = 0;
        float result = 0;

      if(etNum1.getText().equals(null)||etNum2.getText().equals(null)){
          return;
      }
      num1 = Float.parseFloat(etNum1.getText().toString());
      num2 = Float.parseFloat(etNum2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd: oper = "+";
            result = num1 + num2;
            break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
                case R.id.btnMult:
                    oper = "*";
                    result = num1 * num2;
                    break;
                    case R.id.btnDiv:
                        oper = "/";
                        result = num1 / num2;
                        break;
                        default:
                            break;
        }
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);

    }
}
