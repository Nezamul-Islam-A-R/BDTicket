package com.nezamulislamar.ruettriangle.bdticket;
import com.nezamulislamar.ruettriangle.bdticket.PostCode.myWebClient;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Gmail extends Activity {
	private String curURL = "https://mail.google.com/";
	WebView mWebView;
	ProgressBar pr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gmail);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.titlebar));
		bar.setTitle("Gmail Account");
		
		mWebView = (WebView) findViewById(R.id.GmailWeb);
		pr = (ProgressBar)findViewById(R.id.prGmail);
	    //WebSettings webSettings = mWebView.getSettings();
		mWebView.setWebViewClient(new myWebClient());
	    mWebView.getSettings().setJavaScriptEnabled(true);
	    //mWebView.setWebViewClient(new webClient());
	    //finish();
	    mWebView.loadUrl(curURL);
	}
		
	public class myWebClient extends WebViewClient
    {
    	@Override
    	public void onPageStarted(WebView view, String url, Bitmap favicon) {
    		// TODO Auto-generated method stub
    		//pr.setVisibility(View.VISIBLE);
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
    		//pr.setEnabled(false);
    	
    	}
    }
	
	

}
