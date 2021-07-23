package com.t_y.simonsaysv2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {
    private TextView tvPoints;
    private TextView tvHighest;
    SharedPreferences sharedPreferences;
    ImageView trophy;
    MediaPlayer mpBoo,mpClaps;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        tvPoints=findViewById(R.id.tvPoints);
        tvHighest=findViewById(R.id.tvHighest);
        trophy=findViewById(R.id.ivNewHighestScore);
        mpBoo=MediaPlayer.create(this,R.raw.boo);
        mpClaps=MediaPlayer.create(this,R.raw.claps);
        int points=getIntent().getExtras().getInt("points");
        tvPoints.setText(""+points);
        sharedPreferences=getSharedPreferences("my_pref",0);
        int highest=sharedPreferences.getInt("highest",0);
        if(points>highest) {
            mpClaps.start();
            trophy.setVisibility(View.VISIBLE);
            highest=points;
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putInt("highest",highest);
            editor.commit();
        }
        else  mpBoo.start();

        tvHighest.setText(""+highest);
    }

    public void restart(View view) {
        Intent intent=new Intent(GameOver.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void exit(View view) {
        finish();
    }
}
