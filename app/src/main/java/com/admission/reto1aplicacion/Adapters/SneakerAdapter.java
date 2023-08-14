package com.admission.reto1aplicacion.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.admission.reto1aplicacion.Model.Sneaker;
import com.admission.reto1aplicacion.R;

public class SneakerAdapter extends BaseAdapter {

    private Context context;

    public SneakerAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return Sneaker.ITEMS.length;
    }

    @Override
    public Sneaker getItem(int position) {
        return Sneaker.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_grilla, parent, false);
        }

        ImageView fotoSneaker = (ImageView) view.findViewById( R.id.sneakerimg);
        TextView nombreSneaker  = (TextView) view.findViewById(R.id.sneakerName);
        Sneaker item =  getItem(position);
        fotoSneaker.setImageResource(item.getIdDrawable());
        nombreSneaker.setText(item.getName());
        return view;
    }
}

