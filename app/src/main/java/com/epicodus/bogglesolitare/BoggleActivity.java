package com.epicodus.bogglesolitare;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import butterknife.ButterKnife;
import butterknife.BindView;

public class BoggleActivity extends AppCompatActivity {
    @BindView(R.id.lettersTextView) TextView mLettersTextView;
    @BindView(R.id.lettersListView) ListView mLettersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boggle);

        ButterKnife.bind(this);
        mLettersTextView = (TextView) findViewById(R.id.lettersTextView);
        mLettersListView = (ListView) findViewById(R.id.lettersListView);
        Intent intent = getIntent();
        ArrayList<String> letterArrayList = intent.getStringArrayListExtra("letterArrayList");
        for (int i = 0; i < letterArrayList.size(); i++) {
            mLettersTextView.setText(mLettersTextView.getText() + letterArrayList.get(i) + ", ");
        }


//        mListView = (ListView) findViewById(R.id.listView);

    }
}
