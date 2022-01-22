package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickReverse(View view) {
        EditText exsymbol = findViewById(R.id.exsymbol);
        String userEx = exsymbol.getText().toString();
        char ign = userEx.charAt(0);
        String rev = "";
        EditText edittext =  findViewById(R.id.edittext);
        TextView textView = findViewById(R.id.textview);
        String userString=edittext.getText().toString();
        char[] result = userString.toCharArray();
        int r = result.length - 1, l = 0;


        while (l < r)
        {
            if (result[l]==ign)
                l++;
            else if(result[r]==ign)
                r--;

            else
            {
                char tmp = result[l];
                result[l] = result[r];
                result[r] = tmp;
                l++;
                r--;
            }
        }

        for(int i=0; i<result.length; i++){
            rev = rev + result[i];

        }

        textView.setText(rev);

        }

    }



