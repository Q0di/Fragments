package com.coda.fragments;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity implements TopSectionFragment.TopSectionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void createMeme(String top, String bottom){
        BottomPhotoFragment bottomPhotoFragment = (BottomPhotoFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomPhotoFragment.setMemeText(top, bottom);


    }
}
