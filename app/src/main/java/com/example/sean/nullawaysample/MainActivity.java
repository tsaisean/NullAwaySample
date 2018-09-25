package com.example.sean.nullawaysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static void log(Object x) {
        System.out.println(x.toString());
    }
    static void foo() {
        log(null);
    }
}
