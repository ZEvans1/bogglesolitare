package com.epicodus.bogglesolitare;


import android.content.Context;
import android.widget.ArrayAdapter;

public class BoggleArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mLetters;

    public BoggleArrayAdapter(Context mContext, int resource, String[] mLetters) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mLetters = mLetters;
    }

    @Override
    public Object getItem(int position) {
        String letter = mLetters[position];
        return "hello";
    }
}
