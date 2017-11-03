package ua.com.samples.ash.http;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aGerasimov on 03.11.2017.
 */

public interface UmoriliApiInterface {
    @GET("/api/get")
    Call<List<UmoriliModel>> getList(@Query("name") String resourceName, @Query("num") int count);
}
