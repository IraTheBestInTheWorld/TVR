package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /*
        ImageButton buttonStart = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton buttonContinue = (ImageButton) findViewById(R.id.imageButton);
        ImageButton buttonExit = (ImageButton) findViewById(R.id.imageButton3);
        buttonStart.setOnClickListener(this);
        buttonContinue.setOnClickListener(this);
        buttonExit.setOnClickListener(this); */
    }
/*
    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.imageButton2:
                intent = new Intent(this, Start1.class);
                startActivity(intent);
                break;
        }
            /*

            switch (v.getId()) {
                case R.id.imageButton:
                    intent = new Intent(this, Activity6.class);
                    startActivity(intent);
                    break;
            }

            switch (v.getId()) {
                case R.id.btnAct4:
                    intent = new Intent(this, Activity7.class);
                    startActivity(intent);
                    break;
            } */
    }
