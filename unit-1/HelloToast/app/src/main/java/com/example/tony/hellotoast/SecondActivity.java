package com.example.tony.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int countValue = getIntent().getIntExtra("extra key", 0);
        TextView countView = findViewById(R.id.count_value);
        countView.setText(String.valueOf(countValue));
    }

}
