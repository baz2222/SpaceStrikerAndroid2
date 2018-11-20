package com.juniorgames.spacestrikerandroid2;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import android.os.Bundle;
public class GameScreenActivity extends AndroidApplication {
    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new SpaceStriker(),config);
    }
}
