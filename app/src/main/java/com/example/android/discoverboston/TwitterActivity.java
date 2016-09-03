package com.example.android.discoverboston;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;

import io.fabric.sdk.android.Fabric;


//http://www.techrepublic.com/blog/software-engineer/a-comprehensive-troubleshooting-guide-for-androids-r-cannot-be-resolved-error/


public class TwitterActivity extends AppCompatActivity {

    public static final char hashtag = '#';
    public static final String searchTerm = "Boston";

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        initializeFabric();

        retrieveTweets();
    }



    private void initializeFabric() {
        if (!Fabric.isInitialized()) {
            TwitterAuthConfig authConfig = new TwitterAuthConfig(BuildConfig.CONSUMER_KEY, BuildConfig.CONSUMER_SECRET);
            Fabric.with(this, new Twitter(authConfig));
        } else {
            Log.d("InitializeFabric", "Fabric already initialized");
        }
    }

    private void retrieveTweets() {
        //http://stackoverflow.com/questions/35290256/android-how-to-get-the-public-tweets-with-out-making-user-login-in-fabrics

//https://raw.githubusercontent.com/twitterdev/FabricWithTwitter/master/Android/DisplayTweets/app/src/main/java/sample/twitterkit/fabric/twitter/com/twitterkit/MainActivity.java

        String BostonQuery = hashtag + searchTerm;

        SearchTimeline.Builder twitterBuilder = new SearchTimeline.Builder();
        twitterBuilder.query(BostonQuery).maxItemsPerRequest(10);
        SearchTimeline searchTimeline = twitterBuilder.build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(getBaseContext()).setTimeline(searchTimeline).build();

        ListView lv = (ListView) findViewById(R.id.lv_twitter);
        lv.setAdapter(adapter);


        //set swipe vertical listener:
//        final SwipeRefreshLayout swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_layout);
//        assert swipeLayout != null;
//        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                //swipeLayout.setRefreshing(true);
//                adapter.refresh(new Callback<TimelineResult<Tweet>>() {
//                    @Override
//                    public void success(Result<TimelineResult<Tweet>> result) {
//                        swipeLayout.setRefreshing(false);
//                    }
//
//                    @Override
//                    public void failure(TwitterException exception) {
//                        // Toast or some other action
//                    }
//                });
//            }
//        });
    }
}
