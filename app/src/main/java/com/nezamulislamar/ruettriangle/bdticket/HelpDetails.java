package com.nezamulislamar.ruettriangle.bdticket;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.widget.TextView;

public class HelpDetails extends Activity {
	TextView text;
	int Onhelp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help_details);
		ActionBar bar = getActionBar();
		//bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		
		//bar.setTitle("Online bus Ticket");
		
		text =(TextView)findViewById(R.id.Text);
		Onhelp = getIntent().getIntExtra("help", 1);
		if(Onhelp == 1)
		{
			bar.setTitle("Online Bus Help");
			text.setText(R.string.HelpBuyTicket);
		}else if(Onhelp == 22)
		{
			bar.setTitle("Online Train Help");
			text.setText(R.string.TrainHelp);
		}else if(Onhelp == 3)
		{
			bar.setTitle("Offline Train Help");
			text.setText(R.string.helpOfflineTickit);
		}else if(Onhelp == 10)
		{
			bar.setTitle("Gp Ticket Counter");
			text.setText(R.string.GpCounter);
		}else if(Onhelp == 11)
		{
			bar.setTitle("Bl Ticket Counter");
			text.setText(R.string.BLCounter);
		}else if(Onhelp == 55)
		{
			bar.setTitle("Developer");
			text.setText("My Mobile Ticket app is developed by N I Ashafuddula Razon.Please before purchasing a ticket read the instruction carefully.\nE-mail:islam123009@gmail.com");
		}
	}

	

}
