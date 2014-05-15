package com.example.calculator;

import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;

public class AlarmActivity extends Activity {
	
	Button showDialog,setAlarm,cancelAlarm;
	Spinner spin;
	EditText edit;
	String fetchedItemName;
	static int temp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarm);
		findResourcesIDs();
		
		//edit.setOnClickListener(new View.OnClickListener() {
			
			//@Override
			//public void onClick(View v) {
				//temp = (temp + 1)%2;
				//startActivity(new Intent("com.kgec.biswajit.TimePickerActivity"));
				//finish();
			//}
		//});
		
		//edit.setOnTouchListener(new View.OnTouchListener() {
			
			//@Override
			//public boolean onTouch(View v, MotionEvent event) {
				//temp = (temp + 1)%2;
				//startActivity(new Intent("com.kgec.biswajit.TimePickerActivity"));
				//finish();
				//return true;
			//}
		//});
		
		//if(temp == 1){
			//String text = getIntent().getExtras().getString("timeName");
			//edit.setText(text);
		//}
		
		showDialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showVolumeDialog();	
			}
		});
		
		spin.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> Items, View v, int Position, long arg3) {
				fetchedItemName = Items.getItemAtPosition(Position).toString();
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
		});
		
		setAlarm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String Time = edit.getText().toString();
				if(Time.contentEquals(""))
					Toast.makeText(getApplicationContext(), "Enter the Time...", Toast.LENGTH_LONG).show();
				else
					startService(new Intent(AlarmActivity.this,AlarmService.class).putExtra("time_tone", Time+fetchedItemName));
			}
		});
		
		cancelAlarm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				stopService(new Intent(AlarmActivity.this,AlarmService.class));
				Toast.makeText(getBaseContext(), "The Alarm Has Been Cancelled...", Toast.LENGTH_LONG).show();
			}
		});
	}


	private void findResourcesIDs(){
		showDialog = (Button) findViewById(R.id.volumeButton);
		setAlarm = (Button) findViewById(R.id.setButton);
		cancelAlarm = (Button) findViewById(R.id.cancelButton);
		spin = (Spinner) findViewById(R.id.spinner1);
		edit = (EditText) findViewById(R.id.editText1);
	}
	
	private void showVolumeDialog(){
		final Dialog volumeDialog = new Dialog(AlarmActivity.this);
		volumeDialog.setContentView(R.layout.volume_dialog);
		volumeDialog.setTitle("Adjust Volume Here...");
		volumeDialog.setCanceledOnTouchOutside(false);
		SeekBar seek = (SeekBar) volumeDialog.findViewById(R.id.seekBar1);
		Button set = (Button) volumeDialog.findViewById(R.id.button1);
		
		final AudioManager amd = (AudioManager) getSystemService(AUDIO_SERVICE);
		int nowVolume = amd.getStreamVolume(AudioManager.STREAM_MUSIC);
		int maxVolume = amd.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
		seek.setProgress(nowVolume);
		seek.setMax(maxVolume);
		
		seek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			int Progress;
			public void onStopTrackingTouch(SeekBar arg0) {
				amd.setStreamVolume(AudioManager.STREAM_MUSIC, Progress, 0);
			}
			
			public void onStartTrackingTouch(SeekBar arg0) {
				
			}
			
			public void onProgressChanged(SeekBar arg0, int nowPosition, boolean arg2) {
				Progress = nowPosition;
				amd.setStreamVolume(AudioManager.STREAM_MUSIC, nowPosition, 0);
			}
		});
		volumeDialog.show();
		
		set.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				volumeDialog.dismiss();	
			}
		});
	}
}
