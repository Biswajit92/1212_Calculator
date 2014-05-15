package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Scientific extends Activity {
	public String str="";
	Character op='q';
	double nm,num,numtemp,rm,ans,am,pm,gm,tm,sm;
	int i,c=0;
	int shift;
	EditText showresult;
	ImageView shiftSymbol;
	Button btnSin,btnCos,btnTan,btnLog,btnSquare,btnCube,btnComb,btnRoot,btnSqt;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scientific_calculator);
	
	showresult=(EditText)findViewById(R.id.result_id);
	shiftSymbol = (ImageView) findViewById(R.id.shiftImage);
	shiftSymbol.setVisibility(12);
	shift=0;
	
	}
	
	
	public void btn1Clicked(View v)
	{
		insert(1);
	}
	
	public void btn2Clicked(View v)
	{
		insert(2);
	}
	
	public void btn3Clicked(View v)
	{
		insert(3);
	}
	
	public void btn4Clicked(View v)
	{
		insert(4);
	}
	
	public void btn5Clicked(View v)
	{
		insert(5);
	}
	
	public void btn6Clicked(View v)
	{
		insert(6);
	}
	
	public void btn7Clicked(View v)
	{
		insert(7);
	}
	
	public void btn8Clicked(View v)
	{
		insert(8);
	}
	
	public void btn9Clicked(View v)
	{
		insert(9);
	}
	
	public void btn0Clicked(View v)
	{
		insert(0);
	}
	
	public void btnplusClicked(View v)
	{
		perform();
		op='+';
	}
	
	public void btnminusClicked(View v)
	{
		perform();
		op='-';
	}
	
	public void btndivideClicked(View v)
	{
		perform();
		op='/';
	}
	
	public void btnmultClicked(View v)
	{
		perform();
		op='*';
	}
	
	public void btnsinClicked(View v)
	{
		disableShift();
		perform();
		op='~';
	}
	
	public void btncosClicked(View v)
	{
		disableShift();
		perform();
		op='#';
	}
	
	public void btntanClicked(View v)
	{
		disableShift();
		perform();
		op='$';
	}
	
	public void btnlogClicked(View v)
	{
		disableShift();
		perform();
		op='&';
	}
	
	public void btnpowerClicked(View v)
	{
		disableShift();
		perform();
		op='^';
	}
	
	public void btnmodClicked(View v)
	{
		disableShift();
		perform();
		op='%';
	}
	
	public void btnperClicked(View v)
	{
		
	    perform();
		op='.';
	}
	
	public void btnfactClicked(View v)
	{
		perform();
		op='!';
	}
	
	public void btnpermutClicked(View v)
	{
		disableShift();
		perform();
		op='?';
	}
	
	public void btnshiftClicked(View v)
	{
		btnSin = (Button) findViewById(R.id.Btnsin_id);
		btnCos = (Button) findViewById(R.id.Btncos_id);
		btnTan = (Button) findViewById(R.id.Btntan_id);
		btnLog = (Button) findViewById(R.id.Btnlog_id);
		btnSquare = (Button) findViewById(R.id.Btnpower_id);
		btnCube = (Button) findViewById(R.id.Btnmod_id);
		btnComb = (Button) findViewById(R.id.Btnpermut_id);
		btnSqt = (Button) findViewById(R.id.Btnsqrt_id);
		if(shift == 0)
		{
			shiftSymbol.setVisibility(0);
			shift = 1;
			btnSin.setText("sinˉ¹");
			btnCos.setText("cosˉ¹");
			btnTan.setText("tanˉ¹");
			btnSquare.setText("x²");
			btnLog.setText("eʸ");
			btnCube.setText("x³");
			btnComb.setText("nPr");
			btnSqt.setText("×√y");   
			
		}
		else
		{
			disableShift();
			shift = 0;
		}
	}
	
	public void disableShift()
	{
		btnSin = (Button) findViewById(R.id.Btnsin_id);
		btnCos = (Button) findViewById(R.id.Btncos_id);
		btnTan = (Button) findViewById(R.id.Btntan_id);
		btnLog = (Button) findViewById(R.id.Btnlog_id);
		btnSquare = (Button) findViewById(R.id.Btnpower_id);
		btnCube = (Button) findViewById(R.id.Btnmod_id);
		btnComb = (Button) findViewById(R.id.Btnpermut_id);
		btnSqt = (Button) findViewById(R.id.Btnsqrt_id);
		shiftSymbol.setVisibility(12);
		btnSin.setText("sin");
		btnCos.setText("cos");
		btnTan.setText("tan");
		btnLog.setText("log");
		btnSquare.setText("^");
		btnCube.setText("mod");
		btnComb.setText("nCr");
		btnSqt.setText("sqrt");
	}
	
	public void btnsqrtClicked(View v)
	{
		disableShift();
		perform();
		op='@';
	}
	
	
	public void btnequalClicked(View v)
	{
		calculate();
	}
	
	public void btnclearClicked(View v)
	{
		reset();
	}
	
	public void reset()
	{
		str="";
		op='q';
		num=0.0;
		nm=0;
		numtemp=0.0;
		showresult.setText("");
	}
	
	public void insert(int j)
	{
		str=str+Integer.toString(j);
		num=Integer.valueOf(str).intValue();
		showresult.setText(str);
	}
	
	public void perform()
	{
		str="";
		numtemp=num;
	}
	
	public void calculate()
	{
		if(op=='+')
			num=numtemp+num;
		else if (op=='`')
		    {
				if (c==0)
					c=1;
				//c=0;
		    }
		else if (op=='~')	
		    {
				if (shift==0)
		            num=Math.sin(Math.toRadians(numtemp));
				else
				{
					ans=num;
					num=Math.toDegrees(Math.asin(numtemp));
					shift=0;
					shiftSymbol.setVisibility(12);
				}
		    }
		else if (op=='-')
			num=numtemp-num;
		else if (op=='#')
		    {
				if (shift==0)
					num=Math.cos(Math.toRadians(numtemp));
				else
				{
					ans=num;
					num=Math.toDegrees(Math.acos(numtemp));
					shift=0;
					shiftSymbol.setVisibility(12);
				}
		    }
		else if (op=='$')
	    {
			if (shift==0)
				num=Math.tan(Math.toRadians(numtemp));
			else
			{
				ans=num;
				num=Math.toDegrees(Math.atan(numtemp));
				shift=0;
				shiftSymbol.setVisibility(12);
			}
	    }
		else if (op=='/')
			num=numtemp/num;
		else if (op=='&')
		{
			if (shift==0)
				num=Math.log10(numtemp);
			else
			{
				num=nm= 2.718;
				for(i=1;i<numtemp;i++)
				num=nm*num;
				shift=0;
				shiftSymbol.setVisibility(12);
				//num=numtemp;
			}
		}
		else if (op=='*')
			num=numtemp*num;
		else if (op=='^')
		{
			if (shift==0)
			{
				nm=numtemp;
			for(i=1;i<num;i++)
				numtemp=nm*numtemp;
			num=numtemp;
			}
			else
			{
				num= num*num;
				shift=0;
				shiftSymbol.setVisibility(12);
			}
		}
		else if (op=='%')
		{
			if(shift==0)
			{
			 nm= ((int)(numtemp/num));
			 rm= numtemp/num;
			 double n= rm-nm;
			 num=((int)(n*num));
			}
			else
			{
				num=num*num*num;
				shift=0;
				shiftSymbol.setVisibility(12);
			}
			
		}
		
		else if (op=='!')
		{
			rm=1;
			for(nm=1;nm<=num;nm++)
				rm=rm*nm;
			num=rm;
		}
		
		else if (op=='?')
		{
			if(shift==0)
			{
			rm=1;
			sm= numtemp-num;
			for(nm=1;nm<=numtemp;nm++)
				rm=rm*nm;
			pm=rm;
			rm=1;
			for(nm=1;nm<=num;nm++)
				rm=rm*nm;
			gm=rm;
			rm=1;
			for(nm=1;nm<=sm;nm++)
				rm=rm*nm;
			am=rm;
			tm=am*gm;
			num= pm/tm;
			}
			else
			{
				rm=1;
				sm= numtemp-num;
				for(nm=1;nm<=numtemp;nm++)
					rm=rm*nm;
				pm=rm;
				rm=1;
				for(nm=1;nm<=sm;nm++)
					rm=rm*nm;
				am=rm;
				num= pm/am;
			}
		}
		

		else if (op=='@')
		{

			if (shift==0)   ///////// <-- Here /////////**************
			{///////// <-- Here /////////**************
				num=(numtemp/2);  ///////// <-- Here /////////**************
				do           ///////// <-- Here /////////**************
				{
					nm=num;     ///////// <-- Here /////////**************
					rm=nm+(numtemp/nm);   ///////// <-- Here /////////**************
					num=rm/2;    ///////// <-- Here /////////**************
				}
				while ((nm-num)!=0);    ///////// <-- Here /////////**************
			}
			else
			{
				ans=num;
				shift=0;
				num=Math.pow(num, 1.0/numtemp);   ///////// <-- Here /////////**************
			}						
		}
		else if (op=='.')
			num=numtemp*(num/100.0);
			
		showresult.setText(""+num);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
