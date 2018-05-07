package com.vishesh.beeppeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginbutton;
        loginbutton = (Button) findViewById(R.id.button);
        loginbutton.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View args)
            {
                Intent myIntent = new Intent(Login.this,MapsActivity.class);

                startActivity(myIntent);
            }
        });

    }
}
