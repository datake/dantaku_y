package com.example.owner.keisan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    TextView text;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText("0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void one(View v) {
        number = number*10 + 1;
        text.setText(String.valueOf(number));

    }
    public void two(View v) {
        number = number*10 + 2;
        text.setText(String.valueOf(number));

    }
    public  void  three(View v) {
        number=number*10   +3;
        text.setText(String.valueOf(number));

    }
    public void  four(View v) {
        number=number*10   +4;
        text.setText(String.valueOf(number));

    }
    public void  five(View v) {
        number=number*10   +5;
        text.setText(String.valueOf(number));

    }
    public void  six(View v) {
        number=number*10   +6;
        text.setText(String.valueOf(number));

    }
    public void  seven(View v) {
        number=number*10   +7;
        text.setText(String.valueOf(number));

    }
    public void  eight(View v) {
        number=number*10   +8;
        text.setText(String.valueOf(number));

    }
    public void nine(View v) {
        number=number*10   +9;
        text.setText(String.valueOf(number));

    }
    public void clear(View v) {
        number=0;
        text.setText(String.valueOf(number));

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
