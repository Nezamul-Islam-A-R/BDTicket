package com.nezamulislamar.ruettriangle.bdticket;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tracker extends Activity {
	
	Button b;
	EditText et;
	String st = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tracker);
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Track Train");
		
		et = (EditText) findViewById(R.id.ID);
		b = (Button) findViewById(R.id.TrackButton);
		
	    
		//find = "Tr "+st;
		
		 b.setOnTouchListener(new View.OnTouchListener() {
				
				@Override
				public boolean onTouch(View arg0, MotionEvent event) {
					// TODO Auto-generated method stub
					
					switch(event.getAction()){
					case   MotionEvent.ACTION_DOWN:{
						b.getBackground().setAlpha(80);
						st = et.getText().toString();
					}
						break;
					case MotionEvent.ACTION_UP:
						String phoneNo = "16318";
						  String find = "Tr "+ st;
			 
						  try {
							SmsManager smsManager = SmsManager.getDefault();
							smsManager.sendTextMessage(phoneNo, null, find, null, null);
							Toast.makeText(getApplicationContext(), "SMS Sent to "+phoneNo+" !",
										Toast.LENGTH_LONG).show();
						  } catch (Exception e) {
							Toast.makeText(getApplicationContext(),
								"SMS faild, please try again later!",
								Toast.LENGTH_LONG).show();
							e.printStackTrace();
						  }
						b.getBackground().setAlpha(255);
					    break;
					case MotionEvent.ACTION_MOVE:
						
						b.getBackground().setAlpha(80);
						break;
					default:
						break;
					}

					return false;
				}
			});
	}

	

}
