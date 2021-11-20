package com.example.retrofit26082021;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {
//    @GET("KhoaPhamTraining/json/tien/demo1.json")
//    Call<Demo1> fetchDemo1();

    @GET("api/location/search")
    Call<List<City>> searchCity(@Query("query") String query);
}
