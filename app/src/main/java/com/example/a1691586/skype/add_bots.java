package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class add_bots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bots);
    }

    public void addbots(View view) {
        Intent intent = new Intent(this, screen3.class);
        startActivity(intent);
    }

    public void addbots1(View view) {
        Intent intent = new Intent(this, addcontact.class);
        startActivity(intent);
    }
}
