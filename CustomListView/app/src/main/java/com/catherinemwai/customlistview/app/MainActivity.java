package com.catherinemwai.customlistview.app;

import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends Activity {

    // get ListView object from the xml
    ListView listView;
    ArrayAdapter<String> Adapter;

    //Array values that are to show in the ListView
    String [] it_companies = {"Squad digital","Simba technology ltd", "BTI Millman", "Ihub", "Ushahidi"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,it_companies);

        //  adapter is assigned to the ListView
       listView.setAdapter(Adapter);



    }



    @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}






}
