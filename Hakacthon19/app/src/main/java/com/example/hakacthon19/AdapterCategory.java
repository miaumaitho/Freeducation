package com.example.hakacthon19;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterCategory extends BaseAdapter {

    ArrayList<Category> category = new ArrayList<Category>();
    ListView lv = (ListView) findViewById(R.id.listaTutores);
    AdapterCategory adapter = new AdapterCategory(this, category);
    lv.setAdapter(adapter);

    protected Activity activity;
    protected ArrayList<Category> items;

    public AdapterCategory (Activity activity, ArrayList<Category> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public void addAll(ArrayList<Category> category) {

        for (int i =1 ; i < category.size(); i++) {
            items.add(category.get(i));
        }
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.lista_tutores, null);
        }

        Category dir = items.get(position);

        TextView nombre = (TextView) v.findViewById(R.id.category);
        nombre.setText(dir.getNombre());

        TextView edad = (TextView) v.findViewById(R.id.texto);
        edad.setText(dir.getEdad());

        TextView nEstudios = (TextView) v.findViewById(R.id.texto);
        nEstudios.setText(dir.getnEstudios());




        return v;
    }
}
