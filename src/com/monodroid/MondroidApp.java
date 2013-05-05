package com.monodroid;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;


public class MondroidApp extends Activity  {

	private static final String TAG = "MonodroidApp";

	MenuItem item_track;
	MenuItem item_exit;
	MenuItem item_map;
	MenuItem item_settings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "On Create");
		setContentView(R.layout.mondroid_app);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mondroid_app, menu);
		item_exit = menu.findItem(R.id.item_exit);
		item_map = menu.findItem(R.id.item_map);
		item_track = menu.findItem(R.id.item_track);
		item_settings = menu.findItem(R.id.item_settings);
		return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem v) {
	      Log.i(TAG, "In onClick(View v)");
	      if (v.equals(item_exit)) {
	        Log.i(TAG, "Exiting.");
	        finish();
	      }
	      else if (v.equals(item_map)) {

	      }
	      else if (v.equals(item_track)) {

	      }
	      else if (v.equals(item_settings)) {
	    	  
	      }
	      else {
	        Log.e(TAG, "No such View");
	      }
		
	    return true;
   }

	public void onClick(View v) {
	}



}

