package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText exsymbol = findViewById(R.id.exsymbol);
                String userEx = exsymbol.getText().toString();
                EditText edittext =  findViewById(R.id.edittext);
                TextView textView = findViewById(R.id.textview);
                String userString=edittext.getText().toString();

                textView.setText(ReverseWord.reverse(userString, userEx));
            }
        });
        }


    }



