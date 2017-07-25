package io.futurestud.retrofit1.api.service;

import java.util.List;

import io.futurestud.retrofit1.api.model.WeatherForecast;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by norman on 12/26/16.
 */

public interface GitHubClient {

    @GET("/data/2.5/weather?q=London%2Cuk&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<WeatherForecast>  reposForUser();
}
