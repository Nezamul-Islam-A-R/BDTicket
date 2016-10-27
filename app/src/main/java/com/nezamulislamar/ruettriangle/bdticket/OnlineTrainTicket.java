package com.nezamulislamar.ruettriangle.bdticket;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HeterogeneousExpandableList;

public class OnlineTrainTicket extends Activity {
	Button b[] = new Button[4];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_online_train_ticket);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Train Online Ticket");
		
		b[1] = (Button)findViewById(R.id.helpTrain);
		b[2] = (Button)findViewById(R.id.resisterTrain);
		b[3] = (Button)findViewById(R.id.signIn);
		
        b[1].setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				
				switch(event.getAction()){
				case   MotionEvent.ACTION_DOWN:
					b[1].getBackground().setAlpha(80);
					break;
				case MotionEvent.ACTION_UP:
					Intent docs = new Intent(OnlineTrainTicket.this,HelpDetails.class);
					docs.putExtra("help", 22);
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
					Intent docs = new Intent(OnlineTrainTicket.this,BuyTicketWeb.class);
					docs.putExtra("bus", 2);
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
					Intent docs = new Intent(OnlineTrainTicket.this,BuyTicketWeb.class);
					docs.putExtra("bus", 3);
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
