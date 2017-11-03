package ua.com.samples.ash.http;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class SendRequest {

    public void getUserGithub(String userName, final CallbackInterface callbackInterface){

        String baseUrl = "https://api.github.com";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GithubApiInterface service = retrofit.create(GithubApiInterface.class);
        Call<GithubUser> call = service.getUser(userName);
        call.enqueue(new Callback<GithubUser>() {
            @Override
            public void onResponse(Call<GithubUser> call, Response<GithubUser> response) {
                callbackInterface.onResponse(response.body().getLogin());
            }

            @Override
            public void onFailure(Call<GithubUser> call, Throwable t) {
                t.toString();
            }
        });
    }
    public void getListUmorili(String word, int countRec,final CallbackInterface callbackInterface){

        String baseUrl = "http://www.umori.li";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UmoriliApiInterface service = retrofit.create(UmoriliApiInterface.class);
        Call<List<UmoriliModel>> call = service.getList(word, countRec);
        call.enqueue(new Callback<List<UmoriliModel>>(){
            @Override
            public void onResponse(Call<List<UmoriliModel>> call, Response<List<UmoriliModel>> response) {
                ResponseBody result = (ResponseBody) response.body();
                //callbackInterface.onResponse(response.body().getSite());
            }

            @Override
            public void onFailure(Call<List<UmoriliModel>> call, Throwable t) {
                t.toString();
            }
        });
    }


}