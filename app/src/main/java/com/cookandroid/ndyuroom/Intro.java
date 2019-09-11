package com.cookandroid.ndyuroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by 한성영 on 2017-11-20.
 */
public class Intro extends Activity {
    Handler handler = new Handler();
    Runnable r = new Runnable(){
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
    }

    protected void onResume(){
        super.onResume();
        handler.postDelayed(r, 2500);
    }

    protected void onPause(){
        super.onPause();
        handler.removeCallbacks(r);
    }
}
