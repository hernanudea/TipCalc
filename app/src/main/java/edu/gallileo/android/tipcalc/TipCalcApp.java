package edu.gallileo.android.tipcalc;

import android.app.Application;

/**
 * Created by HernánDarío on 09/06/2016.
 */

// se debe agregar al manifest: android:name=".TipCalcApp"
public class TipCalcApp extends Application {
    private  final static String ABOUT_URL = "https://about.me/hernanvelasquez";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
