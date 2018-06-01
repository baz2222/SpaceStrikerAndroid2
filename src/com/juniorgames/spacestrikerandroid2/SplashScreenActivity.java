package com.juniorgames.spacestrikerandroid2;

import com.juniorgames.spacestrikerandroid.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity {
private static int SST = 5000;
@Override 
protected void onCreate(Bundle s){
	super.onCreate(s);
	setContentView(R.layout.activity_splash_screen);
	new Handler().postDelayed(new Runnable(){
		@Override
		public void run(){
			Intent i=new Intent(SplashScreenActivity.this,GameScreenActivity.class);
			startActivity(i);
			finish();//close this activity
		}
	},SST);
}
}
