package com.example.android.discoverboston;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.app_name);
    }

    /**
     * This method is called when the button on the main activity is clicked.
     * It launches the Menu Activity using an Intent.
     */
    public void showMenu(View view) {
        Intent myIntent = new Intent(this, MenuActivity.class);
        startActivity(myIntent);
    }

    /**
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
     MenuInflater inflater = getMenuInflater();
     inflater.inflate(R.menu.test_menu, menu);
     return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
     // Handle item selection
     Intent myIntent;
     switch (item.getItemId()) {
     case R.id.test_page:
     myIntent = new Intent(this, SlangActivity.class);
     startActivity(myIntent);
     return true;
     case R.id.map_page:
     myIntent = new Intent(this, MapsActivity.class);
     startActivity(myIntent);
     return true;
     default:
     return super.onOptionsItemSelected(item);
     }
     }
     */
}

