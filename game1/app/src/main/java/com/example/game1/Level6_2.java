package com.example.game1;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Level6_2 extends AppCompatActivity {

    final Context context = this;


    public void popUp(){
        final Dialog dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.popup_if_wrong);
        dialog.setTitle(" ");
        // set the custom dialog components - text, image and button
        ImageView image = (ImageView) dialog.findViewById(R.id.voldik_face_palm);
        image.setImageResource(R.drawable.voldik_face_palm);
        ImageView image1 = (ImageView) dialog.findViewById(R.id.do_you_speak);
        ImageButton dialogButton = (ImageButton) dialog.findViewById(R.id.yes_sorry);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void popUpEnd(){
        final Dialog dialog1 = new Dialog(context);
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.setContentView(R.layout.popup_level6_end);
        dialog1.setTitle(" ");
        // set the custom dialog components - text, image and button
        TextView text = (TextView) dialog1.findViewById(R.id.level6_text_end);
        ImageView image = (ImageView) dialog1.findViewById(R.id.popup);
        image.setImageResource(R.drawable.ic_popup);
        ImageView image1 = (ImageView) dialog1.findViewById(R.id.voldik_not_bad);
        ImageView image3 = (ImageView) dialog1.findViewById(R.id.level6_popup);
        ImageButton dialogButton1 = (ImageButton) dialog1.findViewById(R.id.continue_popup);
        // if button is clicked, close the custom dialog
        dialogButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 try {
                    Intent intent = new Intent(Level6_2.this, Level7_1.class );
                    startActivity(intent);
                    finish();
                } catch (Exception e){

                }
                dialog1.dismiss();
            }
        });

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level = save.getInt("Level", 1);
        if (level>6){

        } else {
            SharedPreferences.Editor editor = save.edit();
            editor.putInt("Level", 7);
            editor.commit();
        }
        dialog1.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level6_2);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        String str = "";
        final boolean[] hintIsActive = {false};

        ImageButton btnHint = findViewById(R.id.btn_hint);
        TextView numberHint = findViewById(R.id.hint_number);
        Hint hint = new Hint();

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
        TextView letter10 = findViewById(R.id.letter10);
        TextView letter11 = findViewById(R.id.letter11);
        TextView letter12 = findViewById(R.id.letter12);
        TextView letter13 = findViewById(R.id.letter13);
        TextView letter14 = findViewById(R.id.letter14);
        TextView letter15 = findViewById(R.id.letter15);
        TextView letter16 = findViewById(R.id.letter16);

        final int[] mistakesCounter = {0};

        final boolean[] levelIsPassed = {true};

        int[] drawables = {R.drawable.gradient_slytherin, R.drawable.gradient_blue, R.drawable.gradient_yellow};
        final int[] color = {0};


        ImageButton btnGuessWord = findViewById(R.id.btnGuessWord);
        ImageButton btnErase = findViewById(R.id.btnErase);

        //выключаем кнопочки

        btnGuessWord.setVisibility(View.INVISIBLE);
        btnErase.setVisibility(View.INVISIBLE);

        final TextView[][] lastClicked = {{null}};

        TextView ntg_1 = findViewById(R.id.ntg_1);
        TextView ntg_2 = findViewById(R.id.ntg_2);
        TextView ntg_3 = findViewById(R.id.ntg_3);

        TextView[] words = {ntg_1, ntg_2, ntg_3};

        TextView.OnClickListener onClickListenerForWords = new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {

                if(hintIsActive[0] == true) {
                    TextView word = findViewById(v.getId());

                    if (word == ntg_1) {
                        letter10.setTextColor(Color.parseColor("#59A905"));
                        letter10.setTextSize(40);
                        Typeface typeface = getResources().getFont(R.font.nunito_black);
                        letter10.setTypeface(typeface);
                        hintIsActive[0] = false;
                        ntg_1.setEnabled(false);
                    }

                    if (word == ntg_2) {
                        letter1.setTextColor(Color.parseColor("#59A905"));
                        letter1.setTextSize(40);
                        Typeface typeface = getResources().getFont(R.font.nunito_black);
                        letter1.setTypeface(typeface);
                        hintIsActive[0] = false;
                        ntg_2.setEnabled(false);
                    }

                    if (word == ntg_3) {
                        letter13.setTextColor(Color.parseColor("#59A905"));
                        letter13.setTextSize(40);
                        Typeface typeface = getResources().getFont(R.font.nunito_black);
                        letter13.setTypeface(typeface);
                        hintIsActive[0] = false;
                        ntg_3.setEnabled(false);
                    }

                    if (hintIsActive[0] == false) {
                        numberHint.setText("" + hint.getUsedNumber());
                        if (hint.getNumber() == 0) {
                            btnHint.setBackground(null);
                            btnHint.setImageResource(R.drawable.ic_nohintssvg);
                            btnHint.setEnabled(false);
                        }
                    }
                }
            }
        };

        for (TextView textView: words
        ) { textView.setOnClickListener(onClickListenerForWords);
        }

        TextView[] buttons = {letter1, letter2, letter3, letter4, letter5, letter6, letter7, letter8, letter9,letter10, letter11, letter12, letter13, letter14, letter15, letter16 };

        StringBuilder[] hiddenWords = {new StringBuilder("PARENTS"), new StringBuilder("SPELL"), new StringBuilder("SOUL")};


        TextView.OnClickListener onClickListener =  new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                TextView letter = findViewById(v.getId());

                if (letter.getTooltipText().equals("empty")) {

                    boolean valid = false;
                    switch (v.getId()) {
                        case R.id.letter1:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter2 || lastClicked[0][0] == letter5) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter2:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter1 || lastClicked[0][0] == letter3 || lastClicked[0][0] == letter6) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter3:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter2 || lastClicked[0][0] == letter4 || lastClicked[0][0] == letter7) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter4:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter3 || lastClicked[0][0] == letter8) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter5:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter1 || lastClicked[0][0] == letter6 || lastClicked[0][0] == letter9) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter6:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter2 || lastClicked[0][0] == letter5|| lastClicked[0][0] == letter7 || lastClicked[0][0] == letter10) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter7:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter3 || lastClicked[0][0] == letter6 || lastClicked[0][0] == letter8 || lastClicked[0][0] == letter11) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter8:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter4 || lastClicked[0][0] == letter7 || lastClicked[0][0] == letter12) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter9:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter5 || lastClicked[0][0] == letter10 || lastClicked[0][0] == letter13) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter10:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter6 || lastClicked[0][0] == letter9 || lastClicked[0][0] == letter11 || lastClicked[0][0] == letter14) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter11:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter7 || lastClicked[0][0] == letter10 || lastClicked[0][0] == letter12 || lastClicked[0][0] == letter15) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter12:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter8 || lastClicked[0][0] == letter11 || lastClicked[0][0] == letter16) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter13:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter9 || lastClicked[0][0] == letter14) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter14:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter10 || lastClicked[0][0] == letter13 || lastClicked[0][0] == letter15) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                            case R.id.letter15:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter11 || lastClicked[0][0] == letter14 || lastClicked[0][0] == letter16) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                            break;
                        case R.id.letter16:
                            if (lastClicked[0][0] == null || lastClicked[0][0] == letter12 || lastClicked[0][0] == letter15) {
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
                        btnGuessWord.setVisibility(View.VISIBLE);
                        btnErase.setVisibility(View.VISIBLE);


                    }
                }
            }
        };


        for(int i = 0; i < 16; i++){
            buttons[i].setOnClickListener(onClickListener);
        }

        btnErase.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 16; i++) {
                    if (buttons[i].getTooltipText().equals("selected")) {
                        buttons[i].setBackground(null);
                        buttons[i].setBackgroundResource(R.color.white);
                        buttons[i].setTooltipText("empty");
                    }
                }

                btnGuessWord.setVisibility(View.INVISIBLE);
                btnErase.setVisibility(View.INVISIBLE);
                guessWord[0].delete(0, guessWord[0].length());
                lastClicked[0][0] = null;
                levelIsPassed[0] = true;
            }
        });

        btnGuessWord.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                TextView textView = null;
                Boolean isGuessed = false;
                lastClicked[0][0] = null;

                if (hiddenWords[0] != null && guessWord[0].toString().equals(hiddenWords[0].toString())) {
                    textView = ntg_1;
                    isGuessed = true;
                    hiddenWords[0] = null;
                    textView.setEnabled(false);
                }
                if (hiddenWords[1] != null && guessWord[0].toString().equals(hiddenWords[1].toString())) {
                    textView = ntg_2;
                    isGuessed = true;
                    hiddenWords[1] = null;
                    textView.setEnabled(false);
                }
                if (hiddenWords[2] != null && guessWord[0].toString().equals(hiddenWords[2].toString())) {
                    textView = ntg_3;
                    isGuessed = true;
                    hiddenWords[2] = null;
                    textView.setEnabled(false);
                }

                btnGuessWord.setVisibility(View.INVISIBLE);
                btnErase.setVisibility(View.INVISIBLE);

                if (isGuessed) {


                    textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    textView.setTextColor(R.color.dark_green);
                    for (int i = 0; i < 16; i++) {
                        if (buttons[i].getTooltipText().equals("selected")) {
                            if((int)buttons[i].getTextSize() == 120){
                                buttons[i].setTextSize(32);
                                Typeface typeface = getResources().getFont(R.font.nunito_bold);
                                buttons[i].setTypeface(typeface);
                            }
                            buttons[i].setBackground(null);
                            buttons[i].setBackgroundResource(drawables[color[0]]);
                            buttons[i].setTextColor(Color.WHITE);
                            buttons[i].setTooltipText("guessed");
                        }
                    }
                    color[0] += 1;

                } else {
                    for (int i = 0; i < 16; i++) {
                        if (buttons[i].getTooltipText().equals("selected")) {

                            buttons[i].setBackground(null);
                            buttons[i].setBackgroundResource(R.color.white);
                            buttons[i].setTooltipText("empty");

                        }
                    }
                    mistakesCounter[0]++;
                    if (mistakesCounter[0] == 3){
                        popUp();
                        mistakesCounter[0] = 0;
                    }
                }

                btnGuessWord.setVisibility(View.INVISIBLE);
                btnErase.setVisibility(View.INVISIBLE);
                guessWord[0].delete(0, guessWord[0].length());
                lastClicked[0][0] = null;
                levelIsPassed[0] = true;

                for (StringBuilder stringBuilder : hiddenWords) {
                    if (stringBuilder != null) {
                        levelIsPassed[0] = false;
                        break;
                    }
                }
                if(levelIsPassed[0]){
                    popUpEnd();
                }
            }
        });

        btnHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar snackbar = Snackbar.make(findViewById(R.id.rootLayout), "Выберите слово вверху", Snackbar.LENGTH_LONG);
                snackbar.show();
                hintIsActive[0] = true;

            }
        });

    }

    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level6_2.this, Level6_1.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}


