package com.code.daggerpractice;

import android.os.Bundle;
import android.util.Log;

import com.code.daggerpractice.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (preferences.contains("BITCH")) {
            Log.w(getClass().getName(), "Bitched is contained");
        } else {
            Log.w(getClass().getName(), "Bitched is not contained");
        }
    }
}
