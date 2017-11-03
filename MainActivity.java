package ua.com.samples.ash.http;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements CallbackInterface{

    TextView tvResponse;
    Button btnGitHubClass;
    SendRequest sendRequest;

    Button btnUmorilliClass;
    Umorilli umorilli;

    @Override
    public void onResponse(String answer) {
        this.tvResponse.setText(answer);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendRequest = new SendRequest();

        tvResponse = (TextView) findViewById(R.id.tvResponse);
        btnGitHubClass = (Button) findViewById(R.id.btnGithubClass);
        btnGitHubClass.setOnClickListener(oclbtnGithubClass);

        btnUmorilliClass = (Button) findViewById(R.id.btnUmorilliClass);
        btnUmorilliClass.setOnClickListener(oclbtnUmoriliClass);
    }

    View.OnClickListener oclbtnGithubClass = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendRequest.getUserGithub("ZapevalovAnton", MainActivity.this);
        }
    };

    View.OnClickListener oclbtnUmoriliClass = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendRequest.getListUmorili("bash", 10, MainActivity.this);
        }
    };

}

// Кучевский версия 3
//public class MainActivity extends AppCompatActivity implements CallbackInterface{
//
//    TextView tvResponse;
//    Button btnGitHubClass;
//    Github github;
//
//    Button btnUmorilliClass;
//    Umorilli umorilli;
//
//    @Override
//    public void setString(String answer) {
//        this.tvResponse.setText(answer);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tvResponse = (TextView) findViewById(R.id.tvResponse);
//        btnGitHubClass = (Button) findViewById(R.id.btnGithubClass);
//        btnGitHubClass.setOnClickListener(oclbtnGithubClass);
//
//        btnUmorilliClass = (Button) findViewById(R.id.btnUmorilliClass);
//        btnUmorilliClass.setOnClickListener(oclbtnUmorilliClass);
//
//
//        github = new Github();
//    }
//
//    View.OnClickListener oclbtnGithubClass = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            github.getUser("ZapevalovAnton", MainActivity.this);
//        }
//    };
//
//    View.OnClickListener oclbtnUmorilliClass = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            github.getUser("ZapevalovAnton", MainActivity.this);
//        }
//    };
//
//}

// Кучевский версия 2
//public class MainActivity extends AppCompatActivity {
//
//    TextView tvResponse;
//    Button btnGitHubClass;
//    Github github;
//    String answer;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tvResponse = (TextView) findViewById(R.id.tvResponse);
//        btnGitHubClass = (Button) findViewById(R.id.btnGithubClass);
//        btnGitHubClass.setOnClickListener(oclbtnGithubClass);
//
//        github = new Github();
//    }
//
//    View.OnClickListener oclbtnGithubClass = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            github.Activate("ZapevalovAnton").getCall().enqueue(new Callback<GithubUser>() {
//                @Override
//                public void onResponse(Call<GithubUser> call, Response<GithubUser> response) {
//                    tvResponse.setText(response.body().getLogin());
//                }
//
//                @Override
//                public void onFailure(Call<GithubUser> call, Throwable t) {
//                    tvResponse.setText(t.toString());
//                }
//            });
//        }
//    };
//
//}

// Кучевский версия 1
//public class MainActivity extends AppCompatActivity {
//
//    TextView tvResponse;
//    Button btnGitHubClass;
//    Github github;
//    String answer;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tvResponse = (TextView) findViewById(R.id.tvResponse);
//        btnGitHubClass = (Button) findViewById(R.id.btnGithubClass);
//        btnGitHubClass.setOnClickListener(oclbtnGithubClass);
//
//        github = new Github(this);
//    }
//
//    View.OnClickListener oclbtnGithubClass = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            github.getLogin("ZapevalovAnton");
//            //tvResponse.setText(answer);
//        }
//    };
//
//    public TextView getTvResponse() {
//        return tvResponse;
//    }
//
//    public void setTvResponse(TextView tvResponse) {
//        this.tvResponse = tvResponse;
//    }
//}