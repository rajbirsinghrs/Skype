package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class skype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skype);
    }


        public void skype(View view) {
        Intent intent = new Intent(this, addcontact.class);
        startActivity(intent);
    }
    public void skype1(View view) {
        Intent intent = new Intent(this, newchat.class);
        startActivity(intent);
    }

    public void skype2(View view) {
        Intent intent = new Intent(this, contact_online.class);
        startActivity(intent);
    }

    public void skype3(View view) {
        Intent intent = new Intent(this, calls.class);
        startActivity(intent);
    }

    public void skype4(View view) {
        Intent intent = new Intent(this, myinfo.class);
        startActivity(intent);
    }
}
