package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Length  extends Activity{
	
	Spinner spinner1,spinner2;
	Button bteql,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnptn,btncl,btnhlp,btntg,btnbck;
	TextView tvCel,tvFar,tvKel;
	EditText etResult,output;
	String match1,match2,a;
	String p,q,r,s,t,u,v,w;
	
	  
	
	double mm,cm,m,km,feet,inch,mile,yard;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.length);
		
		spinner1=(Spinner) findViewById(R.id.spinner1);
		spinner2=(Spinner) findViewById(R.id.spinner2);
		bteql=(Button) findViewById(R.id.btequal);
		
		etResult=(EditText) findViewById(R.id.textinput);
		output=(EditText) findViewById(R.id.textoutput);
		btn0=(Button) findViewById(R.id.bt0);
		btn1=(Button) findViewById(R.id.bt1);
		btn2=(Button) findViewById(R.id.bt2);
		btn3=(Button) findViewById(R.id.bt3);
		btn4=(Button) findViewById(R.id.bt4);
		btn5=(Button) findViewById(R.id.bt5);
		btn6=(Button) findViewById(R.id.bt6);
		btn7=(Button) findViewById(R.id.bt7);
		btn8=(Button) findViewById(R.id.bt8);
		btn9=(Button) findViewById(R.id.bt9);
		btnptn=(Button) findViewById(R.id.btptn);
		btncl=(Button) findViewById(R.id.btclr);
		btnbck=(Button) findViewById(R.id.btback);
		btntg=(Button) findViewById(R.id.bttoggle);
		
		p="mm";
		q="cm";
		r="m";
		s="km";
		t="feet";
		u="inch";
		v="mile";
		w="yard";
		a="";
		
		//set a listener
				btn1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"1");
					}
				});
				btn2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"2");
					}
				});
				btn3.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"3");
					}
				});
				btn4.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"4");
					}
				});
				btn5.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
				           a=etResult.getText().toString();
						etResult.setText(a +"5");
					}
				});
				btnptn.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +".");
					}
				});
				btn6.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"6");
					}
				});
				btn7.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"7");
					}
				});
				btn8.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"8");
					}
				});
				btn9.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"9");
					}
				});
				btn0.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						etResult.setText(a +"0");
					}
				});
				btncl.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						etResult.setText("");
					}
				});
			btntg.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						a=etResult.getText().toString();
						double b;
						b=Float.parseFloat(etResult.getText().toString());	
						b= - b;
						etResult.setText(""+b);
						
					}
				});
			
			btnbck.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					a=etResult.getText().toString();
					int alen;
					alen=a.length();
					a=a.substring(0, alen-1);
					etResult.setText(""+a);
				}
			});
				
				bteql.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						
						match1=String.valueOf(spinner1.getSelectedItem());
						match2=String.valueOf(spinner2.getSelectedItem());
						
						if((match1.equals(p))&&(match2.equals(p)))
						{
							

							// read EditText and fill variables with numbers
							
						mm=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+mm);
						}
						if((match1.equals(p))&&(match2.equals(q)))
						{
							// read EditText and fill variables with numbers
						mm=Float.parseFloat(etResult.getText().toString());	
						cm=mm*0.1;
						output.setText(""+cm);
						
						}
						if((match1.equals(p))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							mm=Float.parseFloat(etResult.getText().toString());
							m=mm*0.001;
							output.setText(""+m);
							
						}
						if((match1.equals(p))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						mm=Float.parseFloat(etResult.getText().toString());	
						km=mm*0.000001;				
						output.setText(""+km);
						}
						if((match1.equals(p))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						mm=Float.parseFloat(etResult.getText().toString());	
							feet=mm*0.00328;			
						output.setText(""+feet);
						}
						if((match1.equals(p))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						mm=Float.parseFloat(etResult.getText().toString());	
						inch=mm*0.03937;
				    	output.setText(""+inch);

						}
						if((match1.equals(p))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						mm=Float.parseFloat(etResult.getText().toString());	
						mile=mm*0.00000062;
				    	output.setText(""+mile);
						}
						if((match1.equals(p))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						mm=Float.parseFloat(etResult.getText().toString());	
						yard=mm*0.001094;
				    	output.setText(""+yard);
						}
						if((match1.equals(q))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						mm=cm*10;;				
						output.setText(""+mm);
						}
						if((match1.equals(q))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						output.setText(""+cm);
						}
						if((match1.equals(q))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						m=cm*0.01;;				
						output.setText(""+m);
						}
						if((match1.equals(q))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						km=cm*0.00001;
				    	output.setText(""+km);
						}
						if((match1.equals(q))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						feet=cm*0.03281;
				    	output.setText(""+feet);

						}
						if((match1.equals(q))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						inch=cm*0.3937;
				    	output.setText(""+inch);

						}
						if((match1.equals(q))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						mile=cm*0.0000062;
				    	output.setText(""+mile);
						}
						if((match1.equals(q))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						cm=Float.parseFloat(etResult.getText().toString());	
						yard=cm*0.01094;
				    	output.setText(""+yard);
						}
						if((match1.equals(r))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						mm=m*1000;;				
						output.setText(""+mm);
						}
						if((match1.equals(r))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());
						cm=m*100;
						output.setText(""+cm);
						}
						if((match1.equals(r))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+m);
						}
						if((match1.equals(r))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						km=m*0.001;
				    	output.setText(""+km);
						}
						if((match1.equals(r))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						feet=m*3.281;
				    	output.setText(""+feet);

						}
						if((match1.equals(r))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						inch=m*39.37;
				    	output.setText(""+inch);

						}
						if((match1.equals(r))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						mile=m*0.00062;
				    	output.setText(""+mile);
						}
						if((match1.equals(r))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						yard=m*1.094;
				    	output.setText(""+yard);
						}
						if((match1.equals(s))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
					     mm=km*1000000;;				
						output.setText(""+mm);
						}
						if((match1.equals(s))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());
						cm=km*100000;
						output.setText(""+cm);
						}
						if((match1.equals(s))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
						m=km*1000;				
						output.setText(""+m);
						}
						if((match1.equals(s))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+km);
						}
						if((match1.equals(s))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
					     feet=km*3281;
				    	output.setText(""+feet);

						}
						if((match1.equals(s))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
						inch=km*39370;
				    	output.setText(""+inch);

						}
						if((match1.equals(s))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
						mile=km*0.62;
				    	output.setText(""+mile);
						}
						if((match1.equals(s))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						km=Float.parseFloat(etResult.getText().toString());	
						yard=km*1094;
				    	output.setText(""+yard);
						}
						if((match1.equals(t))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						mm=feet*304.8;				
						output.setText(""+mm);
						}
						if((match1.equals(t))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());
						cm=feet*30.48;
						output.setText(""+cm);
						}
						if((match1.equals(t))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						m=feet*0.3048;				
						output.setText(""+m);
						}
						if((match1.equals(t))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						km=feet*0.000305;
				    	output.setText(""+km);
						}
						if((match1.equals(t))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+feet);

						}
						if((match1.equals(t))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						inch=feet*12;
				    	output.setText(""+inch);

						}
						if((match1.equals(t))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						mile=feet*0.000189;
				    	output.setText(""+mile);
						}
						if((match1.equals(t))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						feet=Float.parseFloat(etResult.getText().toString());	
						yard=feet*0.3333;
				    	output.setText(""+yard);
						}
						if((match1.equals(u))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						mm=inch*25.4;
						output.setText(""+mm);

						}
						if((match1.equals(u))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());
						cm=inch*2.54;
						output.setText(""+cm);
						}
						if((match1.equals(u))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						m=inch*0.0254;				
						output.setText(""+m);
						}
						if((match1.equals(u))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						km=inch*0.000025;
				    	output.setText(""+km);
						}
						if((match1.equals(u))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						feet=inch*0.0833;
				    	output.setText(""+feet);

						}
						if((match1.equals(u))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+inch);

						}
						if((match1.equals(u))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						mile=inch*0.000016;
				    	output.setText(""+mile);

						}
						if((match1.equals(t))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						inch=Float.parseFloat(etResult.getText().toString());	
						yard=inch*0.02778;
				    	output.setText(""+yard);
						}
						
						if((match1.equals(v))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						mm=mile*1609344;
				    	output.setText(""+mm);

						}
						if((match1.equals(v))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());
						cm=mile*160934.44;
						output.setText(""+cm);
						}
						if((match1.equals(v))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						m=mile*1609.344;				
						output.setText(""+m);
						}
						if((match1.equals(v))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						km=mile*1.609344;
				    	output.setText(""+km);
						}
						if((match1.equals(v))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						feet=mile*5280;
				    	output.setText(""+feet);

						}
						if((match1.equals(v))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						inch=mile*63360;
				    	output.setText(""+inch);

						}
						if((match1.equals(v))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+mile);

						}
						if((match1.equals(v))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						mile=Float.parseFloat(etResult.getText().toString());	
						yard=mile*1760;
				    	output.setText(""+yard);

						}
				
						if((match1.equals(w))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());	
						mm=yard*914.4;
				    	output.setText(""+mm);

						}
						if((match1.equals(w))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());
						cm=yard*91.44;
						output.setText(""+cm);
						}
						if((match1.equals(w))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());	
						m=yard*0.914;				
						output.setText(""+m);
						}
						if((match1.equals(w))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
					    yard=Float.parseFloat(etResult.getText().toString());	
						km=yard*0.000914;
				    	output.setText(""+km);
						}
						if((match1.equals(w))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());	
						feet=yard*3;
				    	output.setText(""+feet);

						}
						if((match1.equals(w))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());	
						inch=yard*36;
				    	output.setText(""+inch);

						}
						if((match1.equals(w))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());	
						mile=yard*0.000568;
				    	output.setText(""+mile);

						}
						if((match1.equals(w))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						yard=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+yard);

						}
				
					}
				});
		
	}

}
