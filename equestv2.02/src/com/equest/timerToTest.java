package com.equest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.equest.utilities.timer;

public class timerToTest extends Activity {
	TextView timerTest;
	timer test;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timer_test);
		timerTest=(TextView)findViewById(R.id.timer_text);
		test=new timer(timerTest);
		test.setTimer(900000, 10);
		test.startTimer();
	
//		while(test.retIsFinished()){
//			//Log.i("Salik", "" + test.retSeconds());
//		timerTest.setText("HOURS:"+test.retHours()+"MINUTES:"+test.retMinutes()+"SECONDS:"+test.retSeconds());
//		}
	}

}
