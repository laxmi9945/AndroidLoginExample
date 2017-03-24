package com.example.bridgeit.sharedpftest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by bridgeit on 24/3/17.
 */

public class SplashScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        final ImageView imageView=(ImageView)findViewById(R.id.iv);
        Animation animation= AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation anim= AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);
        //animation.setAnimationListener(new Animation.AnimationListener());
        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(anim);
                finish();
                Intent intent=new Intent(getBaseContext(),Login.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent2=new Intent(SplashScreen.this,Login.class);
                startActivity(intent2);
                finish();
            }
        },5000);
    }
}
