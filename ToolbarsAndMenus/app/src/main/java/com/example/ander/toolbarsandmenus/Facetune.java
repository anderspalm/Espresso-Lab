package com.example.ander.toolbarsandmenus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Facetune extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.facetunetoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" ");

        Toolbar toolbar1 = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle(" ");

    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.facetune, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//       switch (item.getItemId()){
//           case R.id.one:
//               return true;
//           case R.id.two:
//               return true;
//           case R.id.three:
//               return true;
//           case R.id.four:
//                return true;
//       }
//        return super.onOptionsItemSelected(item);
//    }
}
