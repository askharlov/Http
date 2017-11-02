package ua.com.samples.ash.http;

import android.content.Context;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class Github {

    private String BASE_URLgithub = "https://api.github.com";
    Retrofit retrofit;
    GithubApiInterface service;
    Call<GithubUser> call;

    public Github() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URLgithub)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(GithubApiInterface.class);

    }

    public Github Activate (String userName) {
        call = service.getUser(userName);
        return this;
    }

    public Call<GithubUser> getCall () {
        return call;
    }
}

interface GithubApiInterface {
    @GET("/users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);
}

// Кучевский версия 1
//public class Github {
//
//    private String BASE_URLgithub = "https://api.github.com";
//    Retrofit retrofit;
//    GithubApiInterface service;
//    Context context;
//
//    public Github(Context context) {
//        this.context = context;
//        retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URLgithub)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        service = retrofit.create(GithubApiInterface.class);
//    }
//
//    public void getLogin (String userName){
//
//        Call<GithubUser> call = service.getUser(userName);
//
//        call.enqueue(new Callback<GithubUser>() {
//            @Override
//            public void onResponse(Call<GithubUser> call, Response<GithubUser> response) {
//                ((MainActivity)context).getTvResponse().setText(response.body().getLogin());
//            }
//
//            @Override
//            public void onFailure(Call<GithubUser> call, Throwable t) {
//                //answer = t.toString();
//                ((MainActivity)context).getTvResponse().setText(t.toString());
//            }
//        });
//
//    }
//
//}