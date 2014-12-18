package com.ajaybe.helloworldwithactionbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        super.onCreateOptionsMenu(menu); 
        MenuItem add = menu.add(0, 1, 0, "Save"); 
        MenuItem open = menu.add(0, 2, 1, "Open"); 
        MenuItem close = menu.add(0, 3, 2, "Close"); 
        add.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM); 
        open.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM); 
        close.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);         
    	return true;
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
    
    public void gogogo(View view) {
    	Intent intent = new Intent(this, SecondActivity.class);
    	startActivity(intent);
    	finish();
    }
}
