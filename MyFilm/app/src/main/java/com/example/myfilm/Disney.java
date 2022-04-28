package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Disney extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disney);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Turning Red", "The ice age adventure", "Lightyear", "Monster university", "Cinderella", "Snow white", "Inside out", "Inside out 2", "bos babby"

        };

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(itemsAdapter);
    }
}