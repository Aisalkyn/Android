package aisa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);

      /*  View.OnClickListener OnClickListener =  new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                    {
                        case R.id.radioButton:
                            textView1.setText("+");
                            break;
                    }
                switch (view.getId())
                {
                    case R.id.radioButton2:
                        textView1.setText("-");
                        break;
                }
                switch (view.getId())
                {
                    case R.id.radioButton3:
                        textView1.setText("*");
                        break;
                }
                switch (view.getId())
                {
                    case R.id.radioButton4:
                        textView1.setText("/");
                        break;
                }

                https://simpleandstupid.com/2016/02/12/auto-layout-on-android-a-pure-java-implementation/ 

            }*/
        };

    }
}
