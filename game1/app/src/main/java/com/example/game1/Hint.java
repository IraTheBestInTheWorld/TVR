package com.example.game1;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hint extends AppCompatActivity {
    private final Context context;
    ImageButton bulb = findViewById(R.id.btn_hint);
    TextView hint_number = findViewById(R.id.hint_number);
    int number = 13;

    public  Hint (Context context){
        this.context=context;
    }


    public void useHint(){
        number--;
        hint_number.setText(number);
    }
}
