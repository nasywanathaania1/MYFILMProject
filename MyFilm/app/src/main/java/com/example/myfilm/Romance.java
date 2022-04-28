package com.example.myfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Romance extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"The kissing both 3", "Love hard", "Putu Bambu", "Friendzone", "Tall Girl 2", "Cinderella", "He's All that", "Wedding proposal", "Devil on top", "Geez dan Ann"

        };

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(itemsAdapter);
    }
}
