package aisa.w06p01retrofitpost;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by admin on 7/10/17.
 */

 interface ForumService {


    @POST("addCourse")
    Call<User> createAccount(@Body User user);


}
