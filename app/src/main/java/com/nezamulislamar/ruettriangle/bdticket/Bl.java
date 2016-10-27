package com.nezamulislamar.ruettriangle.bdticket;

import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bl extends Activity {
	Button b[] = new Button[4];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bl);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Offline Train Ticket");
		
		
		b[1] = (Button)findViewById(R.id.reGisterbl);
		b[2] = (Button)findViewById(R.id.blCounter);
		b[3] = (Button)findViewById(R.id.BuYTickEtbl);
		
        b[1].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[1].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					String phoneNo = "1200";
					  String sms = "TKET";
		 
					  try {
						SmsManager smsManager = SmsManager.getDefault();
						smsManager.sendTextMessage(phoneNo, null, sms, null, null);
						Toast.makeText(getApplicationContext(), "SMS Sent!",
									Toast.LENGTH_LONG).show();
					  } catch (Exception e) {
						Toast.makeText(getApplicationContext(),
							"SMS faild, please try again later!",
							Toast.LENGTH_LONG).show();
						e.printStackTrace();
					  }
					b[1].getBackground().setAlpha(255);
				    break;
				case MotionEvent.ACTION_MOVE:
					
					b[1].getBackground().setAlpha(80);
					break;
				default:
					break;
				}

				return false;
			}
		});
        
        b[2].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[2].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(Bl.this,HelpDetails.class);
					docs.putExtra("help", 11);
					startActivity(docs);
					b[2].getBackground().setAlpha(255);
				    break;
				case MotionEvent.ACTION_MOVE:
					
					b[2].getBackground().setAlpha(80);
					break;
				default:
					break;
				}

				return false;
			}
		});
		
		b[3].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[3].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					String ussdCode = "*" + "131" + Uri.encode("#");
					startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
					b[3].getBackground().setAlpha(255);
				    break;
				case MotionEvent.ACTION_MOVE:
					
					b[3].getBackground().setAlpha(80);
					break;
				default:
					break;
				}

				return false;
			}
		});
		
		
	}

	

}
