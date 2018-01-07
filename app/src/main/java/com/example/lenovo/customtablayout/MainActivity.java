package com.example.lenovo.customtablayout;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lenovo.customtablayout.networking.AtechnosServerService;
import com.example.lenovo.customtablayout.networking.RetrofitRestController;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.lenovo.customtablayout.R.id.tab;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    private ArrayList<Fragment> arrayList_Fragment = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(tab);
        sendRequest();
        //setMainMenu();
        //setMainMenu();
    }
    private View createTabItemView(String imgUri) {
        ImageView imageView = new ImageView(this);
        TabLayout.LayoutParams params = new TabLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        imageView.setLayoutParams(params);
        Picasso.with(this).load(imgUri).into(imageView);
        return imageView;

    }
    private void sendRequest() {
        Log.d("key", "onResponse: " + "inside fetch");
        AtechnosServerService Service = RetrofitRestController.getClient().create(AtechnosServerService.class);
        Call<Moviee> call = Service.getNewss();
        // TODO: 01/12/17 Below mentioned code is for aSynchronus call
        call.enqueue(new Callback<Moviee>() {
            @Override
            public void onResponse(Call<Moviee> call, Response<Moviee> response) {
                for (int i = 0; i < response.body().getData().size(); i++) {
                    String categoryName = response.body().getData().get(i).getGameCategory();
                    //  Log.e("tag", "onResponse: " + response.body().getData().get(i).getGameIcon() );
                   Log.e("tag",""+response.body().getData().get(i).getGameIcon());
                    tabLayout.addTab(tabLayout.newTab().setCustomView(createTabItemView(response.body().getData().get(i).getGameIcon())));
                    //arrayList_Fragment.add(new OneFragment());
                    arrayList_Fragment.add(new OneFragment().newInstancee(categoryName));
                    //tabLayout.addTab(tabLayout.newTab().setText("\n"+response.body().getData().get(i).getGameCategory()));
                    /*ImageView imageView = new ImageView(MainActivity.this);
                    TabLayout.LayoutParams params = new TabLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);
                    imageView.setLayoutParams(params);
                    Picasso.with(MainActivity.this).load(String.valueOf(imageView));*/
                    //tabLayout.addTab(tabLayout.newTab().setText(response.body().getData().get(i
                    // ).getGameIcon(imageView)));
                    // tabLayout.addTab(tabLayout.newTab().setCustomView(createTabItemView(response.body().getData().get(i).getGameIcon())));
                }
                viewPager = (ViewPager) findViewById(R.id.pager);
                MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), arrayList_Fragment, getApplicationContext());
                viewPager.setAdapter(adapter);
                tabLayout.setupWithViewPager(viewPager);
                //Log.d(TAG, "onResponse: " + response.body().toString());
            }
            public void onFailure(Call<Moviee> call, Throwable t) {
            }
        });
    }

}