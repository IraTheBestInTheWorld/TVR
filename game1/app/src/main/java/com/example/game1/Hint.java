package com.example.game1;


import androidx.appcompat.app.AppCompatActivity;

public class Hint extends AppCompatActivity {

    int number = 3;

    public int getNumber(){
        return number;
    }

    public int getUsedNumber(){
        number--;
        return number;
    }

}
