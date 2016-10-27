package com.nezamulislamar.ruettriangle.bdticket;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Open extends Activity {
	Button b[] = new Button[7];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_open);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Mobile Ticket");
		
		//android:screenOrientation="portrait"
		b[1] = (Button)findViewById(R.id.button1);
		b[2] = (Button)findViewById(R.id.button2);
		b[3] = (Button)findViewById(R.id.button3);
		b[4] = (Button)findViewById(R.id.button4);
		b[5] = (Button)findViewById(R.id.button5);
		b[6] = (Button) findViewById(R.id.button6);
		
		b[1].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[1].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(Open.this,OnlineTrainTicket.class);
					startActivity(docs);
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
					Intent docs = new Intent(Open.this,OnlineBusTicket.class);
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
					Intent docs = new Intent(Open.this,OffLineTicket.class);
					startActivity(docs);
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
		
		b[4].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[4].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(Open.this,Gmail.class);
					startActivity(docs);
					b[4].getBackground().setAlpha(255);
				    break;
				case MotionEvent.ACTION_MOVE:
					
					b[4].getBackground().setAlpha(80);
					break;
				default:
					break;
				}

				return false;
			}
		});
		
		b[5].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[5].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(Open.this,PostCode.class);
					startActivity(docs);
					b[5].getBackground().setAlpha(255);
				    break;
				case MotionEvent.ACTION_MOVE:
					
					b[5].getBackground().setAlpha(80);
					break;
				default:
					break;
				}

				return false;
			}
		});
		
		
		b[6].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[6].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(Open.this,Tracker.class);
					startActivity(docs);
					b[6].getBackground().setAlpha(255);
				    break;
				case MotionEvent.ACTION_MOVE:
					
					b[6].getBackground().setAlpha(80);
					break;
				default:
					break;
				}

				return false;
			}
		});
	
	}
	
	
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gp, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
	    case R.id.action_settings:
	    	this.finish();
	    default:
			return super.onOptionsItemSelected(item);
	
	    }
		//return super.onOptionsItemSelected(item);
	
	
	}
	*/
	
}
