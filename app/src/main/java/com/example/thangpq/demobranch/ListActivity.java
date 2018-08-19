package com.example.thangpq.demobranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    public void setupUI()
    {
        String a = " I love you";
        long b = 10;
    }
    public void addListener()
    {
        Button button = findViewById(R.id.barrier);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListActivity.this, "Click me!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    void addPerson()
    {
        Person person = new Person("1","1");
    }
    void addPerson2()
    {
        Person person2 = new Person("1","1");
        Person person23 = new Person("1","1");
        Person person234 = new Person("1","1");
    }
    void addPerson233()
    {
        Person person2 = new Person("1","1");
        Person person23 = new Person("1","1");
        Person person234 = new Person("1","1");
    }
    void addPerson23553()
    {
        Person person2 = new Person("1","1");
        Person person23 = new Person("1","1");
        Person person234 = new Person("1","1");
    }
    void addPerson5()
    {
        Person person2 = new Person("1","1");
        Person person23 = new Person("1","1");
        Person person234 = new Person("1","1");
    }
}
