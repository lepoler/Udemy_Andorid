package com.udemy_android_move1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Button btn1 = findViewById(R.id.firstButton);
        btn1.setOnClickListener(View::clearViewTranslationCallback);


    }
}