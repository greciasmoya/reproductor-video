package com.example.greciavideos;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton ohsanta,therefore,holiday,dancin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView =(VideoView)findViewById(R.id.videoView);

        final MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        ohsanta=(ImageButton) findViewById(R.id.ohsanta);
        therefore=(ImageButton) findViewById(R.id.therefore);
        holiday=(ImageButton) findViewById(R.id.holiday);
        dancin=(ImageButton) findViewById(R.id.dancin);

        ohsanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.ohsanta);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });

        therefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.therefore);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });

        holiday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.holiday);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });


        dancin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.dancin);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });

    }
}