package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	Button standard,scientific,converter,alarm,vedicMult,vedicAdd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		standard = (Button) findViewById(R.id.button1);
		scientific = (Button) findViewById(R.id.button2);
		converter = (Button) findViewById(R.id.button3);
		alarm = (Button) findViewById(R.id.button4);
		vedicMult = (Button) findViewById(R.id.button5);
		vedicAdd  = (Button) findViewById(R.id.button6);
		
		standard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Standard.class));
			}
		});
		
		scientific.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Scientific.class));				
			}
		});
		
		converter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Converter.class));
			}
		});
		
		alarm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,AlarmActivity.class));	
			}
		});
		
		vedicMult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,Cal.class));				
			}
		});
		
		vedicAdd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,AddActivity.class));				
			}
		});
	}
}
