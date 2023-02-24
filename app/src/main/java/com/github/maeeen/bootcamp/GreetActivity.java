package com.github.maeeen.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GreetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);
        TextView t = findViewById(R.id.hiText);
        t.setText("Sheesh my " + getIntent().getExtras().get("name"));
    }
}