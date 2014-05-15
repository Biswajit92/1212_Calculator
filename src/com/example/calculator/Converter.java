package com.example.calculator;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Converter extends ListActivity {
    
	String classes[]={"Temperature","Mass","Volume","Area","Length"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(Converter.this,android.R.layout.simple_expandable_list_item_1, classes));
	}

	@Override
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		String cheese =classes[position];
		try{
		@SuppressWarnings("rawtypes")
		Class ourClass = Class.forName("com.example.calculator."+cheese);
		Intent ourIntent= new Intent(Converter.this,ourClass);
		startActivity(ourIntent);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		}

}
