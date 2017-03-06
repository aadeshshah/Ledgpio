package com.example.android.ledgpio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.calit2.mooc.iot_db410c.db410c_gpiolib.GpioProcessor;

public class ledon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ledon);

        new Thread(new Runnable() {

            @Override

            public void run() {

                GpioProcessor gpioProcessor = new GpioProcessor();


                GpioProcessor.Gpio led = gpioProcessor.getPin34();

                led.out();
                led.high();


            }
        }).start();
    }
}