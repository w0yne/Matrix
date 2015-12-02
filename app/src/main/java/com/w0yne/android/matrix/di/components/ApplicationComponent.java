package com.w0yne.android.matrix.di.components;

import android.content.Context;

import com.w0yne.android.matrix.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context applicationContext();
}
