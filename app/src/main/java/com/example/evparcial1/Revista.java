package com.example.evparcial1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Revista {

    private String año;
    private String mes;
    private String url;
    private String imagen;

    public Revista(JSONObject a) throws JSONException {
        año = a.getString("anio");
        mes = a.getString("mes");
        url = a.getString("urlpw");
        imagen = a.getString("urlportada");
    }

    public static ArrayList<Revista> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Revista> revistas = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            revistas.add(new Revista(datos.getJSONObject(i)));
        }
        return revistas;
    }

    public String getAño() {
        return año;
    }

    public String getMes() {
        return mes;
    }

    public String getUrl() {
        return url;
    }


    public String getImagen() {
        return imagen;
    }


}
