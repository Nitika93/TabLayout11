package com.example.lenovo.customtablayout.networking;



import com.example.lenovo.customtablayout.Moviee;
import com.example.lenovo.customtablayout.Nitika;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by atechnos pc on 12/2/2017.
 */

public interface AtechnosServerService {
    @GET("atsgames/")
    Call<Moviee> getNewss();
    @GET("atsgames/cat_games.php")
    Call<Nitika> getNews(@Query("category") String category);

// ist method using json

    // 2nd method using formdata

//    @GET("weather")
//    Call<Object> currentWeather(@Query("q") String cityName, @Query("appid") String apiKey);
  //  http://atechnos.net/cms/news_api/api/get_news.php?lan=null&cat=Topstories
   // http://atechnos.net/safari/api/placebook.php
}
