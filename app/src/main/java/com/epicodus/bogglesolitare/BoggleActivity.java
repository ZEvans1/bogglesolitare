package com.epicodus.bogglesolitare;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.BindView;

public class BoggleActivity extends AppCompatActivity {
    @BindView(R.id.textView) TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boggle);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String[] letters = intent.getStringArrayExtra("boggleArray");
        mTextView.setText(letters[0]);
    }
}
