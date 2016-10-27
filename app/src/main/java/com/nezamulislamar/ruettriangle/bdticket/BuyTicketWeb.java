package com.nezamulislamar.ruettriangle.bdticket;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class BuyTicketWeb extends Activity {
	WebView FinalWebView;
	ProgressBar pr;
	int flag;
	String busLink = "https://www.bdtickets.com";
	String busLink2 ="https://www.shohoz.com/" ;
	String trainLink = "";
	
	String TrainRegister = "https://www.esheba.cnsbd.com/user/signup";
	String TrainSignIn = "https://www.esheba.cnsbd.com";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buy_ticket_web);
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		
		FinalWebView = (WebView)findViewById(R.id.BuyBusTicket);
		pr = (ProgressBar)findViewById(R.id.progressBar);
		flag = getIntent().getIntExtra("bus", 1);
		
		if(flag == 1)
		{
			bar.setTitle("Buy Bus Ticket");
			FinalWebView.setWebViewClient(new myWebClient());
			FinalWebView.getSettings().setJavaScriptEnabled(true);
			FinalWebView.loadUrl(busLink);
		}else if(flag == 4)
		{
			bar.setTitle("Buy Bus Ticket");
			FinalWebView.setWebViewClient(new myWebClient());
			FinalWebView.getSettings().setJavaScriptEnabled(true);
			FinalWebView.loadUrl(busLink2);
		}else if(flag == 2)
		{
			bar.setTitle("Register Now");
			FinalWebView.setWebViewClient(new myWebClient());
			FinalWebView.getSettings().setJavaScriptEnabled(true);
			FinalWebView.loadUrl(TrainRegister);
		}else if(flag == 3)
		{
			bar.setTitle("Sing In / Buy Ticket");
			FinalWebView.setWebViewClient(new myWebClient());
			FinalWebView.getSettings().setJavaScriptEnabled(true);
			FinalWebView.loadUrl(TrainSignIn);
		}
	}
	
	public class myWebClient extends WebViewClient
    {
    	@Override
    	public void onPageStarted(WebView view, String url, Bitmap favicon) {
    		// TODO Auto-generated method stub
    		pr.setVisibility(View.VISIBLE);
    		
    		//BuyTicketWeb.this.pr.setProgress(0);
    		super.onPageStarted(view, url, favicon);
    	}
    	
    	@Override
    	public boolean shouldOverrideUrlLoading(WebView view, String url) {
    		// TODO Auto-generated method stub
    		
    		view.loadUrl(url);
    		return true;
    		
    	}
    	
    	@Override
    	public void onPageFinished(WebView view, String url) {
    		// TODO Auto-generated method stub
    		pr.setVisibility(View.GONE);
    		//BuyTicketWeb.this.pr.setProgress(100);
    		super.onPageFinished(view, url);
    		
    		//pr.setVisibility(View.GONE);
    		pr.setEnabled(false);
    	
    	}
    }
    
    // To handle "Back" key press event for WebView to go back to previous screen.
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		if ((keyCode == KeyEvent.KEYCODE_BACK) && FinalWebView.canGoBack()) {
			FinalWebView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	

}
