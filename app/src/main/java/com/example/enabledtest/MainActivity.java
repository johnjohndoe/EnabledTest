package com.example.enabledtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Some demo usage
		MyLogic logic = new MyLogic();
		logic.init(false);
		logic.isEnabled();
	}
}
