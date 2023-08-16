package com.example.kln_ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity 
{

	Button b1;
	CheckBox cb1,cb2;
	RadioGroup rg1;
	RadioButton rb1;
	Spinner spnr;
	RatingBar ratb;
	ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button1);
        cb1=(CheckBox) findViewById(R.id.checkBox1);
        cb2=(CheckBox) findViewById(R.id.checkBox2);
        rg1=(RadioGroup) findViewById(R.id.radioGroup1);
        spnr=(Spinner) findViewById(R.id.spinner1);
        ratb=(RatingBar) findViewById(R.id.ratingBar1);
        pb=(ProgressBar) findViewById(R.id.progressBar1);
        
        b1.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0)
			{
				String msg="";
				if(cb1.isChecked())
				{
					msg=msg+cb1.getText().toString()+",";
				}
				if(cb2.isChecked())
				{
					msg=msg+cb2.getText().toString()+",";
				}
				int rid=rg1.getCheckedRadioButtonId();
				rb1=(RadioButton) findViewById(rid);
				msg=msg+rb1.getText().toString()+",";
				msg=msg+spnr.getSelectedItem().toString()+",";
				msg=msg+ratb.getRating()+",";
				msg=msg+pb.getProgress();
				Toast.makeText(getApplicationContext(), msg,Toast.LENGTH_LONG).show();
				
				
			}
		});
    }
    

   
}
