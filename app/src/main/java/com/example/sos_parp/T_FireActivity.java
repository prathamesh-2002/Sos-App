package com.example.sos_parp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class T_FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_activity_fire);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view2);
        getLifecycle().addObserver(youTubePlayerView);
    }

    public void callFireHelpline(View view)
    {
        String number = "101";
        Uri call = Uri.parse("tel:" + number);
        Intent intent = new Intent(Intent.ACTION_DIAL, call);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void closeActivity(View view){
        onBackPressed();
    }
}
