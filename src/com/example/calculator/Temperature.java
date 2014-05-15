package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Temperature  extends Activity{

	Spinner spinner1,spinner2;
	Button bteql,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnptn,btncl,btnhlp,btntg,btnbck;
	TextView tvCel,tvFar,tvKel;
	EditText etResult,output;
	String match1,match2,a;
	String x,y,z;
	
	  
	
	double c,f,k,d;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.temperature);
		
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
		
		x="Cel";
		y="Far";
		z="Kel";
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
						
						if((match1.equals(x))&&(match2.equals(x)))
						{
							

							// read EditText and fill variables with numbers
							
						c=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+c);
						}
						if((match1.equals(x))&&(match2.equals(y)))
						{
							// read EditText and fill variables with numbers
						c=Float.parseFloat(etResult.getText().toString());	
						f=(c*1.8)+32;
						
						k=c-273;
						output.setText(""+f);
						
						}
						if((match1.equals(x))&&(match2.equals(z)))
						{
							
							// read EditText and fill variables with numbers
							c=Float.parseFloat(etResult.getText().toString());
							k=c+273;
							output.setText(""+k);
							
						}
						if((match1.equals(y))&&(match2.equals(x)))
						{
							
							// read EditText and fill variables with numbers
							
						f=Float.parseFloat(etResult.getText().toString());	
						c=(f*0.56)+3.56;				
						output.setText(""+c);
						}
						if((match1.equals(y))&&(match2.equals(y)))
						{
							
							// read EditText and fill variables with numbers
							
						f=Float.parseFloat(etResult.getText().toString());	
										
						output.setText(""+f);
						}
						if((match1.equals(y))&&(match2.equals(z)))
						{
							
							// read EditText and fill variables with numbers
							
						f=Float.parseFloat(etResult.getText().toString());	
						k=0.56*f+255;				
						output.setText(""+k);
						}
						if((match1.equals(z))&&(match2.equals(x)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						c=k-273;				
						output.setText(""+c);
						}
						if((match1.equals(z))&&(match2.equals(y)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
						f=1.78*k+455;				
						output.setText(""+f);
						}
						if((match1.equals(z))&&(match2.equals(y)))
						{
							
							// read EditText and fill variables with numbers
							
						k=Float.parseFloat(etResult.getText().toString());	
				    	output.setText(""+k);
						}
				
					}
				});
		
	}

	
	
}
