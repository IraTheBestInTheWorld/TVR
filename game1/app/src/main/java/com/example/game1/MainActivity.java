package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level = save.getInt("Level", 1);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageButton buttonStart = (ImageButton) findViewById(R.id.start_main);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Start1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        ImageButton buttonContinue = (ImageButton) findViewById(R.id.continue_main);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(level>=1){
                    Intent intent = new Intent(MainActivity.this, Level1_2.class);
                    startActivity(intent);
                    finish();
                } else {
                }
                    if(level>=2){
                        Intent intent = new Intent(MainActivity.this, Level2_2.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=3){
                        Intent intent = new Intent(MainActivity.this, Level3_2.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=4){
                        Intent intent = new Intent(MainActivity.this, Level4_2.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=5){
                        Intent intent = new Intent(MainActivity.this, Level5_2.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=6){
                        Intent intent = new Intent(MainActivity.this, Level6_2.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=7){
                        Intent intent = new Intent(MainActivity.this, Level7_2.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                } catch (Exception e) {
                }
            }
        });
        ImageButton buttonExit = (ImageButton) findViewById(R.id.exit);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
