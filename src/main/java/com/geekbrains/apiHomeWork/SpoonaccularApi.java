package com.geekbrains.apiHomeWork;

import retrofit2.Call;
import retrofit2.http.*;

public interface SpoonaccularApi {
    @POST("users/connect")
    Call<ApiUserConnectResult>
    connect(@Body ApiUserConnectRequest request, @Query("apiKey") String apiKey);

    @POST("mealplanner/your-users-name375/shopping-list/items?hash=877c579e679b788408d28a1865ff94dd8ffb8efd")
    Call<ApiSearchResult> addToShoppingList (@Body ApiSearchRequest request, @Query("apiKey") String apiKey);

    @GET("mealplanner/your-users-name375/shopping-list?hash=877c579e679b788408d28a1865ff94dd8ffb8efd")
    Call<ApiGetResult> getShoppingList (@Query("apiKey") String apiKey);

    @DELETE("mealplanner/your-users-name375/shopping-list/items/1300199?hash=877c579e679b788408d28a1865ff94dd8ffb8efd")
    Call<ApiGetResult> deleteShoppingList (@Query("apiKey") String apiKey);


}
