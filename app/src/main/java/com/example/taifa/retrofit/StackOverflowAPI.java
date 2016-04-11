package com.example.taifa.retrofit;

/**
 * Created by taifa on 4/11/16.
 */


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.Call;
//public class StackOverflowAPI {
//}
public interface StackOverflowAPI {
//    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackOverflowQuestions> loadQuestions(@Query("tagged") String tags);
}