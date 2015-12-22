package com.namleesin.smartalert.guidemgr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.namleesin.smartalert.R;


public class GuideDes03Activity extends Activity implements OnTouchListener, OnClickListener 
{
	float pressedX = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide03);
		
		LinearLayout linear = (LinearLayout)findViewById(R.id.llayout03);
		linear.setOnTouchListener(this);
		
		Button btn = (Button)this.findViewById(R.id.button);
		btn.setOnClickListener(this);
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
						
		if (distance <= 0) 
		{
			Intent intent = new Intent(this, GuideDes02Activity.class);
			startActivity(intent);
			overridePendingTransition(R.anim.right_in, R.anim.right_out);
		} 
		else 
		{
			return false;
		}
	
		finish();
						
		return true;
	}

	@Override
	public void onClick(View v) 
	{
		switch(v.getId())
		{
			case R.id.button:
				setResult(RESULT_OK);
				finish();
				break;
		}
	}
}
