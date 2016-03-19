package com.example.xps.bokkislistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView LV = (ListView) findViewById(R.id.bokki_listview);
        String[] A = {"Image Placeholder", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "kfaya kda..",};
        BokkiListAdapter BAdapter = new BokkiListAdapter(MainActivity.this, A);
        LV.setAdapter(BAdapter);

    }
}
