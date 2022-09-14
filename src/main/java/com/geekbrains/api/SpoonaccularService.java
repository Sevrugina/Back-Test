package com.geekbrains.api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class SpoonaccularService {

    private SpoonaccularApi api;
    private static final String API_KEY = "0970f5c615f14a2a91942df5a213e41c";

    public SpoonaccularService() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(SpoonaccularApi.class);
    }

    public ApiSearchResult findRecipes(String query, Integer number) {
        Call<ApiSearchResult> call = api.findRecipes(API_KEY, query, number);
        return RetrofitUtils.execute(call);
    }

    public ApiUserConnectResult connect(@Body ApiUserConnectRequest request) {
        Call<ApiUserConnectResult> call = api.connect(request, API_KEY);
        return RetrofitUtils.execute(call);
    }

}
