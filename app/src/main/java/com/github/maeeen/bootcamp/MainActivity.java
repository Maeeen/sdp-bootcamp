package com.github.maeeen.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        Intent intent = new Intent(this, GreetActivity.class);
        EditText t = findViewById(R.id.inputName);
        intent.putExtra("name", t.getText());
        startActivity(intent);
    }
}