package com.example.calculator;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.os.PowerManager;
import android.widget.Toast;


public class AlarmService extends Service {

	MediaPlayer alarmTone;
	TimerTask task;
	Timer timer;
	
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		PowerManager pm = (PowerManager) getSystemService(POWER_SERVICE);
		PowerManager.WakeLock wake = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "New WakeLock...");
		wake.acquire();
		
		final String Time_Tone = intent.getExtras().getString("time_tone");
		final String Time = Time_Tone.substring(0, 5);
		final String Tone = Time_Tone.substring(5, Time_Tone.length());
		
		Toast.makeText(getBaseContext(), "The Alarm Has Been Set At : " + Time, Toast.LENGTH_LONG).show();
		
		task = new TimerTask() {
			@Override
			public void run() {
				if(Time.contentEquals(getSystemTime()) && alarmTone == null)
					startRingingAlarm(Tone);
			}
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(task, 0, 1000);
		return START_STICKY;
	}
	
	@SuppressLint("DefaultLocale")
	private String getSystemTime(){
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		return String.format("%02d:%02d", hour,minute);
	}
	
	private void startRingingAlarm(String tone){
		int Ringer;
		if(tone.contentEquals("Default Tone")) Ringer = 1;
		else if(tone.contentEquals("Airtel Song")) Ringer = 2;
		else if(tone.contentEquals("Apple Tone")) Ringer = 3;
		else if(tone.contentEquals("Nocturnal")) Ringer = 4;
		else if(tone.contentEquals("Koyel Tone")) Ringer = 5;
		else if(tone.contentEquals("Rooster Tone")) Ringer = 6;
		else if(tone.contentEquals("Soulful")) Ringer = 7;
		else Ringer = 8;
		switch(Ringer){
		case 1:alarmTone = MediaPlayer.create(this, R.raw.bydefault);
		       break;
		case 2:alarmTone = MediaPlayer.create(this, R.raw.airtelsong);
	           break;
		case 3:alarmTone = MediaPlayer.create(this, R.raw.appletone);
		   	   break;
		case 4:alarmTone = MediaPlayer.create(this, R.raw.nocturnal);
		   	   break;
		case 5:alarmTone = MediaPlayer.create(this, R.raw.koyel);
		   	   break;
		case 6:alarmTone = MediaPlayer.create(this, R.raw.rooster);
		   	   break;
		case 7:alarmTone = MediaPlayer.create(this, R.raw.soulful);
			   break;
		default:alarmTone = MediaPlayer.create(this, R.raw.toeing);
		   	    break;
		}
		alarmTone.start();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		alarmTone.release();
		//task.cancel();
		//timer.cancel();
		stopSelf();
	}
	
}
