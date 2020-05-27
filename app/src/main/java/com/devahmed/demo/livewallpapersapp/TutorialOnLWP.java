package com.devahmed.demo.livewallpapersapp;

import android.app.Activity;
import android.os.Bundle;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Intent;

public class TutorialOnLWP extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        i.setAction(WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        i.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                new ComponentName(
                        MyLWPService.class.getPackage().getName(),
                        MyLWPService.class.getCanonicalName()
                )
        );

        startActivity(i);
    }
}
