package com.example.game1;


import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class Hint extends AppCompatActivity {
    int number = 13;

    public int getNumber() {
        number--;
        return number;
    }

}
