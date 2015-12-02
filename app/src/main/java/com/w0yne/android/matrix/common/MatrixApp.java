package com.w0yne.android.matrix.common;

import android.app.Application;

import com.w0yne.android.matrix.di.components.ApplicationComponent;
import com.w0yne.android.matrix.di.components.DaggerApplicationComponent;
import com.w0yne.android.matrix.di.modules.ApplicationModule;

public class MatrixApp extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initInjector();
    }

    private void initInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
