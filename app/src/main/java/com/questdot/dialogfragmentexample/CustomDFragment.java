package com.questdot.dialogfragmentexample;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CustomDFragment extends DialogFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.custom_df, container,
				false);
		getDialog().setTitle("DialogFragment Tutorial");		

		return rootView;
	}


}