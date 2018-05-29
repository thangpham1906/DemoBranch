package com.example.thangpq.demobranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

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


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etPass.getText().equals("123")&&etUser.getText().equals("123"))
                {
                    Toast.makeText(MainActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Login fail", Toast.LENGTH_SHORT).show();
            }
        });
        if(etUser.getText().equals("aaaa"))
        {
            Toast.makeText(this, "dsabdsajkbd", Toast.LENGTH_SHORT).show();
        }
    }
}
