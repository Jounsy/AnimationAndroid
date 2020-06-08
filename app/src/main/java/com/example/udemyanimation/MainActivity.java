package com.example.udemyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView tomImageView;
    ImageView jerryImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tomImageView = findViewById(R.id.tomView);
        jerryImageView = findViewById(R.id.jerryView);
    }

    public void animateImage(View view) {

        switch (view.getId()){
            case R.id.tomView :
                tomImageView.animate().alpha(0).setDuration(3000);
                tomImageView.setVisibility(View.GONE);
                jerryImageView.setVisibility(View.VISIBLE);
                jerryImageView.animate().alpha(1).setDuration(3000);
                break;

            case R.id.jerryView :
                jerryImageView.animate().alpha(0).setDuration(3000);
                jerryImageView.setVisibility(View.GONE);
                tomImageView.setVisibility(View.VISIBLE);
                tomImageView.animate().alpha(1).setDuration(3000);
                break;
        }
    }

}
