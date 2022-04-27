package com.example.aplikasilistwisatasemarang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataSemarang extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_semarang);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Lawang Sewu", "Kota Lama", "Bukit Cinta Rawa Pening", "Eling Bening", "Saloka Theme Park", "Candi Gedung Songo", "Merbabu View", "Dusun Semilir",
                                        "Cimory On The Valley", "Taman Bunga Celosia", "Argo Wisata Kopeng"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), lawangsewu.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), KotaLama.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), bukitcinta.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), elingbening.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), saloka.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), candigedungsongo.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), merbabuview.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), dusunsemilir.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), cimory.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), celosia.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), argowisata.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}