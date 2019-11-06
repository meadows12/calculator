package com.mrunal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button but0;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button clear;
    private Button addition;
    private Button sub;
    private Button mult;
    private Button res;
    public TextView screen;
    private String display = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getId();
        screen.setText(display);

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                display += b.getText();  //Updating the string
                screen.setText(display); // storing the updated string and displaying
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button b = (Button) view;
                display += b.getText();
                screen.setText(display);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                display+=" ";
                screen.setText(display);

            }
        });

    }
    public void onClickOperator( View v){

        Button b = (Button) v;
        display+=b.getText();
        screen.setText(display);

    }

    public void getId(){

        but0 = findViewById(R.id.zero);
        but1 = findViewById(R.id.one);
        but2 = findViewById(R.id.two);
        but3 = findViewById(R.id.three);
        but4 = findViewById(R.id.four);
        but5 = findViewById(R.id.five);
        but6 = findViewById(R.id.six);
        but7 = findViewById(R.id.seven);
        but8 = findViewById(R.id.eight);
        but9 =  findViewById(R.id.nine);
        clear =  findViewById(R.id.clr);
        addition =  findViewById(R.id.add1);
        sub =  findViewById(R.id.minus);
        mult=  findViewById(R.id.multiply);
        res =  findViewById(R.id.eq);
        screen = findViewById(R.id.info);


    }


}


