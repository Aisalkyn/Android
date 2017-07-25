package aisa.w05p05retrofitjason;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 7/5/17.
 */

public interface Link {

    @GET("/data/2.5/weather?q=London%2Cuk&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<Model> Translate(@Query("key") String key, @Query("text") String text, @Query("lang") String lang);


}
