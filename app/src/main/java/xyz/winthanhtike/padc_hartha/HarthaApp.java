package xyz.winthanhtike.padc_hartha;

import android.app.Application;
import android.content.Context;

/**
 * Created by winthanhtike on 6/24/16.
 */
public class HarthaApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this.getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
