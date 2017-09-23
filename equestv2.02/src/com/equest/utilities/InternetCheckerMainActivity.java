package com.equest.utilities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


import com.equest.Login;
import com.equest.R;
import com.equest.instructions_activity;



public class InternetCheckerMainActivity extends Activity {
	
	Boolean isInternetPresent = false;

	// Connection detector class object
	Connector cd;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.internet_checker_layout);

		

		// connection detector class instance
		cd = new Connector(getApplicationContext());

		// get Internet status
		// / //isInternetPresent= flag
		// // //isConnectingToInternet: method in ConnectionDetector
		
		isInternetPresent = cd.isConnectingToInternet();

	 // check for Internet status
		if (!isInternetPresent) {
// if not present show dialog box 
			showAlertDialog(InternetCheckerMainActivity.this,
					"Oops!",
					"You don't have internet connection.Please connect to the internet first!", false);
	

			// calls the showalertdialogbox function below

		} // if ends

		else {
			
//if present call main application 
			
			Intent ourIntent = new Intent(InternetCheckerMainActivity.this,Login.class);
			startActivity(ourIntent);
			finish();
			

		}// else ends

	}// oncreate ends
	
	
	
	
	@SuppressWarnings("deprecation")
	// Context= MainActivity.this
	// String title= "Internet connection Success/failure"
	// String message= "You have internet connection/You don't have internet
	// connection.
	public void showAlertDialog(Context context, String title, String message,
			Boolean status) {

		AlertDialog alertDialog = new AlertDialog.Builder(context).create();

		// Setting Dialog Title
		alertDialog.setTitle(title); // getting from above String title

		// Setting Dialog Message
		alertDialog.setMessage(message); // getting from above String message

		// Setting alert dialog icon
		alertDialog.setIcon((status) ? R.drawable.success
				: R.drawable.stop1); 
											

		// Setting OK Button
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				//when user clicks ok button on dialog box, close application 
				
				finish();
				
			}
		});

		// Showing Alert Message
		alertDialog.show();

	}

}
