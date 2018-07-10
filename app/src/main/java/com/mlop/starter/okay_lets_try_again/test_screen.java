package com.mlop.starter.okay_lets_try_again;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class test_screen extends AppCompatActivity {


 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen);
     Intent intent=getIntent();
     String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
     TextView textView=findViewById(R.id.textView2);
     textView.setText(message);
    }
}
