package com.example.yamuna.senddatabundle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {


    TextView textfrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        textfrom = (TextView) findViewById(R.id.textfrom);
        Bundle bundle = getIntent().getExtras();
        String showtext = bundle.getString("mytext");
        textfrom.setText(showtext);


    }
}