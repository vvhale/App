package com.example.gh;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClick(View v)
	{
	    Intent intent = new Intent(this, Gh2.class);
	    startActivity(intent);
	}
	public void hhh(View v){
		TextView tvHello = (TextView)findViewById(R.id.textView1);
		tvHello.setText("goooo");
	}
}
