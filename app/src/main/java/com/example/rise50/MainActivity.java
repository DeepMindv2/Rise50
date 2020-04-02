package com.example.rise50;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");


        ImageView logo = (ImageView) findViewById(R.id.firstImage);

        int imageResource = getResources().getIdentifier("@drawable/logo", null, this.getPackageName());
        logo.setImageResource(imageResource);




        Button btnNavtoSecond = (Button) findViewById(R.id.buttonto2ndpage);

        btnNavtoSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnto2ndpage");

                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);


            }
        });

    }
}
