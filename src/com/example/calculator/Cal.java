package com.example.calculator;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;





public class Cal extends Activity {

	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btok,btclear;
	EditText et1,et2,et3;
	RelativeLayout rly;
	long[] a=new long[100];
	long[] b=new long[100];
	long[] p=new long[100];
	long[] d=new long[100];
	long[] u=new long[100];
	long[] x=new long[100];
	long[] y=new long[100];
	
	String s1,s2,temp;
	int i1,i2,j,len,e,i0,i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cal);
		bt1=(Button) findViewById(R.id.bt1);
		et1=(EditText) findViewById(R.id.et1);
		et2=(EditText) findViewById(R.id.et2);
		et3=(EditText) findViewById(R.id.et3);
		bt2=(Button) findViewById(R.id.bt2);
		bt3=(Button) findViewById(R.id.bt3);
		bt4=(Button) findViewById(R.id.bt4);
		bt5=(Button) findViewById(R.id.bt5);
		bt6=(Button) findViewById(R.id.bt6);
		bt7=(Button) findViewById(R.id.bt7);
		bt8=(Button) findViewById(R.id.bt8);
		bt9=(Button) findViewById(R.id.bt9);
		bt0=(Button) findViewById(R.id.bt0);
		btok=(Button) findViewById(R.id.btok);
		btclear=(Button) findViewById(R.id.btclear);
		rly=(RelativeLayout) findViewById(R.id.rly);
		
		rly.setBackgroundColor(Color.BLACK);
		bt0.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View arg0) {

				// TODO Auto-generated method stub
			    if(et1.hasFocus())
			    {
			    	temp=et1.getText().toString();
					et1.setText(temp +"0");
					func();
			    }
			    if(et2.hasFocus())
			    {
			    	temp=et2.getText().toString();
					et2.setText(temp +"0");
					func();
			    }
			}
		});
		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(et1.hasFocus())
			    {
			    	temp=et1.getText().toString();
					et1.setText(temp +"1");
					func();
			    }
			    if(et2.hasFocus())
			    {
			    	temp=et2.getText().toString();
					et2.setText(temp +"1");
					func();
			    }
			}
		});
		bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(et1.hasFocus())
			    {
			    	temp=et1.getText().toString();
					et1.setText(temp +"2");
					func();
			    }
			    if(et2.hasFocus())
			    {
			    	temp=et2.getText().toString();
					et2.setText(temp +"2");
					func();
			    }
			}
		});
bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(et1.hasFocus())
			    {
			    	temp=et1.getText().toString();
					et1.setText(temp +"3");
					func();
			    }
			    if(et2.hasFocus())
			    {
			    	temp=et2.getText().toString();
					et2.setText(temp +"3");
					func();
			    }
			}
		});
bt4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
	    	temp=et1.getText().toString();
			et1.setText(temp +"4");
			func();
	    }
	    if(et2.hasFocus())
	    {
	    	temp=et2.getText().toString();
			et2.setText(temp +"4");
			func();
	    }
	}
});
bt5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
	    	temp=et1.getText().toString();
			et1.setText(temp +"5");
			func();
	    }
	    if(et2.hasFocus())
	    {
	    	temp=et2.getText().toString();
			et2.setText(temp +"5");
			func();
	    }
	}
});
bt6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
	    	temp=et1.getText().toString();
			et1.setText(temp +"6");
			func();
	    }
	    if(et2.hasFocus())
	    {
	    	temp=et2.getText().toString();
			et2.setText(temp +"6");
			func();
	    }
	}
});
bt7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
	    	temp=et1.getText().toString();
			et1.setText(temp +"7");
			func();
	    }
	    if(et2.hasFocus())
	    {
	    	temp=et2.getText().toString();
			et2.setText(temp +"7");
			func();
	    }
	}
});
bt8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
	    	temp=et1.getText().toString();
			et1.setText(temp +"8");
			func();
	    }
	    if(et2.hasFocus())
	    {
	    	temp=et2.getText().toString();
			et2.setText(temp +"8");
			func();
	    }
	}
});
bt9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
	    	temp=et1.getText().toString();
			et1.setText(temp +"9");
			func();
	    }
	    if(et2.hasFocus())
	    {
	    	temp=et2.getText().toString();
			et2.setText(temp +"9");
			func();
	    }
	}
});
btclear.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(et1.hasFocus())
	    {
			et1.setText("");
	    }
	    if(et2.hasFocus())
	    {
			et2.setText("");
			
	    }
	    if(et3.hasFocus())
	    {
			et3.setText("");
			
	    }
	}
});
		btok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
	
		s1=et1.getText().toString();		
		String[] def=new String[100];
		i1=s1.length();					
		s2=et2.getText().toString();			
		i2=s2.length();
	    
	    if(i1==i2)
	    {
	    	len=i1;
	    int v=1;
	    for( j=0;j<i1;j++)
	    {
	    	def[j]=s1.substring(j, j+1);	    				    	
	    	 a[v]=Long.parseLong(def[j]);
	         
	    	 v++;
	    }		
	    					
		
	    v=1;
	    for( j=0;j<i2;j++)
	    {
	    	def[j]=s2.substring(j, j+1);
	    				    	
	    	 b[v]=Long.parseLong(def[j]);
	    	 v++;
	    }
	    }
	    if(i1>i2)
	    {
	    	len=i1;
	    	i0=i1-i2;
	    	int v=1;
		    for( j=0;j<i1;j++)
		    {
		    	def[j]=s1.substring(j, j+1);	    				    	
		    	 a[v]=Long.parseLong(def[j]);
		         
		    	 v++;
		    }
		    
		    					
			
		    
		    v=1+i0;
		    for( j=0;j<i2;j++)
		    {
		    	def[j]=s2.substring(j, j+1);
		    	b[v]=Long.parseLong(def[j]);
		    	
		    	v++;
		    }
		    	
		   int h=i0;
	       for(v=h;v>0;v--)
	    	 b[v]=0;
	    			
		   
	    }
	    if(i2>i1)
	    {
	    	len=i2;
	    	i0=i2-i1;
	    	int v=1;
		    for( j=0;j<i2;j++)
		    {
		    	def[j]=s2.substring(j, j+1);
		    	
		    	 b[v]=Long.parseLong(def[j]);
		         
		    	 v++;
		    }		
		    					
			
		    
		    v=i0+1;
		    for( j=0;j<i1;j++)
		    {
		    	def[j]=s1.substring(j, j+1);  		
		    	a[v]=Long.parseLong(def[j]);
		    	
		    	 v++;		    		 	
		    }
		    
		    int h=i0;
		    for(v=h;v>0;v--)
    			    a[v]=0;
		  
    		
	    	
	    }
	    
	    e=1;
	    int k=1;
	    while(e<=len)
	    {
	    	p[k]=0;
	    	j=e;
	    	for(i=1;i<=e;i++)
	    	{
	    		p[k]=a[i]*b[j]+p[k];
	    		j--;
	    	}
	    	k++;
	    	e++;
	    }
	    e=2;
	    while(e<=len)
	    {
	    	p[k]=0;
	    	i=e;
	    	for(j=len;j>=e;j--)
	    	{
	    		p[k]=a[i]*b[j]+p[k];
	    		i++;
	    	}
	    	k++;
	    	e++;
	    }
	    k=k-1;
	    int z=1;
	    for(int m=2;m<=k;m++)
	    {
	    	d[m]=p[m]%10;
	    	u[z]=p[m]/10;
	    	z++;
	    }
	    d[1]=p[1];
	    u[k]=0;
	    y[k]=0;
	    for(i=k;i>0;i--)
	    {    
	    	x[i]=d[i]+u[i]+y[i];
	    			
	    	y[i-1]=x[i]/10;
	    	 
	    		 if(i!=1)
	    		 {
	    			 x[i]=x[i]%10;
	    		 }
	    	 
	    	
          
	    }
	    String g="";
	    for(i=1;i<=k;i++)
	    {
	    	et3.setText(g+""+x[i]);
	    	g=et3.getText().toString();
	    }
	
			
			
			
			
		}
	});

	}
	protected void func() {

		// TODO Auto-generated method stub
		if (TextUtils.isEmpty(et1.getText().toString())
				 ) {
				 return;
				}
		s1=et1.getText().toString();		
		String[] def=new String[100];
		i1=s1.length();					
		s2=et2.getText().toString();			
		i2=s2.length();
	    
	    if(i1==i2)
	    {
	    	len=i1;
	    int v=1;
	    for( j=0;j<i1;j++)
	    {
	    	def[j]=s1.substring(j, j+1);	    				    	
	    	 a[v]=Long.parseLong(def[j]);
	         
	    	 v++;
	    }		
	    					
		
	    v=1;
	    for( j=0;j<i2;j++)
	    {
	    	def[j]=s2.substring(j, j+1);
	    				    	
	    	 b[v]=Long.parseLong(def[j]);
	    	 v++;
	    }
	    }
	    if(i1>i2)
	    {
	    	len=i1;
	    	i0=i1-i2;
	    	int v=1;
		    for( j=0;j<i1;j++)
		    {
		    	def[j]=s1.substring(j, j+1);	    				    	
		    	 a[v]=Long.parseLong(def[j]);
		         
		    	 v++;
		    }
		    
		    					
			
		    
		    v=1+i0;
		    for( j=0;j<i2;j++)
		    {
		    	def[j]=s2.substring(j, j+1);
		    	b[v]=Long.parseLong(def[j]);
		    	
		    	v++;
		    }
		    	
		   int h=i0;
	       for(v=h;v>0;v--)
	    	 b[v]=0;
	    			
		   
	    }
	    if(i2>i1)
	    {
	    	len=i2;
	    	i0=i2-i1;
	    	int v=1;
		    for( j=0;j<i2;j++)
		    {
		    	def[j]=s2.substring(j, j+1);
		    	
		    	 b[v]=Long.parseLong(def[j]);
		         
		    	 v++;
		    }		
		    					
			
		    
		    v=i0+1;
		    for( j=0;j<i1;j++)
		    {
		    	def[j]=s1.substring(j, j+1);  		
		    	a[v]=Long.parseLong(def[j]);
		    	
		    	 v++;		    		 	
		    }
		    
		    int h=i0;
		    for(v=h;v>0;v--)
    			    a[v]=0;
		  
    		
	    	
	    }
	    
	    e=1;
	    int k=1;
	    while(e<=len)
	    {
	    	p[k]=0;
	    	j=e;
	    	for(i=1;i<=e;i++)
	    	{
	    		p[k]=a[i]*b[j]+p[k];
	    		j--;
	    	}
	    	k++;
	    	e++;
	    }
	    e=2;
	    while(e<=len)
	    {
	    	p[k]=0;
	    	i=e;
	    	for(j=len;j>=e;j--)
	    	{
	    		p[k]=a[i]*b[j]+p[k];
	    		i++;
	    	}
	    	k++;
	    	e++;
	    }
	    k=k-1;
	    int z=1;
	    for(int m=2;m<=k;m++)
	    {
	    	d[m]=p[m]%10;
	    	u[z]=p[m]/10;
	    	z++;
	    }
	    d[1]=p[1];
	    u[k]=0;
	    y[k]=0;
	    for(i=k;i>0;i--)
	    {    
	    	x[i]=d[i]+u[i]+y[i];
	    			
	    	y[i-1]=x[i]/10;
	    	 
	    		 if(i!=1)
	    		 {
	    			 x[i]=x[i]%10;
	    		 }
	    	 
	    	
          
	    }
	    String g="";
	    for(i=1;i<=k;i++)
	    {
	    	et3.setText(g+""+x[i]);
	    	g=et3.getText().toString();
	    }
	}
	
}
