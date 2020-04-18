package com.example.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity {
    private static final String TAG = "MainActivity";

    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);
        Log.d(TAG, "onCreate: Lecimy");
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Dziala o to to");
                List<String> videoList = new ArrayList<>();
                videoList.add("F7h2mPEr4Dw");
                videoList.add("SQIbeAk-bFA");
                youTubePlayer.loadVideos(videoList);
                //youTubePlayer.loadPlayList(); = playlista tez dziala w razie wu
            }
                // ROTATE I FULLSCREEN  powoduje gubienie instance acitivity więc nie obsługiwane
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Cos sie zepsulo");

            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Inicjalizacja playera");
               mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);

            }
        });
    }
}
