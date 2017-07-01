package com.code.daggerpractice.base;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.code.daggerpractice.DaggerApplication;

import javax.inject.Inject;

/**
 * Created by Charlton on 6/30/17.
 */

public class BaseActivity extends AppCompatActivity{

    @Inject
    public SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((DaggerApplication)getApplication()).getComponent().inject(this);
    }
}
