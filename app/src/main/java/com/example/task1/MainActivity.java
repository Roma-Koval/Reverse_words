package com.example.task1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText exsymbol;
    private EditText edittext;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                exsymbol = findViewById(R.id.exsymbol);
                String userEx = exsymbol.getText().toString();

                edittext = findViewById(R.id.edittext);
                String userString = edittext.getText().toString();

                textView = findViewById(R.id.textview);
                textView.setText(ReverseWord.reverse(userString, userEx));
            }
        });
    }
}



