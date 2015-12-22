package com.namleesin.smartalert.settingmgr;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.namleesin.smartalert.R;


public class SpamNotiSettingActivity extends Activity implements OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spamsetting);
		
		Button btn = (Button)this.findViewById(R.id.spambutton);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) 
	{
		switch(v.getId())
		{
			case R.id.spambutton:
				setResult(RESULT_OK);
				finish();
				break;
			default:
				break;
		}
		
	}
}
