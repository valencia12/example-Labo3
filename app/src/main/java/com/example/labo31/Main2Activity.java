package com.example.labo31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView = findViewById(R.id.tv_message);
        Intent mIntent = getIntent();
        if (mIntent!= null){
            mTextView.setText(mIntent.getStringExtra(mIntent.getStringExtra(Intent.EXTRA_TEXT)));
        }
    }
}
