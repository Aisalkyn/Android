package aisa.w06p01retrofitpost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = (EditText)findViewById(R.id.login);
        final EditText editText1 = (EditText)findViewById(R.id.password);
        final EditText editText2 = (EditText)findViewById(R.id.age);
        final EditText editText3 = (EditText)findViewById(R.id.email);

        Button createAccountButton = (Button) findViewById(R.id.button);
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                User user = new  User(
                        editText.getText().toString(),
                        editText1.getText().toString(),
                        Integer.parseInt(editText2.getText().toString()),//integer
                        editText3.getText().toString().split(",").toString());

                sendNetworkRequest(user);

            }
        });

    }

    private void sendNetworkRequest(User user) {

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("http://45.55.194.219:3000/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        ForumService client = retrofit.create(ForumService.class);
        Call<User> call = client.createAccount(user);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(MainActivity.this, "user ID:" + response.body().getId(), Toast.LENGTH_SHORT).show();;
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Fail :(", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
