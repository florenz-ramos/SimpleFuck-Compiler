package com.calyx.dev.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.*;
import java.util.regex.*;
import android.widget.Button;
import android.view.View.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.support.design.widget.FloatingActionButton;

public class MainActivity extends AppCompatActivity 
{
	private EditText code;
	public static String resultCode;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		code=(EditText)findViewById(R.id.code);
		String helloWorld="++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++.+++++++..+++.-------------------------------------------------------------------.+++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++.+++.------.--------.-------------------------------------------------------------------.";
		code.setText(helloWorld);	
    }

	@Override
	public void onBackPressed()
	{
		// TODO: Implement this method
		super.onBackPressed();
		this.finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.mymenu, menu);
		return super.onCreateOptionsMenu(menu);
	}

// handle button activities
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

		if (id == R.id.mybutton) {
			resultCode="";
			Compiler compiler=new Compiler(code.getText().toString());
			resultCode = compiler.Compile();
			Intent i=new Intent(getApplicationContext(),ResultActivity.class);
			startActivity(i);
			
			
			
		}
		return super.onOptionsItemSelected(item);
	}
	
}
