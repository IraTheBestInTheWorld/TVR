package com.example.game1;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
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
        final StringBuilder[] guessWord = {new StringBuilder(str)};

        TextView letter1 = findViewById(R.id.letter1);
        TextView letter2 = findViewById(R.id.letter2);
        TextView letter3 = findViewById(R.id.letter3);
        TextView letter4 = findViewById(R.id.letter4);
        TextView letter5 = findViewById(R.id.letter5);
        TextView letter6 = findViewById(R.id.letter6);
        TextView letter7 = findViewById(R.id.letter7);
        TextView letter8 = findViewById(R.id.letter8);
        TextView letter9 = findViewById(R.id.letter9);

        int[] drawables = {R.drawable.gradient_slytherin, R.drawable.gradient_blue, R.drawable.gradient_orange};
        final int[] color = {0};

        final TextView[][] lastClicked = {{null}};

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
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                TextView letter = findViewById(v.getId());

                if (letter.getTooltipText().equals("empty")) {

                    boolean valid = false;
                    switch (v.getId()) {
                        case R.id.letter1:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter2 || lastClicked[0][0] == letter4) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter2:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter1 || lastClicked[0][0] == letter3 || lastClicked[0][0] == letter5) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter3:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter2 || lastClicked[0][0] == letter6) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter4:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter1 || lastClicked[0][0] == letter5 || lastClicked[0][0] == letter7) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter5:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter2 || lastClicked[0][0] == letter4 || lastClicked[0][0] == letter6 || lastClicked[0][0] == letter8) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter6:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter3 || lastClicked[0][0] == letter5 || lastClicked[0][0] == letter9) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter7:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter4 || lastClicked[0][0] == letter8) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter8:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter5 || lastClicked[0][0] == letter7 || lastClicked[0][0] == letter9) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter9:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter6 || lastClicked[0][0] == letter8) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                    }
                    if (valid) {
                        letter.setBackgroundResource(R.drawable.gradient_snake);
                        letter.setTooltipText("selected");
                        lastClicked[0][0] = letter;
                        CharSequence character = letter.getText();
                        guessWord[0].append(character);

                    }
                }
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


        Button.OnClickListener onClickListenerButton =  new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                TextView textView = null;
                Boolean isGuessed = false;

                if (guessWord[0].toString().equals("MAGIC")) {
                    textView = ntg_1;
                    isGuessed = true;
                }
                if (guessWord[0].toString().equals("OPEN")) {
                    textView = ntg_2;
                    isGuessed = true;
                }

                if (isGuessed) {
                    textView.setTextColor(0x265E4A);

                    for (int i = 0; i < 9; i++) {
                        if (buttons[i].getTooltipText().equals("selected")) {
                            buttons[i].setBackground(null);
                            buttons[i].setBackgroundResource(drawables[color[0]]);
                            buttons[i].setTextColor(Color.WHITE);
                            buttons[i].setTooltipText("guessed");;
                        }
                    }
                    color[0] += 1;
                } else {

                    for (int i = 0; i < 9; i++) {
                        if (buttons[i].getTooltipText().equals("selected")) {
                            buttons[i].setBackground(null);
                            buttons[i].setBackgroundResource(R.color.white);
                            buttons[i].setTooltipText("empty");

                        }
                    }
                }
                guessWord[0].delete(0, guessWord[0].length());
                lastClicked[0][0] = null;
                //popup_if_wrong
            }
           
        };

        btnGuessWord.setOnClickListener(onClickListenerButton);


    }
}


