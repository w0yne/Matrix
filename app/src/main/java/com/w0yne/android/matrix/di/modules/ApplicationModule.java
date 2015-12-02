package com.w0yne.android.matrix.di.modules;

import android.content.Context;

import com.w0yne.android.matrix.common.MatrixApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final MatrixApp application;

    public ApplicationModule(MatrixApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }
}
