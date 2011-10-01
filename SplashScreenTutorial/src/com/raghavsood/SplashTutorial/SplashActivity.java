package com.raghavsood.SplashTutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity {
	
	/** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
	      setContentView(R.layout.splash);
	      Thread splashThread = new Thread() {
	         @Override
	         public void run() {
	            try {
	               int waited = 0;
	               while (waited < 5000) {
	                  sleep(100);
	                  waited += 100;
	               }
	            } catch (InterruptedException e) {
	               // do nothing
	            } finally {
	               finish();
	               Intent ide = new Intent();
	               ide.setClassName("com.raghavsood.SplashTutorial",
	                              "com.raghavsood.SplashTutorial.SplashTutorial");
	               startActivity(ide);
	            }
	         }
	      };
	      splashThread.start();
	   }
	   public void onBackPressed() {

	      return;
	   }
}
