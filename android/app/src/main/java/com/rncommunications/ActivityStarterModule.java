package com.rncommunications;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ActivityStarterModule extends ReactContextBaseJavaModule {

    ActivityStarterModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    private String TAG = "ActivityStarterModule";

    @SuppressLint("LogNotTimber")
    @ReactMethod
    public void openMeeting(String facility, String room) {
        Log.d(TAG, "openMeeting called with facility: " + facility
                + " and room: " + room);
        Activity activity = getCurrentActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, JoinMeetingActivity.class);
            activity.startActivity(intent);
//            AlertDialog alertDialog = new AlertDialog.Builder(activity)
////set icon
//                    .setIcon(android.R.drawable.ic_dialog_alert)
////set title
//                    .setTitle("Are you sure to Exit")
////set message
//                    .setMessage("Exiting will call finish() method")
////set positive button
//                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            //set what would happen when positive button is clicked
////                            finish();
//                        }
//                    })
////set negative button
//                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            //set what should happen when negative button is clicked
//                            Toast.makeText(activity,"Nothing Happened",Toast.LENGTH_LONG).show();
//                        }
//                    });
//                    .show();
        }
    }

    @NonNull
    @Override
    public String getName() {
        return TAG;
    }
}
