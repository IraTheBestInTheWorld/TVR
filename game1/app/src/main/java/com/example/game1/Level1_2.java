package com.example.game1;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
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
import androidx.core.graphics.drawable.DrawableCompat;

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

        TextView letter1 = findViewById(R.id.letter1);
        TextView letter2 = findViewById(R.id.letter2);
        TextView letter3 = findViewById(R.id.letter3);
        TextView letter4 = findViewById(R.id.letter4);
        TextView letter5 = findViewById(R.id.letter5);
        TextView letter6 = findViewById(R.id.letter6);
        TextView letter7 = findViewById(R.id.letter7);
        TextView letter8 = findViewById(R.id.letter8);
        TextView letter9 = findViewById(R.id.letter9);


        final TextView[] lastClicked = {null};

        Integer xxx = 0;

        ImageView btnGuessWord = findViewById(R.id.btnGuessWord);

        TextView ntg_1 = findViewById(R.id.ntg_1);
        TextView ntg_2 = findViewById(R.id.ntg_2);

        TextView[] buttons = {letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9};
        ArrayList<TextView> btns = new ArrayList<TextView>();
        btns.add(letter1);
        btns.add(letter2);
        btns.add(letter3);

        ArrayList<StringBuilder> russianWords = new ArrayList<StringBuilder>();
        russianWords.add(new StringBuilder("MAGIC"));
        russianWords.add(new StringBuilder("OPEN"));


        TextView.OnClickListener onClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView letter = findViewById(v.getId());
                int letter_id = v.getId();

                if (letter.getBackground() = R.drawable.gradient_snake;{



                }
                boolean valid = false;

                switch (v.getId()){
                    case R.id.letter1:
                        if(lastClicked[0] == null || lastClicked[0] == letter2 || lastClicked[0] == letter4){
                            valid = true;
                        }
                        else { valid = false;
                        }
                        break;
                    case R.id.letter2:
                        if(lastClicked[0] == null || lastClicked[0] == letter1 || lastClicked[0] == letter3 || lastClicked[0] == letter5){
                            valid = true;
                        }
                        else { valid = false;
                        }
                        break;
                    case R.id.letter3:
                        if(lastClicked[0] == null || lastClicked[0] == letter2 || lastClicked[0] == letter6){
                            valid = true;
                        }
                        else { valid = false;
                        }
                        break;
                    case R.id.letter4:
                        if(lastClicked[0] == null || lastClicked[0] == letter1 || lastClicked[0] == letter5 || lastClicked[0] == letter7){
                            valid = true;
                        }
                        else { valid = false;
                        }
                        break;
                    case R.id.letter5:
                        if(lastClicked[0] == null || lastClicked[0] == letter2 || lastClicked[0] == letter4 || lastClicked[0] == letter6 || lastClicked[0] == letter8){
                            valid = true;
                        }
                        else { valid = false;
                        }
                        break;
                    case R.id.letter6:
                        if(lastClicked[0] == null || lastClicked[0] == letter3 || lastClicked[0] == letter5 || lastClicked[0] == letter9) {
                            valid = true;
                        }
                        else { valid = false; }
                        break;
                    case R.id.letter7:
                        if(lastClicked[0] == null || lastClicked[0] == letter4 || lastClicked[0] == letter8) {
                            valid = true;
                        }
                        else { valid = false; }
                        break;
                    case R.id.letter8:
                        if(lastClicked[0] == null || lastClicked[0] == letter5 || lastClicked[0] == letter7 || lastClicked[0] == letter9) {
                            valid = true;
                        }
                        else { valid = false; }
                        break;
                    case R.id.letter9:
                        if(lastClicked[0] == null || lastClicked[0] == letter6 || lastClicked[0] == letter8) {
                            valid = true;
                        }
                        else { valid = false; }
                        break;

                }
                    letter.setBackgroundResource(R.drawable.gradient_snake);
                    CharSequence character = letter.getText();
                    lastClicked[0] = letter;
                    guessWord.append(character);
            }
        };

        letter1.setOnClickListener(onClickListener);
        letter2.setOnClickListener(onClickListener);
        letter3.setOnClickListener(onClickListener);
        letter4.setOnClickListener(onClickListener);
        letter5.setOnClickListener(onClickListener);
        letter6.setOnClickListener(onClickListener);
        letter7.setOnClickListener(onClickListener);
        letter8.setOnClickListener(onClickListener);
        letter9.setOnClickListener(onClickListener);

        btnGuessWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = ntg_1;
                Boolean isFound = false;
                if (guessWord == new StringBuilder("MAGIC")) {
                    textView = ntg_1;
                    isFound = true;
                }
                if (guessWord == new StringBuilder("OPEN")) {
                    textView = ntg_2;
                    isFound = true;
                }
                if (isFound) {
                    textView.setTextColor(0x265E4A);
                    for (int i = 0; i < 9; i++) {
                        ColorDrawable buttonBackground = (ColorDrawable) btns.get(i).getBackground();
                        int btnColor = buttonBackground.getColor();
                        if (btnColor == 0x3BEECE) {
                            btns.get(i).setBackgroundColor(R.drawable.gradient_slytherin);
                        }
                    }
                }
            }
        });
    }
}


