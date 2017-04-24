package com.demo.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) this.findViewById(R.id.my_image_view);

        final AnimationDrawable animationDrawable = new AnimationDrawable();

        animationDrawable.addFrame(getResources().getDrawable(R.drawable._01), 100);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable._02), 100);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable._03), 100);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable._04), 100);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable._05), 100);

        animationDrawable.setOneShot(false);

        mImageView.setBackground(animationDrawable);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();

            }
        });

    }
}
