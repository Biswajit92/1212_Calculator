package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Area  extends Activity{
	

	Spinner spinner1,spinner2;
	Button bteql,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnptn,btncl,btnhlp,btntg,btnbck;
	TextView tvCel,tvFar,tvKel;
	EditText etResult,output;
	String match1,match2,a;
	String p,q,r,s,t,u,v,w;
	
	  
	
	double cm2,m2,acre,feet2,hectare,inch2,mile2,yard2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.area);
		
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
		
		p="cm2";
		q="m2";
		r="acre";
		s="feet2";
		t="hectare";
		u="inch2";
		v="mile2";
		w="yard2";
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
							
						cm2=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+cm2);
						}
						if((match1.equals(p))&&(match2.equals(q)))
						{
							// read EditText and fill variables with numbers
						cm2=Float.parseFloat(etResult.getText().toString());	
						m2=cm2/10000;
						output.setText(""+m2);
						
						}
						if((match1.equals(p))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							cm2=Float.parseFloat(etResult.getText().toString());
							acre=cm2*2.47/(10000*10000);
							output.setText(""+acre);
							
						}
						if((match1.equals(p))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						cm2=Float.parseFloat(etResult.getText().toString());	
						feet2=cm2*0.0010764;				
						output.setText(""+feet2);
						}
						if((match1.equals(p))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						cm2=Float.parseFloat(etResult.getText().toString());	
					    hectare=cm2/100000000;			
						output.setText(""+hectare);
						}
						if((match1.equals(p))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						cm2=Float.parseFloat(etResult.getText().toString());	
						inch2=cm2*0.155;
				    	output.setText(""+inch2);

						}
						if((match1.equals(p))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						cm2=Float.parseFloat(etResult.getText().toString());	
						mile2=cm2*3.9/(100000*1000000);
				    	output.setText(""+mile2);
						}
						if((match1.equals(p))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						cm2=Float.parseFloat(etResult.getText().toString());	
						yard2=cm2*0.001196;
				    	output.setText(""+yard2);
						}
						if((match1.equals(q))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						cm2=m2*1000;;				
						output.setText(""+cm2);
						}
						if((match1.equals(q))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						output.setText(""+m2);
						}
						if((match1.equals(q))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						acre=m2*0.000247;;				
						output.setText(""+acre);
						}
						if((match1.equals(q))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						feet2=m2*10.764;
				    	output.setText(""+feet2);
						}
						if((match1.equals(q))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						hectare=m2*0.0001;
				    	output.setText(""+hectare);

						}
						if((match1.equals(q))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						inch2=m2*1550;
				    	output.setText(""+inch2);

						}
						if((match1.equals(q))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						mile2=m2*0.00000039;
				    	output.setText(""+mile2);
						}
						if((match1.equals(q))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						m2=Float.parseFloat(etResult.getText().toString());	
						yard2=m2*1.196;
				    	output.setText(""+yard2);
						}
						if((match1.equals(r))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
						cm2=acre*40468730;;				
						output.setText(""+cm2);
						}
						if((match1.equals(r))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());
						m2=acre*4046.873;
						output.setText(""+m2);
						}
						if((match1.equals(r))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+acre);
						}
						if((match1.equals(r))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
						feet2=acre*43560;
				    	output.setText(""+feet2);
						}
						if((match1.equals(r))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
						hectare=acre*0.4046873;
				    	output.setText(""+hectare);

						}
						if((match1.equals(r))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
						inch2=acre*6272640;
				    	output.setText(""+inch2);

						}
						if((match1.equals(r))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
						mile2=acre*0.0015625;
				    	output.setText(""+mile2);
						}
						if((match1.equals(r))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						acre=Float.parseFloat(etResult.getText().toString());	
						yard2=acre*4840;
				    	output.setText(""+yard2);
						}
						if((match1.equals(s))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
					     cm2=feet2*929.0304;;				
						output.setText(""+cm2);
						}
						if((match1.equals(s))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());
						m2=feet2*0.0929;
						output.setText(""+m2);
						}
						if((match1.equals(s))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
						acre=feet2*0.000022957;				
						output.setText(""+acre);
						}
						if((match1.equals(s))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+feet2);
						}
						if((match1.equals(s))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
					     hectare=feet2*0.000009290;
				    	output.setText(""+hectare);

						}
						if((match1.equals(s))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
						inch2=feet2*144;
				    	output.setText(""+inch2);

						}
						if((match1.equals(s))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
						mile2=feet2*0.00000003567;
				    	output.setText(""+mile2);
						}
						if((match1.equals(s))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						feet2=Float.parseFloat(etResult.getText().toString());	
						yard2=feet2*0.1111;
				    	output.setText(""+yard2);
						}
						if((match1.equals(t))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						cm2=hectare*100000000;				
						output.setText(""+cm2);
						}
						if((match1.equals(t))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());
						m2=hectare*10000;
						output.setText(""+m2);
						}
						if((match1.equals(t))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						acre=hectare*2.471;				
						output.setText(""+acre);
						}
						if((match1.equals(t))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						feet2=hectare*107639.11;
				    	output.setText(""+feet2);
						}
						if((match1.equals(t))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+hectare);

						}
						if((match1.equals(t))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						inch2=hectare*15500031;
				    	output.setText(""+inch2);

						}
						if((match1.equals(t))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						mile2=hectare*0.003861;
				    	output.setText(""+mile2);
						}
						if((match1.equals(t))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						hectare=Float.parseFloat(etResult.getText().toString());	
						yard2=hectare*11960;
				    	output.setText(""+yard2);
						}
						if((match1.equals(u))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						cm2=inch2*6.452;
				    	output.setText(""+cm2);

						}
						if((match1.equals(u))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());
						m2=inch2*0.00064516;
						output.setText(""+m2);
						}
						if((match1.equals(u))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						acre=inch2*0.00000016;				
						output.setText(""+acre);
						}
						if((match1.equals(u))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						feet2=inch2*0.006944;
				    	output.setText(""+feet2);
						}
						if((match1.equals(u))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						hectare=inch2/10000000;
				    	output.setText(""+hectare);

						}
						if((match1.equals(u))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+inch2);

						}
						if((match1.equals(u))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						mile2=inch2*0.02/100000000;
				    	output.setText(""+mile2);

						}
						if((match1.equals(t))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						inch2=Float.parseFloat(etResult.getText().toString());	
						yard2=inch2*0.000772;
				    	output.setText(""+yard2);
						}
						
						if((match1.equals(v))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						cm2=mile2*2589988*10000;
				    	output.setText(""+cm2);

						}
						if((match1.equals(v))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());
						m2=mile2*2589988;
						output.setText(""+m2);
						}
						if((match1.equals(v))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						acre=mile2*640;				
						output.setText(""+acre);
						}
						if((match1.equals(v))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						feet2=mile2*27878400;
				    	output.setText(""+feet2);
						}
						if((match1.equals(v))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						hectare=mile2*258.9988;
				    	output.setText(""+hectare);

						}
						if((match1.equals(v))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						inch2=mile2*401449600;
				    	output.setText(""+inch2);

						}
						if((match1.equals(v))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+mile2);

						}
						if((match1.equals(v))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						mile2=Float.parseFloat(etResult.getText().toString());	
						yard2=mile2*3097600;
				    	output.setText(""+yard2);

						}
				
						if((match1.equals(w))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());	
						cm2=yard2*8361.27;
				    	output.setText(""+cm2);

						}
						if((match1.equals(w))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());
						m2=yard2*0.8361;
						output.setText(""+m2);
						}
						if((match1.equals(w))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());	
						acre=yard2*0.0002066;				
						output.setText(""+acre);
						}
						if((match1.equals(w))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
					    yard2=Float.parseFloat(etResult.getText().toString());	
						feet2=yard2*9;
				    	output.setText(""+feet2);
						}
						if((match1.equals(w))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());	
						hectare=yard2*0.0000836;
				    	output.setText(""+hectare);

						}
						if((match1.equals(w))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());	
						inch2=yard2*1296;
				    	output.setText(""+inch2);

						}
						if((match1.equals(w))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());	
						yard2=mile2*0.0000003228;
				    	output.setText(""+mile2);

						}
						if((match1.equals(w))&&(match2.equals(w)))
						{
							
							// read EditText and fill variables with numbers
							
						yard2=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+yard2);

						}
				
					}
				});
		
	}
}
