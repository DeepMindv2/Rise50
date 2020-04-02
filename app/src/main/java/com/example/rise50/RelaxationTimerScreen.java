package com.example.rise50;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RelaxationTimerScreen extends AppCompatActivity {
    private TextView countdownText;
    private Button countdownButton;

    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 600000;
    private boolean timerRunning;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relaxationtimer);


        Button btnend = (Button) findViewById(R.id.btnGotoMainScreen);


        btnend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(RelaxationTimerScreen.this, SecondScreen.class);
                startActivity(intent);
            }
        });



        countdownText = findViewById(R.id.countdown_text);
        countdownButton = findViewById(R.id.countdown_button);

        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStop();
            }
        });

        updateTimer();
    }

    public void startStop() {

        if (timerRunning) {
            stopTimer();

        } else {
            startTimer();
        }

    }

    public void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMilliseconds = l;
                updateTimer();

            }

            @Override
            public void onFinish() {

            }


        }.start();

        countdownButton.setText("PAUSE");
        timerRunning = true;

    }

    public void stopTimer() {
        countDownTimer.cancel();
        countdownButton.setText("START");
        timerRunning = false;

    }

    public void updateTimer() {

        int minutes = (int) timeLeftInMilliseconds / 60000;
        int seconds = (int) timeLeftInMilliseconds % 60000 / 1000;

        String timeLeftText;

        timeLeftText = "" + minutes;
        timeLeftText += ":";
        if (seconds < 10) timeLeftText += "0";
        timeLeftText += seconds;

        countdownText.setText(timeLeftText);
    }





}
