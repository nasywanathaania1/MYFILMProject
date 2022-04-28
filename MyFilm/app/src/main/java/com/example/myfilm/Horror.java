package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Horror extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"The Counjuring 3", "KKN desa Penari", "Scream", "Pengabdi setan 2", "Teluh", "Orphan Fisrt Kill", "The Black Phone", "Halloween ends", "Texas chainsaw", "Salem's Lot", "The black Phone"


        };
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(itemsAdapter);
    }
}