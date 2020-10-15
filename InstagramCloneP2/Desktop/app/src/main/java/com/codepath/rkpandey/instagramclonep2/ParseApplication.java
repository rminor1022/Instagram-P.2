package com.codepath.rkpandey.instagramclonep2;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JsromKAwkUr5ikpodh01EqQpNdgSEKQ3wdHtlkR3")
                .clientKey("JFMLIws1RVgxzM71j9vQsIM5bwriMpLkW79cKqjC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}