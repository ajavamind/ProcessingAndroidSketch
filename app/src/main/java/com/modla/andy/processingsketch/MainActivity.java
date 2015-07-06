package com.modla.andy.processingsketch;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import processing.core.PApplet;


public class MainActivity extends PApplet {
    private static String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // the following line must be commented or removed:
        //setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /////////////////////////////////////////////////////////////////////////////
    // Processing Sketch

    @Override
    public void settings() {
        size(1920, 1080, OPENGL);
        fullScreen();
        println("settings()");
    }

    @Override
    public void setup() {
        println("setup()");
        background(0);
        strokeWeight(8.0f);
    }

    @Override
    public void draw() {
        //println("draw()");
        stroke(128);

        if (mousePressed) {
            //println("mousePressed");
            line(mouseX, mouseY, pmouseX, pmouseY);
        }
    }

}
