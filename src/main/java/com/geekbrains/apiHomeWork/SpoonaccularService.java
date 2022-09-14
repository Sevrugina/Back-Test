package com.geekbrains.apiHomeWork;

import com.geekbrains.api.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class SpoonaccularService {

    private final  SpoonaccularApi api;
    private static final String API_KEY = "575f96da7c4d4a12a06e56b061f510c9";

    public SpoonaccularService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(SpoonaccularApi.class);
    }
    public ApiSearchResult addToShoppingList() {
        Call<ApiSearchResult> call = api.addToShoppingList(new ApiSearchRequest(), API_KEY);
        return RetrofitUtils.execute(call);
    }

    public ApiGetResult getShoppingList() {
        Call<ApiGetResult> call = api.getShoppingList( API_KEY);
        return RetrofitUtils.execute(call);
    }

    public ApiGetResult deleteShoppingList() {
        Call<ApiGetResult> call = api.getShoppingList( API_KEY);
        return RetrofitUtils.execute(call);
    }

    public ApiUserConnectResult connect(@Body ApiUserConnectRequest request) {
        Call<ApiUserConnectResult> call = api.connect(request, API_KEY);
        return RetrofitUtils.execute(call);
    }
}