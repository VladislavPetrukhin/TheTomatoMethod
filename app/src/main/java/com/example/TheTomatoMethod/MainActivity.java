package com.example.TheTomatoMethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView1,textView2;
    Button start_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button start_button = (Button) findViewById(R.id.start_button);
        start_button.setOnClickListener(this);

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);

    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.start_button: startTomato(); break;
        }
    }

    public void startTomato(){
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button start_button = (Button) findViewById(R.id.start_button);
        textView1.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
        start_button.setText("СТОП");
        textView1.setText("Запущено");
    }



}