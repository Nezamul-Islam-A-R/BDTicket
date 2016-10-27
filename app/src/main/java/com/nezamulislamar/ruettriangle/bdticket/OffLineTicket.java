package com.nezamulislamar.ruettriangle.bdticket;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class OffLineTicket extends Activity {
	Button b[] = new Button[4];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_off_line_ticket);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Offline Train Ticket");
		
		b[1] = (Button)findViewById(R.id.GP);
		b[2] = (Button)findViewById(R.id.OffHelp);
		b[3] = (Button)findViewById(R.id.Bl);
		
		b[1].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[1].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(OffLineTicket.this,Gp.class);
					//docs.putExtra("help", 3);
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
					Intent docs = new Intent(OffLineTicket.this,HelpDetails.class);
					docs.putExtra("help", 3);
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
					Intent docs = new Intent(OffLineTicket.this,Bl.class);
					//docs.putExtra("help", 3);
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
	}

	

}
