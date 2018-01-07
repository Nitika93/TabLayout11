package com.example.lenovo.customtablayout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.lenovo.customtablayout.Model.Datum;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by my pc on 4/25/2017.
 */

public class AdapterPlaystoreMore extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Datum> movieItems;

    public AdapterPlaystoreMore(Activity activity, List<Datum> movieItems) {
        this.activity = activity;
        this.movieItems = movieItems;
    }

    @Override
    public int getCount() {
        return movieItems.size();
    }
    @Override
    public Object getItem(int i) {
        return movieItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null)
            view = inflater.inflate(R.layout.single_app, null);
        ImageView ivMenuImage = (ImageView) view.findViewById(R.id.itemImage);
        Log.e("nitika", "array size: " + movieItems.size());
        final Datum m = movieItems.get(i);
        Picasso.with(activity).load(m.getGameIcon()).placeholder(R.drawable.logo).into(ivMenuImage);
        return view;
    }


}
