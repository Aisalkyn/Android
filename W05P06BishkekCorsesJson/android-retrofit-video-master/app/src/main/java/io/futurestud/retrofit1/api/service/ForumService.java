package io.futurestud.retrofit1.api.service;

import java.util.List;

import io.futurestud.retrofit1.api.model.Course;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface ForumService {

    @GET("/getAllCourses")
    Call<List<Course>> getAllCourses();

    @GET("/getAllBranches")
    Call<List<Course>> getAllBranches();

    @GET("/getAllCategories")
    Call<List<Course>> getAllCategories();

    @FormUrlEncoded
    @POST
    Call<Response> postV(@Field("id") String text);

}
