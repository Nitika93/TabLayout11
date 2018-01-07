package com.example.lenovo.customtablayout;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;
import com.example.lenovo.customtablayout.networking.AtechnosServerService;
import com.example.lenovo.customtablayout.networking.RetrofitRestController;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import static android.R.attr.id;


public class OneFragment extends Fragment {
    GridView gridView;

    private String name;

    public static OneFragment newInstancee(String name) {
        OneFragment fragment_homeDetails = new OneFragment();
        Bundle args = new Bundle();
        args.putString("name", name);
//        args.putString("image", tab_img);
        fragment_homeDetails.setArguments(args);
        return fragment_homeDetails;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getArguments().getString("name");
//        tab_image = getArguments().getString("image");
        Log.e("hellofragment", "values---" + id + "\n" + "page:-" + name);
        Log.e("hellofragment", "values---" + id + "\n" + "page:-" + id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        gridView=(GridView)v.findViewById(R.id.gvIcon);
        if (NetworkAvailability.isNetworkAvailable(getActivity())) {
            setMainMenu(name);
        } else {
            Toast.makeText(getActivity(), "No internet connection...", Toast.LENGTH_SHORT).show();
        }
        return v;
    }
    private void setMainMenu(String name) {
       // Log.d(TAG, "onResponse: " + "inside fetch");
        AtechnosServerService Service = RetrofitRestController.getClient().create(AtechnosServerService.class);
        Call<Nitika> call = Service.getNews(name);
        // TODO: 01/12/17 Below mentioned code is for aSynchronus call
        call.enqueue(new Callback<Nitika>() {
            @Override
            public void onResponse(Call<Nitika> call, Response<Nitika> response) {
                Log.e("TAGGG", "onResponse: " + response.body().getData());

               AdapterPlaystoreMore customAdapter= new AdapterPlaystoreMore(getActivity(), response.body().getData());
                gridView.setAdapter(customAdapter);
            }
            @Override
            public void onFailure(Call<Nitika> call, Throwable t) {


            }
        });
    }
}
