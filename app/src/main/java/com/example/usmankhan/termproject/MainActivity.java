package com.example.usmankhan.termproject;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MyMessage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");

        RelativeLayout mulayout=new RelativeLayout(this);
        Button btn=new Button(this);



        mulayout.setBackgroundColor(Color.MAGENTA);
        btn.setBackgroundColor(Color.BLUE);
        btn.setText("Click Me");
        btn.setTextColor(Color.WHITE);

        RelativeLayout.LayoutParams btnDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        btnDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        EditText username=new EditText(this);
        username.setTextColor(Color.WHITE);
        username.setHint("Enter UserName");
        username.setHintTextColor(Color.WHITE);
        btn.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams usernameDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        usernameDetails.addRule(RelativeLayout.ABOVE,btn.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);
        Resources r=getResources();
        int pixel=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,r.getDisplayMetrics());
        username.setWidth(pixel);

        EditText password=new EditText(this);
        password.setTextColor(Color.WHITE);



        mulayout.addView(username,usernameDetails);
        mulayout.addView(btn,btnDetails);
        setContentView(mulayout);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState");
    }
}
