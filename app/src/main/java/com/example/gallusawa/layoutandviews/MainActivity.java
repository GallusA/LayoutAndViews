package com.example.gallusawa.layoutandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "main";


    EditText etNumber1, etNumber2;
    Button btnName;
    TextView tvName;


    EditText etPersonName, etPersonGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //binding views

        etNumber1 = (EditText) findViewById(R.id.etNumber1;
        etNumber2 = (EditText) findViewById(R.id.etNumber2;

            //  etName.setText('Hello World');

        btnName = (Button) findViewById(R.id.btnDoMagic);
        tvName = (TextView) findViewById(R.id.tvName);


        etPersonName = (EditText) findViewById(R.id.etPersonName);
        etPersonGender = (EditText) findViewById(R.id.etPersonGender);

       // setting on click listener of the button
        btnName.setOnClickListener(view) {
            int etNum1 = Integer.parseInt(etNumber1.getText().toString());
            int etNum2 = Integer.parseInt(etNumber2.getText().toString());

            tvName.setText(String.value(etNum1 + etNum2));
        });


        Log.d(TAG, "onCreate: ");
    }





    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }



    @Override
    protected void onResume() {
        super.onStart();
        Log.d(TAG, "onResume: ");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void passPersonToSecond(View view){
        String personName = etPersonName.getText().toString();
        String personGender = etPersonGender.getText().toString();



        Person person = new Person(personName, personGender);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.setAction("sendingPerson");
        intent.putExtra("person", person);
        startActivity(intent);



    }


}
