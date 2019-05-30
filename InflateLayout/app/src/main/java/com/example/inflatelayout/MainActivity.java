package com.example.inflatelayout;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Bundle save;
    String KEY_COUNTER="KEY_COUNTER";
    String mSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        save = savedInstanceState;
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.EditText);

        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        String defaultCounter = "0";
        mSave = settings.getString(KEY_COUNTER, defaultCounter);
        editText.setText(mSave);

    }


    public void saveState(Object object){
        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(KEY_COUNTER,mSave);
        editor.commit();

    }


    public void onClickLeft(View view) {
        setContentView(R.layout.activity_main2);

        mSave=editText.getText().toString();
        saveState(mSave);

        ((TextView)findViewById(R.id.textView)).append(editText.getText().toString());
        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void onClickRight(View view) {
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditText);
        editText.setText("");

        Toast.makeText(this, findViewById(R.id.EditText).toString(), Toast.LENGTH_LONG).show();

    }

    /*
    @Override
    protected void onPause() {

        super.onPause();
        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(KEY_COUNTER,mSave);
        editor.commit();

    }*/

}
