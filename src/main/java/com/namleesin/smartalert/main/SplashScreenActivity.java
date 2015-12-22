package com.namleesin.smartalert.main;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import com.namleesin.smartalert.R;


public class SplashScreenActivity extends Activity 
{
	private Handler mHandler = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		mHandler = new Handler();
		mHandler.postDelayed(finishActivity, 2000);
	}
	
	private Runnable finishActivity = new Runnable()
	{
		@Override
		public void run()
		{
			setResult(RESULT_OK);
			finish();
		}		
	};
}
