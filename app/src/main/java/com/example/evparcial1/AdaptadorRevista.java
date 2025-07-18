package com.example.evparcial1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorRevista extends ArrayAdapter<Revista> {

    private static final String URL_BASE_IMAGENES = "https://uteq.edu.ec/assets/images/newspapers/";

    public AdaptadorRevista(Context context, ArrayList<Revista> datos) {
        super(context, R.layout.item, datos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item, null);

        Revista revista = getItem(position);

        TextView tvAnio = (TextView) item.findViewById(R.id.tvAnio);
        tvAnio.setText(revista.getAño());

        TextView tvMes = (TextView) item.findViewById(R.id.tvMes);
        tvMes.setText(revista.getMes());

        TextView tvUrl = (TextView) item.findViewById(R.id.tvUrl);
        tvUrl.setText(revista.getUrl());

        ImageView imageView = (ImageView) item.findViewById(R.id.imgRevista);


        String urlCompleta = URL_BASE_IMAGENES + revista.getImagen();

        Glide.with(getContext())
                .load(urlCompleta)
                .into(imageView);

        return item;
    }
}
