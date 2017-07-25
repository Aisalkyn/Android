package io.futurestud.retrofit1.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import io.futurestud.retrofit1.R;
import io.futurestud.retrofit1.api.model.Branches;
import io.futurestud.retrofit1.api.model.Course;
import io.futurestud.retrofit1.api.service.ForumService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView id, name;

    ForumService service = new Retrofit.Builder()
            .baseUrl("http://45.55.194.219:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ForumService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
        getAllCourses();
        getAllBranches();
        //getAllCategories();
    }

    void getAllCourses(){
        service.getAllCourses().enqueue(new Callback<List<Course>>() {
            @Override
            public void onResponse(Call<List<Course>> call, Response<List<Course>> response) {

                TextView images = (TextView) findViewById(R.id.text3);
                TextView id1 = (TextView) findViewById(R.id.text4);
                TextView name1 = (TextView) findViewById(R.id.text5);
                TextView images1 = (TextView) findViewById(R.id.text6);
                TextView images2 = (TextView) findViewById(R.id.text70);


                id.setText(String.valueOf(response.body().get(0).get_id()));
                name.setText(String.valueOf(response.body().get(0).getName()));

                if(response.body().get(0).getImages() != null && response.body().get(0).getImages().length > 0)
                    images.setText(String.valueOf(response.body().get(0).getImages()[0].getImagePath()));

                id1.setText(String.valueOf(response.body().get(1).get_id()));
                name1.setText(String.valueOf(response.body().get(1).getName()));
                if(response.body().get(1).getImages() != null && response.body().get(1).getImages().length > 0)
                    images1.setText(String.valueOf(response.body().get(1).getImages()[0].getImagePath()));

                if(response.body().get(1).getImages() != null && response.body().get(1).getImages().length > 0)
                    images2.setText(String.valueOf(response.body().get(1).getImages()[1].getImagePath()));


            }

            @Override
            public void onFailure(Call<List<Course>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }

   void getAllBranches(){
        service.getAllBranches().enqueue(new Callback<List<Course>>() {
            @Override
            public void onResponse(Call<List<Course>> call, Response<List<Course>> response) {

                TextView branchesId = (TextView) findViewById(R.id.text9);
                TextView branchesAdress = (TextView) findViewById(R.id.text10);
                TextView branchesLatitude = (TextView) findViewById(R.id.text11);
                TextView branchesLongitude = (TextView) findViewById(R.id.text12);
                TextView branchesPhone = (TextView) findViewById(R.id.text13);

                TextView id1 = (TextView) findViewById(R.id.text14);
                TextView name1 = (TextView) findViewById(R.id.text15);
                TextView branchesId1 = (TextView) findViewById(R.id.text16);
                TextView branchesAdress1 = (TextView) findViewById(R.id.text17);
                TextView branchesLatitude1 = (TextView) findViewById(R.id.text18);
                TextView branchesLongitude1 = (TextView) findViewById(R.id.text19);
                TextView branchesPhone1 = (TextView) findViewById(R.id.text20);

                TextView branchesId2 = (TextView) findViewById(R.id.text21);
                TextView branchesAdress2 = (TextView) findViewById(R.id.text22);
                TextView branchesLatitude2 = (TextView) findViewById(R.id.text23);
                TextView branchesLongitude2 = (TextView) findViewById(R.id.text24);
                TextView branchesPhone2 = (TextView) findViewById(R.id.text25);

                id.setText(String.valueOf(response.body().get(0).get_id()));
                name.setText(String.valueOf(response.body().get(0).getName()));

                if(response.body().get(0).getBranches() != null && response.body().get(0).getBranches().length > 0)
                {
                    branchesId.setText(String.valueOf(response.body().get(0).getBranches()[0].get_id()));
                    branchesAdress.setText(response.body().get(0).getBranches()[0].getAddress());
                    branchesLatitude.setText(String.valueOf(response.body().get(0).getBranches()[0].getLatitude()));
                    branchesLongitude.setText(String.valueOf(response.body().get(0).getBranches()[0].getLongitude()));
                    branchesPhone.setText(response.body().get(0).getBranches()[0].getPhone());

                }

                id1.setText(String.valueOf(response.body().get(1).get_id()));
                name1.setText(String.valueOf(response.body().get(1).getName()));

                if(response.body().get(1).getBranches() != null && response.body().get(1).getBranches().length > 0)
                {
                    branchesId1.setText(String.valueOf(response.body().get(1).getBranches()[0].get_id()));
                    branchesAdress1.setText(response.body().get(1).getBranches()[0].getAddress());
                    branchesLatitude1.setText(String.valueOf(response.body().get(1).getBranches()[0].getLatitude()));
                    branchesLongitude1.setText(String.valueOf(response.body().get(1).getBranches()[0].getLongitude()));
                    branchesPhone1.setText(response.body().get(1).getBranches()[0].getPhone());
                }

                if(response.body().get(1).getBranches() != null && response.body().get(1).getBranches().length > 0)
                {
                    branchesId2.setText(String.valueOf(response.body().get(1).getBranches()[1].get_id()));
                    branchesAdress2.setText(response.body().get(1).getBranches()[1].getAddress());
                    branchesLatitude2.setText(String.valueOf(response.body().get(1).getBranches()[1].getLatitude()));
                    branchesLongitude2.setText(String.valueOf(response.body().get(1).getBranches()[1].getLongitude()));
                    branchesPhone2.setText(response.body().get(1).getBranches()[1].getPhone());
                }



            }

            @Override
            public void onFailure(Call<List<Course>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    void getAllCategories(){
        service.getAllCategories().enqueue(new Callback<List<Course>>() {
            @Override
            public void onResponse(Call<List<Course>> call, Response<List<Course>> response) {

                TextView id = (TextView) findViewById(R.id.text26);
                TextView images = (TextView) findViewById(R.id.text27);
                TextView categoryName = (TextView) findViewById(R.id.text28);
                TextView categoryId = (TextView) findViewById(R.id.text29);
                TextView catSubCategory = (TextView) findViewById(R.id.text30);


                id.setText((response.body().get(0).get_id()));

                if(response.body().get(0).getImages() != null && response.body().get(0).getImages().length > 0)
                    images.setText(String.valueOf(response.body().get(0).getImages()[0].getImagePath()));
                if(response.body().get(0).getCategories() != null && response.body().get(0).getCategories().length > 0)
                {
                    categoryName.setText(String.valueOf(response.body().get(0).getCategories()[0].getName()));
                    categoryId.setText(response.body().get(0).getCategories()[0].get_id());
                    catSubCategory.setText(String.valueOf(response.body().get(0).getCategories()[0].getSubCategory()));
                }





            }

            @Override
            public void onFailure(Call<List<Course>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }


    private void initializeUI() {
        id = (TextView) findViewById(R.id.text1);
        name = (TextView) findViewById(R.id.text2);
    }

}
