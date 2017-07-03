package sv.com.manuelqh.tipcalcc;

import android.app.Application;

/**
 * Created by postgres on 17/2/2017.
 */

public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "https://www.facebook.com/Ryuzzzzaki";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
