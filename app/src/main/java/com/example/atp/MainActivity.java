package com.example.atp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SintomasActivity(View v){
        Intent intent = new Intent(MainActivity.this,SintomasActivity.class);

        startActivity(intent);
    }

    public void DengueActivity(View v){
        Intent intent = new Intent(MainActivity.this,DengueActivity.class);

        startActivity(intent);
        //activityResultLauncher.launch(intent);
    }

    public void PrevencaoActivity(View v){
        Intent intent = new Intent(MainActivity.this,PrevencaoActivity.class);

        startActivity(intent);
        //activityResultLauncher.launch(intent);
    }

    public void QuestionamentoActivity(View v){
        Intent intent = new Intent(MainActivity.this,QuestionamentoActivity.class);

        startActivity(intent);
        //activityResultLauncher.launch(intent);
    }

    public void goSecondActivity(View v){
        Intent intent = new Intent(MainActivity.this,MedicamentoActivity.class);

        startActivity(intent);
        //activityResultLauncher.launch(intent);
    }
}