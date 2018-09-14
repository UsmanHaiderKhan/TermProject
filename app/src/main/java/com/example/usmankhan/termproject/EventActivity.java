package com.example.usmankhan.termproject;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        Button btn_click = (Button) findViewById(R.id.btn_click);

        btn_click.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        TextView text_hello = (TextView) findViewById(R.id.text_hello);
                        text_hello.setText("Clicked By Usman");
                    }
                }
        );

        btn_click.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        TextView text_hello = (TextView) findViewById(R.id.text_hello);
                        text_hello.setText("Long Pressed Text");
                        return true;
                    }
                }
        );
    }
}
