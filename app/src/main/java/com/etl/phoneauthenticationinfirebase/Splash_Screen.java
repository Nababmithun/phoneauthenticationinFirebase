package com.etl.phoneauthenticationinfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Splash_Screen extends AppCompatActivity {

    int progress;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        progressBar = findViewById(R.id.progressbar);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {


                doWork();
            }


        });
        thread.start();


    }

    private void doWork() {

        try {

            Thread.sleep(1000);
            progressBar.setProgress(progress);

            Intent intent=new Intent(Splash_Screen.this,MainActivity.class);
            startActivity(intent);

        }

        catch (InterruptedException e)

        {

            e.printStackTrace();
        }

    }

}




