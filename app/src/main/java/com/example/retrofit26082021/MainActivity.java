package com.example.retrofit26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Demo1
//        ApiRequest apiRequest = RetrofitClient.getInstance().createRequest();
//
//        Call<Demo1> callbackDemo1 = apiRequest.fetchDemo1();
//        callbackDemo1.enqueue(new Callback<Demo1>() {
//            @Override
//            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
//                if (response.errorBody() != null){
//                    try {
//                        Log.d("BBB",response.errorBody().string());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }else{
//                    Demo1 demo1 = response.body();
//                    Log.d("BBB",demo1.toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Demo1> call, Throwable t) {
//
//            }
//        });

    }
}