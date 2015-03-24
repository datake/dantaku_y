package com.example.owner.keisan;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    int number;
    int number2;
    int answer;
    int ope;

   //準備３

   TextView text;
    TextView opeText;
    TextView num2Text;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //各変数を初期化
        number=0;
        number2=0;
        answer=0;
        ope=0;

        //ラベルを関連付け
        text = (TextView) findViewById(R.id.textView);
        /*opeText = (TextView)findViewById(R.id.ope);
        num2Text = (TextView)findViewById(R.id.num2);
        answerText = (TextView)findViewById(R.id.answer);*/

        //ラベルを初期状態に

        text.setText("0");
        /*opeText.setText("opetext");
        num2Text.setText("num2text");
        answerText.setText("answertext");*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void one(View v) {
        if(ope ==0) {
            number = number * 10 + 1;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 1;
            text.setText(number2 + "");
        }
    }
    public void two(View v) {
       /* number = number*10 + 2;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 2;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 2;
            text.setText(number2+"");

        }

    }
    public  void  three(View v) {
        /*number=number*10   +3;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 3;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 3;
            text.setText(number2+"");
        }

    }
    public void  four(View v) {
        /*number=number*10   +4;
        text.setText(String.valueOf(number));*/

        if(ope ==0) {
            number = number * 10 + 4;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 4;
            text.setText(number2+"");
        }

    }
    public void  five(View v) {
        /*number=number*10   +5;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 5;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 5;
            text.setText(number2+"");
        }

    }
    public void  six(View v) {
        /*number=number*10   +6;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 6;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 6;
            text.setText(number2+"");
        }

    }
    public void  seven(View v) {
        /*number=number*10   +7;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 7;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 7;
            text.setText(number2+"");
        }

    }
    public void  eight(View v) {
        /*number=number*10   +8;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 8;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 8;
            text.setText(number2+"");
        }

    }
    public void nine(View v) {
        /*number=number*10   +9;
        text.setText(String.valueOf(number));*/
        if(ope ==0) {
            number = number * 10 + 9;
            text.setText(String.valueOf(number));
        }else if(ope>0){
            number2 = number2 * 10 + 9;
            text.setText(number2+"");
        }

    }
    //クリアの処理
    public void clear(View v) {

        number=0;
        number2=0;
        answer=0;
        ope=0;
        text.setText(String.valueOf(number));
        /*num2Text.setText(String.valueOf(number2));
        answerText.setText(String.valueOf(answer));
        opeText.setText(String.valueOf(ope));*/


    }

    //+ボタンが押された処理
    public void plus(View v){
        ope=1;

        text.setText("+");
    }

    public void equal(View v){
        if(ope ==1){
            answer = number+number2;
            text.setText("="+answer);
            ope=-1;
        }
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
