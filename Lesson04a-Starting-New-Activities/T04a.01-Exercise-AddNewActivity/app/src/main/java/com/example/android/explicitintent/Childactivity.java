package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Childactivity extends AppCompatActivity {

    private TextView mDisplayTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childactivity);

        mDisplayTextView = (TextView) findViewById(R.id.tv_display);
    }
}
