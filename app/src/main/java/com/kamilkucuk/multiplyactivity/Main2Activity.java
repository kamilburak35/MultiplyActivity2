package com.kamilkucuk.multiplyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        userName = "";

        Intent intent=getIntent();

        intent.getStringExtra("userInput");
        textView.setText(userName);

    }

    public void changeActivity(View view){

        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
