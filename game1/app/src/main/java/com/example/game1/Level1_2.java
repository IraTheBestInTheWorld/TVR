package com.example.game1;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
        Integer xxx = 0;

        ImageView btnGuessWord = findViewById(R.id.btnGuessWord);

        TextView ntg_1 = findViewById(R.id.ntg_1);
        TextView ntg_2 = findViewById(R.id.ntg_2);
        TextView[] ntg_words = {ntg_1, ntg_2};

        btnGuessWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isFound = false;
                for (int i = 0; i < 2; i++) {
                    StringBuilder ngt = (StringBuilder) ntg_words[i].getText();
                    if (ngt == guessWord){
                        isFound = true;
                        ntg_words = ArrayUtils.remove(ntg_words, i);
                }
                    if (isFound = true){
                        textView.setTextColor(0x265E4A);

                    }
                    
                }

            }
        });


        letter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (xxx == 0 || xxx == 2 || xxx == 4)
                {
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
