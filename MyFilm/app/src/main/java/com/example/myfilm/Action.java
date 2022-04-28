package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Action extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Jungle Cruise", "Venom: Let There Be Carnage",
                "Free Guy", "F9", "Godzilla vs Kong",
                "BlackWidow", "Morbius", "The Lost City", "The Batman", "Uncharted"

        };

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(itemsAdapter);

    }
}