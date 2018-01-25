package com.example.anb.weekone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.anb.weekone.adapter.CuacaAdapter;
import com.example.anb.weekone.entity.Cuaca;

public class MainActivity extends AppCompatActivity {
    private ListView listVIew;
    private Cuaca[] cuaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi nilai cuaca
        initData();

        CuacaAdapter adapter = new CuacaAdapter(MainActivity.this, cuaca);

        listVIew = (ListView) findViewById(R.id.listView);

        // Mengeluarkan data ke list
        listVIew.setAdapter(adapter);

        //Trigger ketika row data diclick
        listVIew.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("image", cuaca[position].getImage());
                intent.putExtra("title", cuaca[position].getTitle());
                intent.putExtra("text", cuaca[position].getText());
                startActivity(intent);
            }
        });
    }

    private void initData() {
        cuaca = new Cuaca[]{
                new Cuaca(R.drawable.art_clear, "Cerah", "Saat ini cuaca sedang cerah"),
                new Cuaca(R.drawable.art_light_clouds, "Berawam", "Saat ini cuaca sedang berawan"),
                new Cuaca(R.drawable.art_clouds, "Mendung", "Saat ini cuaca sedang mendung"),
                new Cuaca(R.drawable.art_light_rain, "Hujan", "Saat ini cuaca sedang hujan")
        };
    }
}
