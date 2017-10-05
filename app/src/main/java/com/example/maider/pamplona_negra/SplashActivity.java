package com.example.maider.pamplona_negra;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

import java.util.TimerTask;
import java.util.Timer;

public class SplashActivity extends AppCompatActivity {

    //Duracion de milisegundos que se mostrará
    private final int DURACION_SPLASH = 3000; //4 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Esta linea es nueva
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_splash);
        getActionBar().hide();
/*
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent().setClass(
                        SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, DURACION_SPLASH); */
    }
}
