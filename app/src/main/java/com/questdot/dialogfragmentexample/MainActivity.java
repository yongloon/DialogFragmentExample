package com.questdot.dialogfragmentexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
	
	Button btn_cd;
	Button btn_ad;
	FragmentManager fm = getSupportFragmentManager();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn_cd = (Button) findViewById(R.id.btn_cd);
		btn_ad = (Button) findViewById(R.id.btn_ad);

		btn_cd.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				CustomDFragment dFragment = new CustomDFragment();

				dFragment.show(fm, "Custom Dialog Fragment");
			}
		});


		btn_ad.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				AlertDFragment alertdFragment = new AlertDFragment();

				alertdFragment.show(fm, "Alert Dialog Fragment");
			}
		});
	}
}