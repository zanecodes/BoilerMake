package edu.rosehulman;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Teachers extends MainActivity {
	private DrawerLayout drawerLayout;
	private ActionBarDrawerToggle drawerToggle;
	
	 public class Teacher extends Activity {
        ListView listView ;
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.teachers);
            
            // Get ListView object from xml
            listView = (ListView)findViewById(R.layout.teachers);
            
            // Defined Array values to show in ListView
            String[] values = new String[] { "Android List View", 
                                             "Adapter implementation",
                                             "Simple List View In Android",
                                             "Create List View Android", 
                                             "Android Example", 
                                             "List View Source Code", 
                                             "List View Array Adapter", 
                                             "Android Example List View" 
                                            };
    
            // Define a new Adapter
            // First parameter - Context
            // Second parameter - Layout for the row
            // Third parameter - ID of the TextView to which the data is written
            // Forth - the Array of data
    
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
              android.R.layout.simple_list_item_1, android.R.id.text1, values);
    
    
            // Assign adapter to ListView
            listView.setAdapter(adapter); 
            
            // ListView Item Click Listener
            listView.setOnItemClickListener(new OnItemClickListener() {
 
                  @Override
				public void onItemClick(AdapterView<?> parent, View view,
                     int position, long id) {
                    
                   // ListView Clicked item index
                   int itemPosition     = position;
                   
                   // ListView Clicked item value
                   String  itemValue    = (String) listView.getItemAtPosition(position);
                      
                    // Show Alert 
                    Toast.makeText(getApplicationContext(),
                      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                      .show();
                 
                  }
    
             }); 
        }
    
    }
	
}