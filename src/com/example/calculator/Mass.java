package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Mass  extends Activity{
	 
	Spinner spinner1,spinner2;
	Button bteql,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnptn,btncl,btnhlp,btntg,btnbck;
	TextView tvCel,tvFar,tvKel;
	EditText etResult,output;
	String match1,match2,a;
	String p,q,r,s,t,u,v;
	
	  
	
	double ton,k,g,m,mc,ounce,pound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mass);
		
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
		
		p="Ton";
		q="kg";
		r="gm";
		s="mg";
		t="mcg";
		u="ounce";
		v="pound";
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
							
						ton=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+ton);
						}
						if((match1.equals(p))&&(match2.equals(q)))
						{
							// read EditText and fill variables with numbers
						ton=Float.parseFloat(etResult.getText().toString());	
						k=ton*100;
						output.setText(""+k);
						
						}
						if((match1.equals(p))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							ton=Float.parseFloat(etResult.getText().toString());
							g=ton*100*10000;
							output.setText(""+g);
							
						}
						if((match1.equals(p))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						ton=Float.parseFloat(etResult.getText().toString());	
						m=ton*100*1000*1000;				
						output.setText(""+m);
						}
						if((match1.equals(p))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						ton=Float.parseFloat(etResult.getText().toString());	
							mc=ton*100*1000*1000*1000;			
						output.setText(""+mc);
						}
						if((match1.equals(p))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						ton=Float.parseFloat(etResult.getText().toString());	
						ounce=ton*35274;
				    	output.setText(""+ounce);

						}
						if((match1.equals(p))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						ton=Float.parseFloat(etResult.getText().toString());	
						pound=ton*2204.6;
				    	output.setText(""+pound);
						}
						if((match1.equals(q))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						ton=k/100;;				
						output.setText(""+ton);
						}
						if((match1.equals(q))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						output.setText(""+k);
						}
						if((match1.equals(q))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						g=k*1000;;				
						output.setText(""+g);
						}
						if((match1.equals(q))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						m=k*1000*1000;
				    	output.setText(""+m);
						}
						if((match1.equals(q))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						mc=k*1000*1000*1000;
				    	output.setText(""+mc);

						}
						if((match1.equals(q))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						ounce=k*35.37;
				    	output.setText(""+ounce);

						}
						if((match1.equals(q))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						pound=k*2.2046;
				    	output.setText(""+pound);
						}
						if((match1.equals(r))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
						ton=g/100000;;				
						output.setText(""+ton);
						}
						if((match1.equals(r))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());
						k=g/1000;
						output.setText(""+k);
						}
						if((match1.equals(r))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+g);
						}
						if((match1.equals(r))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
						m=g*1000;
				    	output.setText(""+m);
						}
						if((match1.equals(r))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
						mc=g*1000*1000;
				    	output.setText(""+mc);

						}
						if((match1.equals(r))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
						ounce=g*0.035273;
				    	output.setText(""+ounce);

						}
						if((match1.equals(r))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
						pound=g*2.2046/1000;
				    	output.setText(""+pound);
						}
						if((match1.equals(s))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						ton=m/100000000;;				
						output.setText(""+ton);
						}
						if((match1.equals(s))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());
						k=m/1000000;
						output.setText(""+k);
						}
						if((match1.equals(s))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						g=m/1000;				
						output.setText(""+g);
						}
						if((match1.equals(s))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+m);
						}
						if((match1.equals(s))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						mc=m*1000;
				    	output.setText(""+mc);

						}
						if((match1.equals(s))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						ounce=m*0.00003527;
				    	output.setText(""+ounce);

						}
						if((match1.equals(s))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						m=Float.parseFloat(etResult.getText().toString());	
						pound=m*2.2046/(10001000);
				    	output.setText(""+pound);
						}
						if((match1.equals(t))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						g=Float.parseFloat(etResult.getText().toString());	
						ton=g/(100000*1000*1000);				
						output.setText(""+ton);
						}
						if((match1.equals(t))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());
						k=mc/(1000*1000*1000);
						output.setText(""+k);
						}
						if((match1.equals(t))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());	
						g=mc/(1000*1000);				
						output.setText(""+g);
						}
						if((match1.equals(t))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());	
						m=mc/1000;
				    	output.setText(""+m);
						}
						if((match1.equals(t))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+mc);

						}
						if((match1.equals(t))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());	
						ounce=mc*0.00003527/1000;
				    	output.setText(""+ounce);

						}
						if((match1.equals(t))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());	
						pound=mc*2.2046/(1000*1000*1000);
				    	output.setText(""+pound);
						}
						if((match1.equals(u))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						ounce=Float.parseFloat(etResult.getText().toString());	
						ton=ounce/35274;
				    	output.setText(""+ton);

						}
						if((match1.equals(u))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						ounce=Float.parseFloat(etResult.getText().toString());
						k=ounce/35.27;
						output.setText(""+k);
						}
						if((match1.equals(u))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						ounce=Float.parseFloat(etResult.getText().toString());	
						g=ounce*28.35;				
						output.setText(""+g);
						}
						if((match1.equals(u))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						ounce=Float.parseFloat(etResult.getText().toString());	
						m=ounce*28349.52;
				    	output.setText(""+m);
						}
						if((match1.equals(u))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						mc=Float.parseFloat(etResult.getText().toString());	
						m=ounce*28349.52*1000;
				    	output.setText(""+mc);

						}
						if((match1.equals(u))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						ounce=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+ounce);

						}
						if((match1.equals(u))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						ounce=Float.parseFloat(etResult.getText().toString());	
						pound=ounce*0.0625;
				    	output.setText(""+pound);

						}
						
						if((match1.equals(v))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());	
						ton=pound*453592.37/(100*1000);
				    	output.setText(""+ton);

						}
						if((match1.equals(v))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());
						k=pound*0.4536;
						output.setText(""+k);
						}
						if((match1.equals(v))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());	
						g=pound*453.6;				
						output.setText(""+g);
						}
						if((match1.equals(v))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());	
						m=pound*453592.37;
				    	output.setText(""+m);
						}
						if((match1.equals(v))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());	
						mc=pound*453592.37*1000;
				    	output.setText(""+mc);

						}
						if((match1.equals(v))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());	
						ounce=pound*16;
				    	output.setText(""+ounce);

						}
						if((match1.equals(v))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						pound=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+pound);

						}
				
				
				
					}
				});
		
	}


}
