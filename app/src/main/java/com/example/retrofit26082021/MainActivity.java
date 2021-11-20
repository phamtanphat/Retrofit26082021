package com.example.retrofit26082021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.retrofit26082021.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {


    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem myActionMenuItem = menu.findItem(R.id.menu_item_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Toast like print
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                // UserFeedback.show( "SearchOnQueryTextChanged: " + s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}