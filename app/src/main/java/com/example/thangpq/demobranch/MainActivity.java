package com.example.thangpq.demobranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUser, etPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPass = findViewById(R.id.et_pass);
        etUser = findViewById(R.id.et_user);
        btnLogin = findViewById(R.id.btnLogin);



    }
}
