package com.example.senddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView) findViewById(R.id.textViewText);
        if (getIntent() != null && getIntent().hasExtra("pepito")) {
            textView.setText(getIntent().getStringExtra("pepito"));
            Toast.makeText(this,"Second Activity",Toast.LENGTH_LONG).show();
        }
    }
    public void onClickClose(View view) {
        finish();
    }

}
