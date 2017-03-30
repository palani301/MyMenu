package com.example.palani.mymenu;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.pos:
        Toast.makeText(getApplicationContext(),"Computer is Clicked",Toast.LENGTH_SHORT).show();
        return true;
        case R.id.hos:
            Toast.makeText(getApplicationContext(),"Gamepad is Clicked",Toast.LENGTH_SHORT).show();
        return true;
        case R.id.mos:
        Toast.makeText(getApplicationContext(),"Camera is Clicked",Toast.LENGTH_SHORT).show();
        return true;
        case R.id.sos:
            Toast.makeText(getApplicationContext(),"Video is Clicked",Toast.LENGTH_SHORT).show();
        return true;
        case R.id.jos:
            Toast.makeText(getApplicationContext(),"Email is Clicked",Toast.LENGTH_SHORT).show();
        return true;
        default:
            return super.onOptionsItemSelected(item);
    }


}}











