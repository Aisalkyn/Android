package aisa.w05p02retrofittransalte;


import com.squareup.okhttp.Response;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by admin on 7/4/17.
 */

public interface Link {

    @GET("/api/v1.5/tr.json/translate")
    Call<Model> Translate(@Query("key") String key, @Query("text") String text, @Query("lang") String lang);


}
