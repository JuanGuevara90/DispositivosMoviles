package com.example.inflatelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    String datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =(EditText)findViewById(R.id.EditText);
        editText.setText("asdasds");
    }

    public void onClickLeft(View view) {
        setContentView(R.layout.activity_main2);
        datos = editText.getText().toString();
        //editText.setText("");
        textView= (TextView)findViewById(R.id.textView);
        textView.setText("Dato: "+datos);


    }

    public void onClickRight(View view) {
        setContentView(R.layout.activity_main);
        datos="";

    }

}
