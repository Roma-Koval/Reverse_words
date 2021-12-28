package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickReverse(View view){

        //String ReverseString = "";
        //TextView textView = findViewById(R.id.textview);
        //EditText edittext =  findViewById(R.id.edittext);
        //String userString=edittext.getText().toString();
        //char[] EnterString = userString.toCharArray();
        //for(int count=EnterString.length-1;count>=0;count--){
       //     ReverseString = ReverseString + EnterString[count];
        //}
        //textView.setText(ReverseString);

        EditText edittext =  findViewById(R.id.edittext);
        TextView textView = findViewById(R.id.textview);
        String userString=edittext.getText().toString();
        StringBuffer strBuffer = new StringBuffer(userString);
        strBuffer.reverse();
        textView.setText(strBuffer);




    }
}
