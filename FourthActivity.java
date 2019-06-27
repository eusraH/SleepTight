package com.example.app;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //create a mediaplayer for the sound clips
        final MediaPlayer firesound = MediaPlayer.create(this,R.raw.fire);
        final MediaPlayer junglesound = MediaPlayer.create(this,R.raw.jungle);
        final MediaPlayer rainsound = MediaPlayer.create(this,R.raw.rain);

        //For Fire Clip
        Switch Fire = (Switch)this.findViewById(R.id.switch1);
        Fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                firesound.start();
            }

        });

        Switch switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Play",Toast.LENGTH_SHORT).show();
                    firesound.setLooping(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Stop",Toast.LENGTH_SHORT).show();
                    firesound.stop();
                }
            }
        });

        //For Jungle Clip
        Switch Jungle = (Switch)this.findViewById(R.id.switch2);
        Jungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                junglesound.start();
            }

        });

        Switch switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Play",Toast.LENGTH_SHORT).show();
                    junglesound.setLooping(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Stop",Toast.LENGTH_SHORT).show();
                    junglesound.stop();
                }
            }
        });

        Switch Rain = (Switch)this.findViewById(R.id.switch3);
        Rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                rainsound.start();
            }
        });

        Switch switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Play",Toast.LENGTH_SHORT).show();
                    rainsound.setLooping(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Stop",Toast.LENGTH_SHORT).show();
                    rainsound.stop();
                }
            }
        });


    }
}