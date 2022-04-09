package com.example.game1;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hint extends AppCompatActivity {
    private final Context context;
    int number = 13;

    TextView hint_number;
    ImageButton bulb;


    public  Hint (Context context){
        this.context=context;
        setContentView(R.layout.level1_2);
        bulb = findViewById(R.id.btn_hint);
        hint_number = findViewById(R.id.hint_number);
    }


    public void useHint(){
        number--;
        hint_number.setText(number);
    }
}
