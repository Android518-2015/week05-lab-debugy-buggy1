package ca.campbell.lab3buggy;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	 public void doShowSecondScreen(View view) {
	        Intent launchOtherScreen = new Intent(getApplicationContext(),
	                OtherActivity.class);
	        startActivity(launchOtherScreen);
	    }
	

}
