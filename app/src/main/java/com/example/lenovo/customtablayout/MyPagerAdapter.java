package com.example.lenovo.customtablayout;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by Lenovo on 02-01-2018.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    LayoutInflater mLayoutInflater;
    ArrayList<Fragment> fragmentArrayList;
    private Context context;
    String name = null, imageIcon = null;


    public MyPagerAdapter(FragmentManager fm, ArrayList<Fragment> arrayList, Context context) {
        super(fm);
        this.fragmentArrayList = arrayList;
        this.context = context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Fragment getItem(int position) {
        System.out.println("getItem" + position);
        return fragmentArrayList.get(position);
    }
    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

}

