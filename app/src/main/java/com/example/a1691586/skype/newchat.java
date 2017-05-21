package com.example.a1691586.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newchat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newchat);
    }

    public void newchat(View view) {
        Intent intent = new Intent(this, skype.class);
        startActivity(intent);
    }

}
