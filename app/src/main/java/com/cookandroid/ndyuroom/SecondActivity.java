package com.cookandroid.ndyuroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 한성영 on 2017-09-21.
 */
public class SecondActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        // Button backbtn = (Button) findViewById(R.id.backbtn);
        Button gobtn1 = (Button) findViewById(R.id.gobtn1);
        Button gobtn2 = (Button) findViewById(R.id.gobtn2);
        Button gobtn3 = (Button) findViewById(R.id.gobtn3);
        Button gobtn4 = (Button) findViewById(R.id.gobtn4);
        Button gobtn5 = (Button) findViewById(R.id.gobtn5);
        Button gobtn6 = (Button) findViewById(R.id.gobtn6);
        Button gobtn7 = (Button) findViewById(R.id.gobtn7);
        Button gobtn8 = (Button) findViewById(R.id.gobtn8);
        Button gobtn9 = (Button) findViewById(R.id.gobtn9);
        Button gobtn10 = (Button) findViewById(R.id.gobtn10);
        Button gobtn11 = (Button) findViewById(R.id.gobtn11);
        Button gobtn12 = (Button) findViewById(R.id.gobtn12);
        Button gobtn13 = (Button) findViewById(R.id.gobtn13);
        Button gobtn14 = (Button) findViewById(R.id.gobtn14);
        Button gobtn15 = (Button) findViewById(R.id.gobtn15);
        Button gobtn16 = (Button) findViewById(R.id.gobtn16);
        Button gobtn17 = (Button) findViewById(R.id.gobtn17);
        Button gobtn18 = (Button) findViewById(R.id.gobtn18);
        Button gobtn19 = (Button) findViewById(R.id.gobtn19);
        Button gobtn20 = (Button) findViewById(R.id.gobtn20);
        Button gobtn21 = (Button) findViewById(R.id.gobtn21);
        Button gobtn22 = (Button) findViewById(R.id.gobtn22);
        Button gobtn23 = (Button) findViewById(R.id.gobtn23);
        Button gobtn24 = (Button) findViewById(R.id.gobtn24);
        Button gobtn25 = (Button) findViewById(R.id.gobtn25);
        Button gobtn26 = (Button) findViewById(R.id.gobtn26);
        Button gobtn27 = (Button) findViewById(R.id.gobtn27);
        Button gobtn28 = (Button) findViewById(R.id.gobtn28);
        Button gobtn29 = (Button) findViewById(R.id.gobtn29);
        Button gobtn30 = (Button) findViewById(R.id.gobtn30);
        Button gobtn31 = (Button) findViewById(R.id.gobtn31);
        Button gobtn32 = (Button) findViewById(R.id.gobtn32);
        Button gobtn33 = (Button) findViewById(R.id.gobtn33);
        Button gobtn34 = (Button) findViewById(R.id.gobtn34);

        gobtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(SecondActivity.this, Board1Activity.class);
                startActivity(intent);
            }
        });


        gobtn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board2Activity.class);
                startActivity(intent);
            }
        });

        gobtn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board3Activity.class);
                startActivity(intent);
            }
        });

        gobtn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board4Activity.class);
                startActivity(intent);
            }
        });

        gobtn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board5Activity.class);
                startActivity(intent);
            }
        });

        gobtn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board6Activity.class);
                startActivity(intent);
            }
        });

        gobtn7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board7Activity.class);
                startActivity(intent);
            }
        });

        gobtn8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board8Activity.class);
                startActivity(intent);
            }
        });

        gobtn9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board9Activity.class);
                startActivity(intent);
            }
        });

        gobtn10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board10Activity.class);
                startActivity(intent);
            }
        });

        gobtn11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board11Activity.class);
                startActivity(intent);
            }
        });

        gobtn12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board12Activity.class);
                startActivity(intent);
            }
        });

        gobtn13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board13Activity.class);
                startActivity(intent);
            }
        });

        gobtn14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board14Activity.class);
                startActivity(intent);
            }
        });

        gobtn15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board15Activity.class);
                startActivity(intent);
            }
        });

        gobtn16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board16Activity.class);
                startActivity(intent);
            }
        });

        gobtn17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board17Activity.class);
                startActivity(intent);
            }
        });

        gobtn18.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board18Activity.class);
                startActivity(intent);
            }
        });

        gobtn19.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board19Activity.class);
                startActivity(intent);
            }
        });

        gobtn20.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board20Activity.class);
                startActivity(intent);
            }
        });

        gobtn21.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board21Activity.class);
                startActivity(intent);
            }
        });

        gobtn22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board22Activity.class);
                startActivity(intent);
            }
        });

        gobtn23.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board23Activity.class);
                startActivity(intent);
            }
        });


        gobtn24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board24Activity.class);
                startActivity(intent);
            }
        });

        gobtn25.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board25Activity.class);
                startActivity(intent);
            }
        });

        gobtn26.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board26Activity.class);
                startActivity(intent);
            }
        });

        gobtn27.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board27Activity.class);
                startActivity(intent);
            }
        });

        gobtn28.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board28Activity.class);
                startActivity(intent);
            }
        });

        gobtn29.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board29Activity.class);
                startActivity(intent);
            }
        });

        gobtn30.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board30Activity.class);
                startActivity(intent);
            }
        });

        gobtn31.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board31Activity.class);
                startActivity(intent);
            }
        });

        gobtn32.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board32Activity.class);
                startActivity(intent);
            }
        });

        gobtn33.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board33Activity.class);
                startActivity(intent);
            }
        });

        gobtn34.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Board34Activity.class);
                startActivity(intent);
            }
        });
    }
}