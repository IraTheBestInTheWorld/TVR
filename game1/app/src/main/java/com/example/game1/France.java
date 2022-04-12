package com.example.game1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


public class France extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 10000;
    static Context context;
    Timer t = new Timer();
    static Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.france);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        startService(new Intent(this, FranceMusic.class));
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        t.cancel();
                        Intent intent = new Intent(France.this, Level9_1.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        }, SPLASH_TIME_OUT, SPLASH_TIME_OUT);
        ImageButton button_start = findViewById(R.id.france);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(France.this, Level9_1.class);
                    startActivity(intent);
                    finish();
                    t.cancel();
                } catch (Exception e) {
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(France.this, Level8_2.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}
