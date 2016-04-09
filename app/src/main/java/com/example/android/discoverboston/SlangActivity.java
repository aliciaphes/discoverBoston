package com.example.android.discoverboston;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class SlangActivity extends AppCompatActivity {

    Hashtable<String, String> Boston = new Hashtable<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slang);
        setTitle(R.string.slang);
        createLingo();
        addWords();
        setUpSwitch();
    }

    /**
     * This method sets a listener for the switch.
     * It makes the Bostonian slang translated words appear and disappear
     */
    private void setUpSwitch() {
        Switch translateSwitch = (Switch) findViewById(R.id.switch1);
        translateSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                LinearLayout ll;
                clearView(R.id.list2);
                if (isChecked) {
                    translate();
                } else {
                    addWords();
                }
            }
        });
    }

    /**
     * This method empties the view whose ID is:
     * param viewID.
     */
    private void clearView(int viewID) {
        LinearLayout ll = (LinearLayout) findViewById(viewID);
        ll.removeAllViews();
    }

    /**
     * This method displays the translated words on the screen.
     */
    private void translate() {
        Collection<String> values = Boston.values();
        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            TextView tv = new TextView(this);
            tv.setText((String)iterator.next());
            tv.setTextSize(18);
            ViewGroup list = (ViewGroup) findViewById(R.id.list2);
            list.addView(tv);
        }
    }

    /**
     * This method displays the list of initial words on the screen.
     */
    private void addWords() {
        //clear whatever the list has:
        clearView(R.id.list1);

        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        //set margin bottom for each textview!!!!

        Enumeration keys = Boston.keys();

        while (keys.hasMoreElements()) {
            String text = (String) keys.nextElement();
            TextView tv = new TextView(this);
            //tv.setLayoutParams(lparams);
            tv.setText(text);
            tv.setTextSize(18);
            ViewGroup list = (ViewGroup) findViewById(R.id.list1);
            list.addView(tv);
            tv = new TextView(this);
            //tv.setLayoutParams(lparams);
            tv.setText("");
            list = (ViewGroup) findViewById(R.id.list2);
            list.addView(tv);
        }
    }

    /**
     * This method populates the list of words in pairs.
     */
    private void createLingo() {
        Boston.put("Very intelligent", "Wicked smaht");
        Boston.put("Directional signals", "Blinkers");
        Boston.put("Water fountain", "Water bubbler");
        Boston.put("Soda", "Tonic");
        Boston.put("Cape Cod", "The Cape");
        Boston.put("South Boston", "Southie");
        Boston.put("Beer", "Brew");
    }


}

