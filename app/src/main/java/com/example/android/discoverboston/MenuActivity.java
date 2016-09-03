package com.example.android.discoverboston;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.widget.CardView;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle(R.string.title);
        setCardsListeners();
    }

    /**
     * This method sets a listener per card in the main menu.
     * It creates an Intent to launch a separate activity
     */
    private void setCardsListeners() {
        CardView card = (CardView) findViewById(R.id.card_view1);
        if (card != null) {
            card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), PhotosActivity.class);
                    startActivity(myIntent);
                }
            });
        }

        card = (CardView) findViewById(R.id.card_view2);
        if (card != null) {
            card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), MapsActivity.class);
                    startActivity(myIntent);
                }
            });
        }

        card = (CardView) findViewById(R.id.card_view3);
        if (card != null) {
            card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), SportsActivity.class);
                    startActivity(myIntent);
                }
            });
        }

        card = (CardView) findViewById(R.id.card_view4);
        if (card != null) {
            card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), SlangActivity.class);
                    startActivity(myIntent);
                }
            });
        }
        card = (CardView) findViewById(R.id.card_view5);

        if (card != null) {
            card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), MoviesActivity.class);
                    startActivity(myIntent);
                }
            });
        }

        card = (CardView) findViewById(R.id.card_view6);

        if (card != null) {
            card.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), TwitterActivity.class);
                    startActivity(myIntent);
                }
            });
        }
    }
}

