package com.example.kln_toast;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity 
{
	Button b1;
	TextView t1;
	EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button1);
        t1=(TextView) findViewById(R.id.textView1);
        e1=(EditText) findViewById(R.id.editText1);
        b1.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stubt
				t1.setText(e1.getText().toString());
				Toast.makeText(getApplicationContext(), "Welcome to Android", Toast.LENGTH_LONG).show();
			}
		});
    }
    
}
