package com.mlop.starter.okay_lets_try_again;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.example.myfirstapp.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        //hace algo en respuesta al boton???

        Intent intent = new Intent(this, test_screen.class);
        EditText editText= findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
    public void onClick (View v )
    {
       // new
    }
}

