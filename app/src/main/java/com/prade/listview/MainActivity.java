package com.prade.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] designPatterns;
    private String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listView  = (ListView) findViewById(R.id.listView1);

        //create the arrays
        this.designPatterns = getResources().getStringArray(R.array.design_patterns);
        this.descriptions = getResources().getStringArray(R.array.design_patterns_description);

        ArrayAdapter<String> adapterValue = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1,designPatterns );
        listView.setAdapter(adapterValue);

        // Set item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String description = descriptions[position];
               // String tap = designPatterns.get[position];
                Toast.makeText(MainActivity.this, description, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
