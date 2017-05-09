package com.example.user.glcdemoui;

import android.app.Application;
import android.graphics.Typeface;
import android.icu.text.DateFormat;

import java.lang.reflect.Field;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by User on 04/04/2017.
 */

public final class FontsApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/coco.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

    }
}