package com.udemy_android_move1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LOGCICLO", "Starting onCreate method");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LOGCICLO", "Starting onStart method");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOGCICLO", "Starting onResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOGCICLO", "Starting onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LOGCICLO", "Starting onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOGCICLO", "Starting onDestroy method");
    }
}