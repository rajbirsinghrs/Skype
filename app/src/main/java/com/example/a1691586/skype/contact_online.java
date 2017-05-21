package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class contact_online extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_online);
    }

    public void contactonline(View view) {
        Intent intent = new Intent(this, skype.class);
        startActivity(intent);
    }
    public void contactonline1(View view) {
        Intent intent = new Intent(this, calls.class);
        startActivity(intent);
    }

    public void contactonline2(View view) {
        Intent intent = new Intent(this, myinfo.class);
        startActivity(intent);
    }

    public void contactonline3(View view) {
        Intent intent = new Intent(this, screen3.class);
        startActivity(intent);
    }
    public void contactonline4(View view) {
        Intent intent = new Intent(this, bots.class);
        startActivity(intent);
    }

    public void contactonline5(View view) {
        Intent intent = new Intent(this, addcontact.class);
        startActivity(intent);
    }
}
