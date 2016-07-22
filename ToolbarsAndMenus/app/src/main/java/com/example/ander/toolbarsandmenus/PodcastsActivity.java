package com.example.ander.toolbarsandmenus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.podcast_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.podcast_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.tv_bluetooth:
                startActivity(new Intent(this, Facetune.class));
                return true;
            case R.id.add_new_podcast:
                return true;
            case R.id.pokemon_sounds:
                return true;
            case R.id.zelda_sounds:
                return true;
        }

//        Default:
        return super.onOptionsItemSelected(item);
    }
}
