package com.example.game1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Level10_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level10_1);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        stopService(new Intent(this, EspanaMusic.class));
        ImageButton button_start = findViewById(R.id.level2_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level10_1.this, Level10_2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level10_1.this, Espana.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}
