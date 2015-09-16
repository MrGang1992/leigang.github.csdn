package com.leigang.textphonegap.plugin;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

import android.util.Log;

@SuppressWarnings("deprecation")
public class TextPlugin extends Plugin {
	private PluginResult pluginResult;
	@Override
	public PluginResult execute(String result, JSONArray arg1, String arg2) {
		Log.e("TAG", "result == " + result);
		Log.e("TAG", "arg1 == " + arg1);
		Log.e("TAG", "arg2 == " + arg2);
		if(result.equalsIgnoreCase("textLogin")){
			pluginResult = new PluginResult(PluginResult.Status.OK);
		}else{
			pluginResult = new PluginResult(PluginResult.Status.ERROR);
		}
		return pluginResult;
	}
}
