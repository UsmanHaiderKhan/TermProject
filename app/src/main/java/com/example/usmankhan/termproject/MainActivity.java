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

        Resources r=getResources();
        int pixel=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,r.getDisplayMetrics());

       //User Name Field Styling Here

        EditText username=new EditText(this);
        username.setTextColor(Color.WHITE);
        username.setHint("Enter UserName");
        username.setHintTextColor(Color.WHITE);
        username.setWidth(pixel);

        RelativeLayout.LayoutParams usernameDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        usernameDetails.addRule(RelativeLayout.ABOVE);
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,150,0,0);

        //Password Field Styling Here

        EditText password=new EditText(this);
        password.setTextColor(Color.WHITE);
        password.setHint("Enter Pssword");
        password.setHintTextColor(Color.WHITE);
        password.setWidth(pixel);

        RelativeLayout.LayoutParams passwordDetail=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        passwordDetail.addRule(RelativeLayout.ABOVE);
        passwordDetail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        passwordDetail.setMargins(0,400,0,0);

        //Button Styling Here

        Button btn=new Button(this);
        mulayout.setBackgroundColor(Color.MAGENTA);
        btn.setBackgroundColor(Color.BLUE);
        btn.setText("Click Me");
        btn.setTextColor(Color.WHITE);
        btn.setTextSize(16);
        btn.setWidth(pixel);



        RelativeLayout.LayoutParams btnDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        btnDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnDetails.addRule(RelativeLayout.CENTER_VERTICAL);




        mulayout.addView(password,passwordDetail);
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
