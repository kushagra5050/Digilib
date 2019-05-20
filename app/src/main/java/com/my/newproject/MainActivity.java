package com.my.newproject;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.ClipboardManager;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import java.util.*;
import java.text.*;



public class MainActivity extends Activity {

	private TextView ashoka;
	private ImageView imageview1;
	private Button button1;

	private double a = 0;


	private Intent IntentsetScreen = new Intent();
	private Intent m = new Intent();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		ashoka = (TextView) findViewById(R.id.ashoka);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		button1 = (Button) findViewById(R.id.button1);




		ashoka.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				IntentsetScreen.setClass(getApplicationContext(), Screen2Activity.class);
				startActivity(IntentsetScreen);
			}
		});
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				IntentsetScreen.setClass(getApplicationContext(), Screen2Activity.class);
				startActivity(IntentsetScreen);
			}
		});

	}

	private void  initializeLogic() {
		m.setClass(getApplicationContext(), SplashActivity.class);
		startActivity(m);
	}

	@Override
	public void onStart() {
		super.onStart();
				setTitle("");
				if (true) {

				}
	}
	@Override
	protected void onPostCreate(Bundle _savedInstanceState) {
		super.onPostCreate(_savedInstanceState);


	}
	@Override
	public void onStop() {
		super.onStop();

	}	@Override
	public void onBackPressed() {
				showMessage("BYE BYE");
				finish();
	}



	// created automatically
	private void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	private int getRandom(int _minValue ,int _maxValue){
		Random random = new Random();
		return random.nextInt(_maxValue - _minValue + 1) + _minValue;
	}

	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
				_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}

}
