package com.nezamulislamar.ruettriangle.bdticket;
import com.nezamulislamar.ruettriangle.bdticket.BuyTicketWeb.myWebClient;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class PostCode extends Activity {
	EditText dis;
	Button src;
	WebView WebSrc;
	String nm = "";
	String nameD;
	ProgressBar pr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_post_code);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Post Code");
		
		//dis = (EditText) findViewById(R.id.Dis);
		//src = (Button) findViewById(R.id.srcpost);
		WebSrc = (WebView) findViewById(R.id.PostWeb);
		pr = (ProgressBar)findViewById(R.id.prP);
		
		final String Urls = "http://info.amardesh.com/information/bangladesh-post-codes/";
		
		WebSrc.setWebViewClient(new myWebClient());
		WebSrc.getSettings().setJavaScriptEnabled(true);
		WebSrc.loadUrl(Urls);
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
		if ((keyCode == KeyEvent.KEYCODE_BACK) && WebSrc.canGoBack()) {
			WebSrc.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	

}
