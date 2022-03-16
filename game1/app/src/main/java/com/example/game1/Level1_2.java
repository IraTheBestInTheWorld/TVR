package com.example.game1;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Level1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1_2);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        String str = "";
        StringBuilder guessWord = new StringBuilder(str);

        Button letter1 = findViewById(R.id.letter1);
        Button letter2 = findViewById(R.id.letter2);
        Button letter3 = findViewById(R.id.letter3);
        Button letter4 = findViewById(R.id.letter4);
        Button letter5 = findViewById(R.id.letter5);
        Button letter6 = findViewById(R.id.letter6);
        Button letter7 = findViewById(R.id.letter7);
        Button letter8 = findViewById(R.id.letter8);
        Button letter9 = findViewById(R.id.letter9);
        Button lastClicked = null;

        Integer xxx = 0;

        ImageView btnGuessWord = findViewById(R.id.btnGuessWord);

        TextView ntg_1 = findViewById(R.id.ntg_1);
        TextView ntg_2 = findViewById(R.id.ntg_2);

        Button[] buttons = {letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9};
        ArrayList<Button> btns = new ArrayList<Button>();
        btns.add(letter1);
        btns.add(letter2);
        btns.add(letter3);

        ArrayList<StringBuilder> russianWords = new ArrayList<StringBuilder>();
        russianWords.add(new StringBuilder("MAGIC"));
        russianWords.add(new StringBuilder("OPEN"));


        btnGuessWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = ntg_1;
                Boolean isFound = false;
                if (guessWord == new StringBuilder("MAGIC")){
                    textView = ntg_1;
                    isFound = true;
                }

                if (guessWord == new StringBuilder("OPEN")){
                    textView = ntg_2;
                    isFound = true;
                }
                if (isFound){
                    textView.setTextColor(0x265E4A);
                    for (int i = 0; i < 9; i++){
                        ColorDrawable buttonBackground = (ColorDrawable) btns.get(i).getBackground();
                        int btnColor = buttonBackground.getColor();
                        if (btnColor == 0x3BEECE){
                            btns.get(i).setBackgroundColor(R.drawable.gradient_slytherin);
                        }

                    }

                    }

                    }
                    

        };


        letter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lastClicked == null|| lastClicked == letter2 || lastClicked == letter4) {
                    letter1.setBackgroundColor(0x3BEECE);
                    CharSequence character = letter1.getText();
                    guessWord.append(character);
                }
            }
        });



    }
    // системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level1_2.this, Level1_1.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}
