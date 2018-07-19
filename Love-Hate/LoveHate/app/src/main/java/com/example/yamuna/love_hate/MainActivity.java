package com.example.yamuna.love_hate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] drawables_love={
            R.drawable.riding,R.drawable.teddybear,R.drawable.drawing
    };
    int[] drawables_hate={
            R.drawable.bitter_gourd,R.drawable.spinach,R.drawable.vegetables
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private int love(){
        Random random = new Random();
        int randomNumber = random.nextInt(3)+1; //to change the lower limit from 0 to 1
        return randomNumber;
    }
    private int hate(){
        Random random = new Random();
        int randomNumber = random.nextInt(3)+1; //to change the lower limit from 0 to 1
        return randomNumber;
    }
    public void loveButtonClick(View v) {
        int number = love();
        ImageView img_love = findViewById(R.id.love);
        img_love.setImageResource(drawables_love[number - 1]);
    }

    public void hateButtonClick(View v) {
        int number = hate();
        ImageView img_love = findViewById(R.id.hate);
        img_love.setImageResource(drawables_hate[number - 1]);
    }
}
