package com.example.contactlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private PeopleAdapter pAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.people_list);
        ArrayList<People> peopleList = new ArrayList<>();
        peopleList.add(new People(R.drawable.chuck_norris_v1, "Chuck Norris",
                "chuckie@gmail", "111222333"));
        peopleList.add(new People(R.drawable.jackie_chan_v1, "Jackie Chan",
                "jackie@gmail", "444555666"));
        peopleList.add(new People(R.drawable.steven_seagal_v1, "Steven Seagal",
                "steven@gmail", "777888999"));
        pAdapter = new PeopleAdapter(this, peopleList);
        listView.setAdapter(pAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(position == 0) {
                            Toast.makeText(getApplicationContext(), "You choice Chuck Norris", Toast.LENGTH_LONG).show();
                        } else if (position == 1) {
                            Toast.makeText(getApplicationContext(), "You choice Jackie Chan", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "You choice Steven Seagal", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
    }
}
