package com.example.calculator;


import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends Activity {

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bok,bpls,btclear;
	EditText et1,et2;
	String str,str1="";
	TextView tv1;
	float temp;
	  int n=0;
	 String[] st=new String[10];
	int[] a=new int[10];
	int[] s=new int[10];
	int i,j,c,sum=0,p,flag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		b2 =(Button) findViewById(R.id.bt2);
        b3 =(Button) findViewById(R.id.bt3);
        b4 =(Button) findViewById(R.id.bt4);
        b5 =(Button) findViewById(R.id.bt5);
        b6 =(Button) findViewById(R.id.bt6);
        b7 =(Button) findViewById(R.id.bt7);
        b8 =(Button) findViewById(R.id.bt8);
        b9 =(Button) findViewById(R.id.bt9);
        b0 =(Button) findViewById(R.id.bt0);
        b1=(Button) findViewById(R.id.bt1);
        bok=(Button) findViewById(R.id.btok);
        et1=(EditText) findViewById(R.id.etinput);
        et2=(EditText) findViewById(R.id.etoutput);
        bpls=(Button) findViewById(R.id.btpls);
        btclear=(Button) findViewById(R.id.btclear);
        tv1=(TextView) findViewById(R.id.tv1);
        
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				str=et1.getText().toString();
				et1.setText(str+"1");
				
			}
		});
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				str=et1.getText().toString();
				et1.setText(str+"2");
				
			}
		});
b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"3");
		
	}
});
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"4");
		
	}
});
b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"5");
		
	}
});
b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"6");
		
	}
});
b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"7");
		
	}
});
b8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"8");
		
	}
});
b9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		str=et1.getText().toString();
		et1.setText(str+"9");
		
	}
});
b0.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		str=et1.getText().toString();
		et1.setText(str+"0");
		
	}
});
bpls.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		if (TextUtils.isEmpty(et1.getText().toString())
				 ) {
				 return;
				}
		if(n<5)
		{
			st[n]=et1.getText().toString();
			str=et1.getText().toString();
			str1=str1+str;
			str1=str1+"+";
			
			et1.setText("");
			n++;
		}
		else
			return;
		tv1.setText(str1);
	}
});
btclear.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		sum=0;
		str="";
		str1="";
		tv1.setText("");
		if(et1.hasFocus())
		{
			et1.setText("");
		}
		if(et2.hasFocus())
		{
			et2.setText("");
		}
		
	}
});
bok.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		if (TextUtils.isEmpty(et1.getText().toString())
				 ) {
				 return;
				}
		
	    str=et1.getText().toString();
	    str1=str1+str;
		tv1.setText(str1);
		
		
			st[n]=et1.getText().toString();
		
		for(i=0;i<=n;i++)
		{
		   a[i]=Integer.parseInt(st[i]);
		        
		
			if(a[i]!=0)
			{			
				for(j=0;j<=st[i].length()+1;j++)
				{
					s[j]=s[j]+(a[i]%10)+c;
					c=0;
					a[i]=a[i]/10;
					if(s[j]>=10)
					{
						s[j]=s[j]-10;
						c=c+1;
					}
				}
				st[i]="0";
			}		
			else
				continue;
		}
		for(j=0;j<10;j++)
		{
			if(j==0)
				p=1;
			else
				p=p*10;
			
			sum=sum+(p*s[j]);
			s[j]=0;
		}
		et2.setText(""+sum);
		n=0;
				
	}

	
	
});
	}

}
