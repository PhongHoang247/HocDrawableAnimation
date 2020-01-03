package com.phong.hocdrawableanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgHinh;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        imgHinh = findViewById(R.id.imgHinh);
        imgHinh.setBackgroundResource(R.drawable.chay_hinh);
        animationDrawable = (AnimationDrawable) imgHinh.getBackground();
    }

    public void XuLyStart(View view) {
        animationDrawable.start();
    }

    public void XuLyStop(View view) {
        animationDrawable.stop();
    }
}
