package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
	
//	// programmatic layout
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        TextView tv = new TextView(this);
//        tv.setText("Hello, Android");
//        setContentView(tv);
//    }
	
	// XML layout
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	// test debugging w/ NPE
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Object o = null;
//        o.toString();
//        setContentView(R.layout.main);
//    }


}