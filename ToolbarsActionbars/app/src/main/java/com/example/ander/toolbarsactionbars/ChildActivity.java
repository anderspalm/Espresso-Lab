package com.example.ander.toolbarsactionbars;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by ander on 7/21/2016.
 */
public class ChildActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar2);
        setSupportActionBar(toolbar);

//        This next line produces the back arrow we need to go from this child back to the parent
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.childmenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            // the following lets you go up one
           case android.R.id.home:
               onNavigateUp();
               return true;
            case R.id.action_picture:
//                Here is where you would insert any logic you want to happen on click
                Toast.makeText(ChildActivity.this, "Roar!!!!!!!!!", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_glob:
//                Here is where you would insert any logic you want to happen on click
                Toast.makeText(ChildActivity.this, "Soar!!!!!!!!!", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_toast:
//                Here is where you would insert any logic you want to happen on click
                Toast.makeText(ChildActivity.this, "A Lore!!!!!!!!!", Toast.LENGTH_LONG).show();
                return true;
            case R.id.Information:
                startActivity(new Intent(this, ScrollingActivity.class));
//                Here is where you would insert any logic you want to happen on click
                Toast.makeText(ChildActivity.this, "More!!!!!!!!!", Toast.LENGTH_LONG).show();
                return true;

        }
        return super.onOptionsItemSelected(item);

    }

}
