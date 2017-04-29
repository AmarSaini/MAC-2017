package com.example.amars.mac2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        ImageButton events = (ImageButton) findViewById(R.id.icon1);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToEvents();
            }
        });

    }

    private void goToEvents() {
        Intent intent = new Intent(this, Event.class);
        startActivity(intent);
    }
}
