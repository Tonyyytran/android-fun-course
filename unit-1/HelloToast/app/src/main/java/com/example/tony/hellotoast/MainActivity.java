package com.example.tony.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView countNum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countNum = findViewById(R.id.count_view);
    }

    public void helloButtonClicked(View view) {

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("extra key",count);
        startActivity(intent);

    }

    public void incrementCount(View view) {
        count++;
        countNum.setText(String.valueOf(count));

    }
}
