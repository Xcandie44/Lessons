package com.example.lesson13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    CheckBox chb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textview);
        chb = (CheckBox) findViewById(R.id.checkbox);

    }

    public boolean onCreateOptionsMenu(Menu m){
        m.add(0,1,0,"add");
        m.add(0,2,0,"edit");
        m.add(0,3,3,"delete");
        m.add(1,4,1,"copy");
        m.add(1,5,3,"paste");
        m.add(1,6,4,"exit");
        return super.onCreateOptionsMenu(m);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu m) {
        m.setGroupVisible(1,chb.isChecked());
        return super.onPrepareOptionsMenu(m);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        StringBuilder sb = new StringBuilder();
        sb.append("Item menu");
        sb.append("\r\n groupId:" + String.valueOf(item.getGroupId()));
        sb.append("\r\n itemId:" + String.valueOf(item.getItemId()));
        sb.append("\r\n order:" + String.valueOf(item.getOrder()));
        sb.append("\r\n title:" + item.getTitle());
        tv.setText(sb.toString());
        return super.onOptionsItemSelected(item);
    }
}
