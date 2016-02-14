package com.example.krisvukasinovic.whatdo;

import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by FenrisAnestor on 2016-02-14.
 */
public class QuestionPopUp {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.question_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.5));
    }
}
