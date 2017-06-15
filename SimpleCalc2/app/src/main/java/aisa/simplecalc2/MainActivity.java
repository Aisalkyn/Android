package aisa.simplecalc2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText editText;
    EditText editText2;
    RadioGroup radioGroup;
    TextView textView;

    private enum btn
    {
        add, subtract, multiply, divide
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.firstInput);
        editText2 = (EditText) findViewById(R.id.secondInput);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        textView = (TextView) findViewById(R.id.result);

        radioGroup.clearCheck();
    }

    public void click(View view){
        boolean check = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.add:
                if (check)
                    solve(btn.add);

                break;
            case R.id.subtruct:
                if (check)
                    solve(btn.subtract);
                break;
            case R.id.multiply:
                if (check)
                    solve(btn.multiply);
                break;
            case R.id.divide:
                if (check)
                    solve(btn.divide);
                break;

        }
    }

    private void solve(btn b){
        float n = 0;
        float m = 0;
        float r = 0;


        if(TextUtils.isEmpty(editText.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString()))
        {
             Toast.makeText(this, "Empty Field", Toast.LENGTH_SHORT).show();
        }
        try {
            n = Float.parseFloat(editText.getText().toString());
            m = Float.parseFloat(editText2.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        switch (b){
            case add:
                textView.setText(String.valueOf(n + m));
                break;
            case subtract:
                textView.setText(String.valueOf(n - m));
                break;
            case multiply:
                textView.setText(String.valueOf(n * m));
                break;
            case divide:
                textView.setText(String.valueOf(n / m));

                break;



        }
    }/*
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.add:
                        solve(btn.add);
                        break;


                }
            }
        });
    }
        public void solve(btn b)
        {
            int n = 0;
            int m = 0;

            try
            {
                n = Integer.parseInt(editText.getText().toString());
                m = Integer.parseInt(editText2.getText().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (b)
            {
                case add:
                    textView.setText(String.valueOf(n + m));
                    break;
            }
            Toast.makeText(getApplicationContext(), Boolean.toString(check),
                Toast.LENGTH_SHORT).show();
        }*/




    }



