package com.code.daggerpractice.dagger;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Charlton on 6/30/17.
 */

@Module
public class AppModule {

    SharedPreferences sharedPreferences;

    public AppModule(Context context) {
        sharedPreferences = context.getSharedPreferences("dagger", Context.MODE_PRIVATE);
    }

    @Singleton
    @Provides
    SharedPreferences providesSharedPreferences() {
        return sharedPreferences;
    }
}
