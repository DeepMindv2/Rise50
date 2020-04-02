package com.example.rise50;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {

    private static final String TAG = "SecondScreen";
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        Log.d(TAG, "onCreate: Starting");

        Button btnNavtoSecond = (Button) findViewById(R.id.relaxationBaseline);
        Button btnNavtoTask = (Button) findViewById(R.id.firstvideobtn);
        Button btnNavtoTask2 = (Button) findViewById(R.id.secondvideobtn);
        Button btnNavtoTask3 = (Button) findViewById(R.id.thirdvideobtn);


        btnNavtoSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked the Relaxation Button");

                Intent intent = new Intent(SecondScreen.this, RelaxationTimerScreen.class);
                startActivity(intent);

            }
        });

        btnNavtoTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondScreen.this, TaskScreen.class);
                startActivity(intent);
            }
        });

        btnNavtoTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondScreen.this, TaskScreen.class);
                startActivity(intent);
            }
        });

        btnNavtoTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondScreen.this, TaskScreen.class);
                startActivity(intent);
            }
        });


    }
}
