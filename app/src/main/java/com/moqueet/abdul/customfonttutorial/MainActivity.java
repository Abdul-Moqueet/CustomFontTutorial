package com.moqueet.abdul.customfonttutorial;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textView);
        Button btn = findViewById(R.id.button);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"android_7.ttf");
        tv.setTypeface(typeface);

        btn.setTypeface(Typeface.createFromAsset(getAssets(),"afternoon.ttf"));

    }
}
