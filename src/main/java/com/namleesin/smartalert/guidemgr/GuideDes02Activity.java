package com.namleesin.smartalert.guidemgr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

import com.namleesin.smartalert.R;


public class GuideDes02Activity extends Activity implements OnTouchListener
{
	float pressedX = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide02);
		
		LinearLayout linear = (LinearLayout)findViewById(R.id.llayout02);
		linear.setOnTouchListener(this);
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event) 
	{
		float distance = 0;
						
		switch(event.getAction()) 
		{
			case MotionEvent.ACTION_DOWN:
				pressedX = event.getX();
				break;
			case MotionEvent.ACTION_UP:
				distance = pressedX - event.getX();
				break;
		}
	
		if (Math.abs(distance) < 100) 
		{
			return true;	
		}
						
		if (distance > 0) 
		{
			Intent intent = new Intent(this, GuideDes03Activity.class);
			startActivity(intent);
			
			overridePendingTransition(R.anim.left_in, R.anim.left_out);
		} 
		else 
		{
			Intent intent = new Intent(this, GuideDes01Activity.class);
			startActivity(intent);
			
			overridePendingTransition(R.anim.right_in, R.anim.right_out);
		}
	
		finish(); 
						
		return true;
	}
}
