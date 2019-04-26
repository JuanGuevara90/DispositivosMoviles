package com.example.myapplication_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity; import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // button = findViewById(R.id.button);
        //button.setText("Hola yo soy un boton");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void launchIntent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/"));
         startActivity(intent);
    }
}
