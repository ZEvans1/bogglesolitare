package com.epicodus.bogglesolitare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import butterknife.ButterKnife;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonCreateBoggleArray) Button mButtonCreateBoggleArray;

    private String[] letters = new String[] {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    private String[] vowels = new String[] {"A", "E", "I", "O", "U"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mButtonCreateBoggleArray.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mButtonCreateBoggleArray) {
            int randLetter = new Random().nextInt(letters.length);
            int randVowel = new Random().nextInt(vowels.length);

            String[] boggleArray = {letters[randLetter], letters[randLetter], vowels[randVowel], letters[randLetter], letters[randLetter], vowels[randVowel], letters[randLetter], letters[randLetter]};

            Intent intent = new Intent(MainActivity.this, BoggleActivity.class);
            intent.putExtra("boogleArray", boggleArray);

            startActivity(intent);


        }
    }

}

