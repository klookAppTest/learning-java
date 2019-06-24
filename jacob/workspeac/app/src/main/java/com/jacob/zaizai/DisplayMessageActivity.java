package com.jacob.zaizai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String str = intent.getStringExtra("MASSAGE");
        TextView textView = findViewById(R.id.textView2);
//        Log.e("值：---->"+textView, "值");
//        System.out.println("editText：-->"+textView);
        textView.setText("hello:"+str);
    }
}
