package com.calyx.dev.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.*;
import android.widget.*;

public class ResultActivity extends AppCompatActivity 
{
	TextView result;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
		result=(TextView)findViewById(R.id.result_output);
		result.setText("\t"+MainActivity.resultCode);
    }
	
	
}
