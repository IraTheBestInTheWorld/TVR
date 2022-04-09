package com.example.game1;


import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class Hint extends AppCompatActivity {
<<<<<<< HEAD
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
=======
    int number = 13;

    public int getNumber() {
>>>>>>> 4932368d050a0f5288b1c890e3797be0b72746b2
        number--;
        return number;
    }

}
