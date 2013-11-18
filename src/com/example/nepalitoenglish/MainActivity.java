package com.example.nepalitoenglish;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.nepalitoenglish.helper.Logic;

public class MainActivity extends Activity {

	Button toEnglish, toNepali;
	TextView conversionDate;
	EditText in_year, in_month, in_day;

	Logic logic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toEnglish = (Button) findViewById(R.id.converttoEnglish);
		toNepali = (Button) findViewById(R.id.converttoNepali);

		in_year = (EditText) findViewById(R.id.year);
		in_month = (EditText) findViewById(R.id.month);
		in_day = (EditText) findViewById(R.id.day);

		conversionDate = (TextView) findViewById(R.id.conversionDate);

		logic = new Logic(MainActivity.this, conversionDate);

		toNepali.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				logic.englishToNepali(
						Integer.parseInt(in_year.getText().toString()),
						Integer.parseInt(in_month.getText().toString()),
						Integer.parseInt(in_day.getText().toString()));
			}
		});

		toEnglish.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				logic.nepaliToEnglish(
						Integer.parseInt(in_year.getText().toString()),
						Integer.parseInt(in_month.getText().toString()),
						Integer.parseInt(in_day.getText().toString()));
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
