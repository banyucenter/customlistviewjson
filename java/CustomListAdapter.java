package com.yourpackage.com.yourpackage;

/**
 * Created by ipungpurwono on 2/13/18.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by quocnguyen on 03/08/2016.
 */
public class CustomListAdapter extends ArrayAdapter<Kategori> {

    ArrayList<Kategori> kategoris;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<Kategori> kategoris) {
        super(context, resource, kategoris);
        this.kategoris = kategoris;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_layout, null, true);

        }

        Kategori product = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.imageViewProduct);
        Picasso.with(context).load(product.getFoto()).into(imageView);

        TextView txtName = convertView.findViewById(R.id.txtName);
        txtName.setText(product.getNama_kategori());

        TextView txtPrice = convertView.findViewById(R.id.txtPrice);
        txtPrice.setText(product.getSub_judul());

        return convertView;
    }
}
