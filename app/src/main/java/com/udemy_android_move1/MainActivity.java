package com.udemy_android_move1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

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

    public void clickOnHobby(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.checkBoxSports:

                if(checked) {
                    Toast.makeText(this, "You check sports", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "You uncheck sports", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBoxGames:
                if(checked){
                    Toast.makeText(this, "You check videogames", Toast.LENGTH_SHORT).show();
                }else {

                }
                break;

        }
    }

    public void SexoSelecionado(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.readioButton_female:
                if (checked)
                    Toast.makeText(this, "Selected Female", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radioButtonMan:
                if (checked)
                    Toast.makeText(this, "Selected male", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.radioButtonOther:
                if (checked)
                    Toast.makeText(this, "Selected other", Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}