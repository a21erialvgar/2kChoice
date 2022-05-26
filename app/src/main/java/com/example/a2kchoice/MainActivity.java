package com.example.a2kchoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> miLista;
    MediaPlayer mp = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miLista = new ArrayList<>();
        miLista.add(R.raw.tylerherro);
        mp = MediaPlayer.create(this,miLista.get(0)); //siempre sonará el primer mp3!!
        mp.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    public void onResume() {
        super.onResume();
        mp.start();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
        mp.release();
        mp = null;


    }


    public void toSecondActivity(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}