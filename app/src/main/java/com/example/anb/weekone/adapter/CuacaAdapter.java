package com.example.anb.weekone.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anb.weekone.R;
import com.example.anb.weekone.entity.Cuaca;

/**
 * Created by Agung Nursatria on 1/20/2018.
 */

public class CuacaAdapter extends ArrayAdapter<Cuaca> {
    private final AppCompatActivity context;
    private final Cuaca[] cuaca;

    public CuacaAdapter(AppCompatActivity context, Cuaca[] cuaca) {
        super(context, R.layout.items, cuaca);
        this.context = context;
        this.cuaca = cuaca;
    }

    //Digunakan ketika pindah ke DetailActivity
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //get layout
        LayoutInflater inflater = context.getLayoutInflater();

        //siapin data
        View rowView = inflater.inflate(R.layout.items, null, true);

        //get obejct layout
        TextView text = (TextView) rowView.findViewById(R.id.text);
        ImageView image = (ImageView) rowView.findViewById(R.id.image);

        //Ganti data di obejct layout
        text.setText(cuaca[position].getTitle());
        image.setBackgroundResource(cuaca[position].getImage());

        return rowView;
    }
}
