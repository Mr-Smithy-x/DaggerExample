package com.code.daggerpractice;

import android.app.Application;
import android.content.SharedPreferences;

import com.code.daggerpractice.dagger.AppComponent;
import com.code.daggerpractice.dagger.AppModule;
import com.code.daggerpractice.dagger.DaggerAppComponent;

import javax.inject.Inject;

/**
 * Created by Charlton on 6/30/17.
 */

public class DaggerApplication extends Application {


    private AppComponent component;

    public AppComponent getComponent() {
        return component;
    }

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        component.inject(this);
    }
}
