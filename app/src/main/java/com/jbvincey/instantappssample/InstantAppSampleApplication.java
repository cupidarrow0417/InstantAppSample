package com.jbvincey.instantappssample;

import android.app.Application;

import com.jbvincey.instantappssample.dependencies.DependencyManager;

/**
 * Created by jean-baptistevincey on 13/06/2017.
 */

public class InstantAppSampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DependencyManager.getInstance().initWithContext(getApplicationContext());
    }
}
