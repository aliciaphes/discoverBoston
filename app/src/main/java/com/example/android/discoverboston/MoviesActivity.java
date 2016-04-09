package com.example.android.discoverboston;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;

public class MoviesActivity extends AppCompatActivity {

    ArrayList<String> BostonMovies = new ArrayList<String>(
            Arrays.asList("The Departed", "Good Will Hunting", "Gone baby gone", "The town", "The Boondock Saints", "The social network", "Mystic river", "Spotlight"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        setTitle(R.string.movies);
        createMovieList();
    }

    /**
     * This method creates a TextView per movie in the list and displays the whole list on the screen.
     */
    private void createMovieList() {
        LinearLayout ll = (LinearLayout) findViewById(R.id.movie_list);
        ll.removeAllViews();

        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f);

        //set margin bottom for each textview!!!!

        for(int i=0; i<BostonMovies.size(); i++){
            TextView tv = new TextView(this);
            tv.setLayoutParams(lparams);
            tv.setText(BostonMovies.get(i));
            tv.setTextSize(20);
            ViewGroup list = (ViewGroup) findViewById(R.id.movie_list);
            list.addView(tv);
        }

    }


    /**
     * This method:
     * - retrieves whatever text is on the EditText
     * - adds it to the list and
     * - re-renders the complete and updated list on the screen.
     */
    public void addMovie(View view){
        EditText nameField = (EditText) findViewById(R.id.movie);
        String newMovie = nameField.getText().toString();
        BostonMovies.add(newMovie);
        createMovieList();
        nameField.setText("");//clear contents of EditText
    }
}

