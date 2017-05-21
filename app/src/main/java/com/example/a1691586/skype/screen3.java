package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }

    public void screen3(View view) {
        Intent intent = new Intent(this, addcontact.class);
        startActivity(intent);
    }

    public void screen31(View view) {
        Intent intent = new Intent(this, contact_online.class);
        startActivity(intent);
    }

    public void screen32(View view) {
        Intent intent = new Intent(this, bots.class);
        startActivity(intent);
    }

    public void screen33(View view) {
        Intent intent = new Intent(this, skype.class);
        startActivity(intent);
    }

    public void screen34(View view) {
        Intent intent = new Intent(this, calls.class);
        startActivity(intent);
    }

    public void screen35(View view) {
        Intent intent = new Intent(this, myinfo.class);
        startActivity(intent);
    }
}
