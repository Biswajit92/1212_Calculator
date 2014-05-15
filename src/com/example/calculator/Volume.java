package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Volume  extends Activity{
	
	Spinner spinner1,spinner2;
	Button bteql,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnptn,btncl,btnhlp,btntg,btnbck;
	TextView tvCel,tvFar,tvKel;
	EditText etResult,output;
	String match1,match2,a;
	String p,q,r,s,t,u,v;
	
	  
	
	double c3,m3,f3,g3,i3,l3,y3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.volume);
		
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
		
		p="cm3";
		q="m3";
		r="feet3";
		s="gallon(uk)";
		t="inch3";
		u="litre";
		v="yard3";
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
							
						c3=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+c3);
						}
						if((match1.equals(p))&&(match2.equals(q)))
						{
							// read EditText and fill variables with numbers
						c3=Float.parseFloat(etResult.getText().toString());	
						m3=c3/1000000;
						output.setText(""+m3);
						
						}
						if((match1.equals(p))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							c3=Float.parseFloat(etResult.getText().toString());
							f3=c3*0.00003532;
							output.setText(""+f3);
							
						}
						if((match1.equals(p))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						c3=Float.parseFloat(etResult.getText().toString());	
						g3=c3*0.00022;				
						output.setText(""+g3);
						}
						if((match1.equals(p))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						c3=Float.parseFloat(etResult.getText().toString());	
							i3=c3*0.061024;			
						output.setText(""+i3);
						}
						if((match1.equals(p))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						c3=Float.parseFloat(etResult.getText().toString());	
						l3=c3*0.001;
				    	output.setText(""+l3);

						}
						if((match1.equals(p))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						c3=Float.parseFloat(etResult.getText().toString());	
						y3=c3*0.0000013;
				    	output.setText(""+y3);
						}
						if((match1.equals(q))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						c3=m3*1000000;;				
						output.setText(""+c3);
						}
						if((match1.equals(q))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						output.setText(""+m3);
						}
						if((match1.equals(q))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						f3=m3*35.32;;				
						output.setText(""+f3);
						}
						if((match1.equals(q))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						g3=m3*220;
				    	output.setText(""+g3);
						}
						if((match1.equals(q))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						i3=m3*61024;
				    	output.setText(""+i3);

						}
						if((match1.equals(q))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						l3=m3*1000;
				    	output.setText(""+l3);

						}
						if((match1.equals(q))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						m3=Float.parseFloat(etResult.getText().toString());	
						y3=m3*1.3308;
				    	output.setText(""+y3);
						}
						if((match1.equals(r))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());	
						c3=f3*28317;;				
						output.setText(""+c3);
						}
						if((match1.equals(r))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());
						m3=f3*0.028317;
						output.setText(""+m3);
						}
						if((match1.equals(r))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+f3);
						}
						if((match1.equals(r))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());	
						g3=f3*6.23;
				    	output.setText(""+g3);
						}
						if((match1.equals(r))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());	
						i3=f3*1728;
				    	output.setText(""+i3);

						}
						if((match1.equals(r))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());	
						l3=f3*28.317;
				    	output.setText(""+l3);

						}
						if((match1.equals(r))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						f3=Float.parseFloat(etResult.getText().toString());	
						y3=f3*0.037037;
				    	output.setText(""+y3);
						}
						if((match1.equals(s))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());	
						c3=g3*4546;;				
						output.setText(""+c3);
						}
						if((match1.equals(s))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());
						m3=g3*0.004546;
						output.setText(""+m3);
						}
						if((match1.equals(s))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());	
						f3=g3*0.1605;				
						output.setText(""+f3);
						}
						if((match1.equals(s))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+g3);
						}
						if((match1.equals(s))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());	
						i3=g3*277.42;
				    	output.setText(""+i3);

						}
						if((match1.equals(s))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());	
						l3=g3*4.546;
				    	output.setText(""+l3);

						}
						if((match1.equals(s))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						g3=Float.parseFloat(etResult.getText().toString());	
						y3=g3*0.005946;
				    	output.setText(""+y3);
						}
						if((match1.equals(t))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());	
						c3=i3*16;				
						output.setText(""+c3);
						}
						if((match1.equals(t))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());
						m3=i3*0.000016;
						output.setText(""+m3);
						}
						if((match1.equals(t))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());	
						f3=i3*0.000579;				
						output.setText(""+f3);
						}
						if((match1.equals(t))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());	
						g3=i3*0.003605;
				    	output.setText(""+g3);
						}
						if((match1.equals(t))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+i3);

						}
						if((match1.equals(t))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());	
						l3=i3*0.016;
				    	output.setText(""+l3);

						}
						if((match1.equals(t))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						i3=Float.parseFloat(etResult.getText().toString());	
						y3=i3*0.000021;
				    	output.setText(""+y3);
						}
						if((match1.equals(u))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());	
						c3=l3*1000;
				    	output.setText(""+c3);

						}
						if((match1.equals(u))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());
						m3=l3/1000;
						output.setText(""+m3);
						}
						if((match1.equals(u))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());	
						f3=l3*0.03532;				
						output.setText(""+f3);
						}
						if((match1.equals(u))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());	
						g3=l3*0.22;
				    	output.setText(""+g3);
						}
						if((match1.equals(u))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());	
						i3=l3*61.0244;
				    	output.setText(""+i3);

						}
						if((match1.equals(u))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+l3);

						}
						if((match1.equals(u))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						l3=Float.parseFloat(etResult.getText().toString());	
						y3=l3*0.001308;
				    	output.setText(""+y3);

						}
						
						if((match1.equals(v))&&(match2.equals(p)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());	
						c3=y3*764555;
				    	output.setText(""+c3);

						}
						if((match1.equals(v))&&(match2.equals(q)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());
						m3=y3*0.764555;
						output.setText(""+m3);
						}
						if((match1.equals(v))&&(match2.equals(r)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());	
						f3=y3*27;				
						output.setText(""+f3);
						}
						if((match1.equals(v))&&(match2.equals(s)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());	
						g3=y3*168.17;
				    	output.setText(""+g3);
						}
						if((match1.equals(v))&&(match2.equals(t)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());	
						i3=y3*46656;
				    	output.setText(""+i3);

						}
						if((match1.equals(v))&&(match2.equals(u)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());	
						l3=y3*764.556;
				    	output.setText(""+l3);

						}
						if((match1.equals(v))&&(match2.equals(v)))
						{
							
							// read EditText and fill variables with numbers
							
						y3=Float.parseFloat(etResult.getText().toString());	
						
				    	output.setText(""+y3);

						}
				
				
				
					}
				});
		
	}

}
