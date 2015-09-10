package com.catherinemwai.customlistview.app2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List= (ListView)findViewById(R.id.list_item);
    }
      Class SingleRow;{
        String name;
        String descrition;
        int image;

    }
   class MainActivity extends BaseAdapter{

       ArrayList<SingleRow> list;

       String[] name;
       String[] description;
       String[] images;


       //a, b,c, d,e    where a= name, description and image

       @Override
       public int getCount() {
           return 0;
       }

       @Override
       public Object getItem(int position) {
           return null;
       }

       @Override
       public long getItemId(int position) {
           return 0;
       }

       @Override
       public View getView(int position, View convertView, ViewGroup parent) {
           return null;
       }
   }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
