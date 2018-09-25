package com.example.yamuna.senddatabundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    Button data;
    EditText gettext;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = (Button) findViewById(R.id.getdata);
        gettext = (EditText) findViewById(R.id.gettext);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mytext =gettext.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("mytext",mytext);
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }

}
