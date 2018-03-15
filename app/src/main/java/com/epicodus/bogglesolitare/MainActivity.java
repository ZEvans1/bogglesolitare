package com.epicodus.bogglesolitare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import butterknife.ButterKnife;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonGoToGame) Button mButtonGoToGame;

    private String[] letters = new String[] {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    private String[] vowels = new String[] {"A", "E", "I", "O", "U"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mButtonGoToGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mButtonGoToGame) {
            ArrayList<String> letterArrayList = new ArrayList<String>();
            Random rand = new Random();

            for (int i = 0; i < 6; i++) {
                int randLetter = rand.nextInt(letters.length);
                letterArrayList.add(letters[randLetter]);
            }

            for (int i = 6; i < 8; i++) {
                int randVowel = rand.nextInt(vowels.length);
                letterArrayList.add(vowels[randVowel]);
            }


            Intent intent = new Intent(MainActivity.this, BoggleActivity.class);
            intent.putStringArrayListExtra("letterArrayList", letterArrayList);

            startActivity(intent);

        } else {

        }
    }

}

