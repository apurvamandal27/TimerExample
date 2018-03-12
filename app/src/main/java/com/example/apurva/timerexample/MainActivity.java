package com.example.apurva.timerexample;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.my_timer);
        Timer();
    }

    private  void Timer(){
        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Timer is: "+millisUntilFinished/1000 +" s");
            }

            @Override
            public void onFinish() {

                textView.setText("Timer is finished");

            }
        }.start();
    }
}
