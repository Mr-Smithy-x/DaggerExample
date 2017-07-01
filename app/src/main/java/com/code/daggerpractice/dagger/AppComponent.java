package com.code.daggerpractice.dagger;

import com.code.daggerpractice.DaggerApplication;
import com.code.daggerpractice.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Charlton on 6/30/17.
 */
@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(BaseActivity baseActivity);
    void inject(DaggerApplication application);
}
