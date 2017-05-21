package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bots);
    }

    public void bots(View view) {
        Intent intent = new Intent(this, skype.class);
        startActivity(intent);
    }

    public void bots1(View view) {
        Intent intent = new Intent(this, calls.class);
        startActivity(intent);
    }
    public void bots2(View view) {
        Intent intent = new Intent(this, myinfo.class);
        startActivity(intent);
    }
    public void bots3(View view) {
        Intent intent = new Intent(this, screen3.class);
        startActivity(intent);
    }

    public void bots4(View view) {
        Intent intent = new Intent(this, contact_online.class);
        startActivity(intent);
    }

    public void bots5(View view) {
        Intent intent = new Intent(this, addcontact.class);
        startActivity(intent);
    }
}
