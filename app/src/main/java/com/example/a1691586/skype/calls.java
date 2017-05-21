package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class calls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);
    }

    public void call(View view) {
        Intent intent = new Intent(this, skype.class);
        startActivity(intent);
    }

    public void call1(View view) {
        Intent intent = new Intent(this, screen3.class);
        startActivity(intent);
    }

    public void call2(View view) {
        Intent intent = new Intent(this, myinfo.class);
        startActivity(intent);
    }

}
