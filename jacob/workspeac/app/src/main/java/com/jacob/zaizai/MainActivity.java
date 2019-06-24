package com.jacob.zaizai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText3);
        String massage = editText.getText().toString();
        intent.putExtra("MASSAGE", massage);
//        Log.e("editText：-->"+editText, "值");
//        System.out.println("editText：-->"+editText);
        startActivity(intent);
    }
}
