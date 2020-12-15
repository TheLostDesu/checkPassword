package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String Login = "Login", Password = "Password";
    private TextView textView;
    private Button button;
    private EditText a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText)findViewById(R.id.editTextTextPersonName);
        b = (EditText)findViewById(R.id.editTextTextPassword);
        button = (Button) findViewById(R.id.button);
        textView  = (TextView) findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l, p;
                l = a.getText().toString();
                p = b.getText().toString();
                if(l.equals(Login) && p.equals(Password)) {
                    textView.setText("Верно");
                    textView.setTextColor(Color.parseColor("#008000"));
                }
                else {
                    textView.setText("Вы ошиблись в логине или пароле");
                    textView.setTextColor(Color.parseColor("#FF0000"));
                    a.setText(null);
                    b.setText(null);
                }
            }
        });
    }
}