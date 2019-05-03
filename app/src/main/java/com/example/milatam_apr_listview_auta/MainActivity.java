package com.example.milatam_apr_listview_auta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] cars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        cars = initData();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cars);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Cena " + getPrice(position) + " Kč", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private String[] initData()
    {
        return new String[] {"Audi", "Bmw", "Škoda", "Mercedes", "Tesla", "Toyota", "Mazda", "Honda"};
    }

    private int getPrice(int id)
    {
        int price = 0;
        switch (id)
        {
            case 0:
                price = 1250000;
                break;
            case 1:
                price = 1220000;
                break;
            case 2:
                price = 750000;
                break;
            case 3:
                price = 2235000;
                break;
            case 4:
                price = 25000000;
                break;
            case 5:
                price = 8800000;
                break;
            case 6:
                price = 87600000;
                break;
            case 7:
                price = 92400000;
                break;
        }

        return price;
    }
}
