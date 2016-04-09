package com.example.android.discoverboston;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        setTitle(R.string.sports);
    }

    /**
     * This method handles the clicking on the radiobutton group.
     * Depending on the option clicked, it sets different texts.
     */
    public void onRadioButtonClicked(View view) {
        TextView recommendedTeam = (TextView) findViewById(R.id.team);
        if (recommendedTeam != null) {
            String suggestion = (String) getString(R.string.suggestion);

            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch (view.getId()) {
                case R.id.basketball:
                    if (checked)
                        suggestion += "Celtics";
                    break;
                case R.id.hockey:
                    if (checked)
                        suggestion += "Bruins";
                    break;
                case R.id.baseball:
                    if (checked)
                        suggestion += "Red Sox";
                    break;
            }
            recommendedTeam.setText(suggestion);
        }
    }
}

