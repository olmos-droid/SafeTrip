package com.example.safetrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;
    private CardView cardView5;
    private CardView cardView6;
    private CardView cardView7;
    private CardView cardView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        hook

        cardView1 = (CardView) findViewById(R.id.carViewMain1);
        cardView2 = (CardView) findViewById(R.id.carViewMain2);
        cardView3 = (CardView) findViewById(R.id.carViewMain3);
        cardView4 = (CardView) findViewById(R.id.carViewMain4);
        cardView5 = (CardView) findViewById(R.id.carViewMain5);
        cardView6 = (CardView) findViewById(R.id.carViewMain6);
        cardView7 = (CardView) findViewById(R.id.carViewMain7);
        cardView8 = (CardView) findViewById(R.id.carViewMain8);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.carViewMain1:
                Intent intent1 = new Intent(this, CardViewAct1.class);
                startActivity(intent1);
                break;
            case R.id.carViewMain2:
                Intent intent2 = new Intent(this, CardViewAct2.class);
                startActivity(intent2);
                break;
            case R.id.carViewMain3:
                Intent intent3 = new Intent(this, CardViewAct3.class);
                startActivity(intent3);
                break;
            case R.id.carViewMain4:
                Intent intent4 = new Intent(this, CardViewAct4.class);
                startActivity(intent4);
                break;
            case R.id.carViewMain5:
                Intent intent5 = new Intent(this, CardViewAct5.class);
                startActivity(intent5);
                break;
            case R.id.carViewMain6:
                Intent intent6 = new Intent(this, CardViewAct6.class);
                startActivity(intent6);
                break;
            case R.id.carViewMain7:
                Intent intent7 = new Intent(this, CardViewAct7.class);
                startActivity(intent7);
                break;
            case R.id.carViewMain8:
                Intent intent8 = new Intent(this, CardViewAct8.class);
                startActivity(intent8);
                break;
        }

    }
}