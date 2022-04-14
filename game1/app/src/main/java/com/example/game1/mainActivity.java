package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.game1.databinding.ActivityMainBinding;


public class mainActivity extends AppCompatActivity {


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
                    Intent intent = new Intent(mainActivity.this, Start1.class);
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
                    Intent intent = new Intent(mainActivity.this, Level1_1.class);
                    startActivity(intent);
                    finish();
                } else {
                }
                    if(level>=2){
                        Intent intent = new Intent(mainActivity.this, Level2_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=3){
                        Intent intent = new Intent(mainActivity.this, Level3_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=4){
                        Intent intent = new Intent(mainActivity.this, Level4_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=5){
                        Intent intent = new Intent(mainActivity.this, Level5_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=6){
                        Intent intent = new Intent(mainActivity.this, Level6_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=7){
                        Intent intent = new Intent(mainActivity.this, Level7_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=8){
                        Intent intent = new Intent(mainActivity.this, Level8_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=9){
                        Intent intent = new Intent(mainActivity.this, Level9_1.class);
                        startActivity(intent);
                        finish();
                    } else {
                    }
                    if(level>=10){
                        Intent intent = new Intent(mainActivity.this, Level10_1.class);
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
