package com.example.fontchange;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Typeface font;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_font);
        font = Typeface.createFromAsset(getAssets(), "fonts/COMICATE.TTF");
        textView.setTypeface(font);
    }
}
