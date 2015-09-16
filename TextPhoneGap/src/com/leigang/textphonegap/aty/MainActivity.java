package com.leigang.textphonegap.aty;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override
	public  void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String url = "file:///android_asset/www/text.html";
		loadUrl(url);
	}
}
