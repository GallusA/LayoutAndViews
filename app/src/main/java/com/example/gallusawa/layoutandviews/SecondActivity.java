package com.example.gallusawa.layoutandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.value;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "Second";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.activity_second);

        Intent intent = getIntent();

        switch (intent.getAction()){
            case "sendingValue"

                log.d(TAG, "OnCreate: " + intent.getStringExtra("Value"));
                break;
            case "sendingPerson":
                Person person = (Person) intent.getSerializableExtra("person)";
                log.d(TAG, "onCreate: " + person.getName() + "" + Person.getGender());
                break;
                )


        }
    }
}
