package com.example.gabriel.psicopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button ShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView textView = (TextView) findViewById(R.id.textView);





    //Assign view to variables


}
