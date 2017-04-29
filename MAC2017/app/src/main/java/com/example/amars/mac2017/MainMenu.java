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


        Button events = (Button) findViewById(R.id.fetch_events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToEvents();
            }
        });

        Button newEvent = (Button) findViewById(R.id.fetch_new_event);
        newEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNewEvent();
            }
        });

        Button profile = (Button) findViewById(R.id.fetch_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProfile();
            }
        });

        Button map = (Button) findViewById(R.id.fetch_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMap();
            }
        });

        Button leaderboards = (Button) findViewById(R.id.fetch_leaderboards);
        leaderboards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLeaderboards();
            }
        });

        Button settings = (Button) findViewById(R.id.fetch_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSettings();
            }
        });

    }

    private void goToEvents() {
        Intent intent = new Intent(this, Event.class);
        startActivity(intent);
    }

    private void goToNewEvent() {
        Intent intent = new Intent(this, Submit.class);
        startActivity(intent);
    }

    private void goToProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    private void goToMap() {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    private void goToLeaderboards() {
        Intent intent = new Intent(this, leaderboard.class);
        startActivity(intent);
    }

    private void goToSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
