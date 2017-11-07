package ua.com.samples.ash.http;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

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
                callbackInterface.onResponse(response.body().getLogin(), Boolean.FALSE);
            }

            @Override
            public void onFailure(Call<GithubUser> call, Throwable t) {
                t.toString();
            }
        });

        Retrofit retrofitAsString = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();

        GithubApiInterface serviceAsString = retrofit.create(GithubApiInterface.class);
        Call<ResponseBody> callAsString = serviceAsString.getUserAsString(userName);
        callAsString.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> callAsString, Response<ResponseBody> response) {
                try {
                    callbackInterface.onResponse(response.body().string(), Boolean.TRUE);
                }
                catch(IOException exception){}
            }

            @Override
            public void onFailure(Call<ResponseBody> callAsString, Throwable t) {
                callbackInterface.onResponse(t.toString(), Boolean.TRUE);
            }
        });
    }
    public void getListUmorili(String word, int countRec,final CallbackInterface callbackInterface){

        String baseUrl = "http://www.umori.li";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();

        UmoriliApiInterface service = retrofit.create(UmoriliApiInterface.class);
        Call<List<UmoriliModel>> call = service.getList(word, countRec);
        call.enqueue(new Callback<List<UmoriliModel>>(){
            @Override
            public void onResponse(Call<List<UmoriliModel>> call, Response<List<UmoriliModel>> response) {
//                callbackInterface.onResponse(response.body());
            }

            @Override
            public void onFailure(Call<List<UmoriliModel>> call, Throwable t) {
                callbackInterface.onResponse(t.toString(), Boolean.FALSE);
            }
        });

        Call<ResponseBody> callAsString = service.getListAsString("bash", 10);

        callAsString.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> callAsString, Response<ResponseBody> response) {
                try {
                    callbackInterface.onResponse(response.body().string(), Boolean.TRUE);
                }
                catch(IOException exception){}
            }

            @Override
            public void onFailure(Call<ResponseBody> callAsString, Throwable t) {
                callbackInterface.onResponse(t.toString(), Boolean.TRUE);
            }
        });

    }

    public void authBM(String login, String psw, final CallbackInterface callbackInterface){

        String baseUrl = "https://159.253.19.141:1500";

        OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BMApiInterface service = retrofit.create(BMApiInterface.class);
        Call<BMAuth> call = service.Auth("json", "auth", login, psw);
        call.enqueue(new Callback<BMAuth>() {
            @Override
            public void onResponse(Call<BMAuth> call, Response<BMAuth> response) {
                BMAuth answer = response.body();
                callbackInterface.onResponse(answer.getDoc().getAuth().get$id(), Boolean.FALSE);
                callbackInterface.onResponse(answer.getDoc().get$host(), Boolean.TRUE);
            }

            @Override
            public void onFailure(Call<BMAuth> call, Throwable t) {
                callbackInterface.onResponse(t.toString(), Boolean.TRUE);
            }
        });
    }

}