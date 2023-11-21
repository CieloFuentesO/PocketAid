package com.switchcasetech.pocketaidapp;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;

import com.switchcasetech.pocketaidapp.R;

	public class welcome_activity extends Activity {

	
	private View _bg___welcome;
	private ImageView fondosplash;
	private ImageView logosinfondo;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		/*_bg___welcome = (View) findViewById(R.id._bg___welcome);*/
		fondosplash = (ImageView) findViewById(R.id.fondosplash);
		logosinfondo = (ImageView) findViewById(R.id.logosinfondo);
	
		

	
	}
}
	
	