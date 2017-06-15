package aisa.helloname;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admin on 6/5/17.
 */

public class SecondActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        String name = getIntent().getStringExtra("name");
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Hello, " + name);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(OnClick);


    }
    private View.OnClickListener OnClick = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            finish();
        }
    };
}
