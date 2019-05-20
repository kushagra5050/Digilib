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



public class Screen2Activity extends Activity {

	private LinearLayout linear2;
	private Button button4;
	private LinearLayout linear3;
	private Button button3;
	private LinearLayout linear4;
	private Button button2;
	private TextView textview1;



	private Intent data1 = new Intent();
	private Intent data2 = new Intent();
	private Intent data3 = new Intent();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		button4 = (Button) findViewById(R.id.button4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		button3 = (Button) findViewById(R.id.button3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button2 = (Button) findViewById(R.id.button2);
		textview1 = (TextView) findViewById(R.id.textview1);





		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				data1.setAction(Intent.ACTION_VIEW);
				data1.setData(Uri.parse("https://www.Google.com"));
				startActivity(data1);
			}
		});
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 

			}
		});
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) { 
				data2.setAction(Intent.ACTION_VIEW);
				data2.setClass(getApplicationContext(), EbooksActivity.class);
				startActivity(data2);
			}
		});

	}

	private void  initializeLogic() {

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
