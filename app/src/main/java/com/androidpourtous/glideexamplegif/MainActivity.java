package com.androidpourtous.glideexamplegif;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends ActionBarActivity {

    private ImageView image1, image2, image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1 = (ImageView) findViewById(R.id.imageView1);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);



        Glide.with(this).load("http://media.giphy.com/media/UtiwNokthANEY/giphy.gif").into(image1);
        Glide.with(this).load("http://media0.giphy.com/media/fLL4hTppVlf0Y/giphy.gif").into(image2);
        Glide.with(this).load("http://media.giphy.com/media/2aOQ9yk8oQYKc/giphy.gif").into(image3);
    }


}
