package com.questdot.dialogfragmentexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class AlertDFragment extends DialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {

		return new AlertDialog.Builder(getActivity())

				.setIcon(R.mipmap.ic_launcher)
				.setTitle("Alert DialogFragment")
				.setMessage("Alert DialogFragment Tutorial")
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

					}
				})
				.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {

					}
				}).create();
	}
}