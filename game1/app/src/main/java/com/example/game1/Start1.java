package com.example.game1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Start1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start1);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageButton buttonWhat = (ImageButton) findViewById(R.id.imageButton4);
        buttonWhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Start1.this, Start2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
    }
}