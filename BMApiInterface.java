package ua.com.samples.ash.http;

import android.provider.SyncStateContract;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by aGerasimov on 03.11.2017.
 */

public interface BMApiInterface {
    @GET("/billmgr")
    Call<BMAuth> Auth(@Query("out") String out, @Query("func") String func, @Query("username") String login, @Query("password") String psw);
}
