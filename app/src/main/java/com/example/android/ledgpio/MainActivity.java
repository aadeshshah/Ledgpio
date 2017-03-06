package com.example.android.ledgpio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void on(View view){
        Intent startNewActivity = new Intent(this,ledon.class);
        startActivity(startNewActivity);
    }
    public void off(View view){
        Intent startNewActivity = new Intent(this,ledoff.class);
        startActivity(startNewActivity);
    }
}
