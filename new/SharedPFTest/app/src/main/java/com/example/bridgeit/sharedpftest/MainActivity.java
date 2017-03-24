package com.example.bridgeit.sharedpftest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.loginbtn);
        //button=(Button)findViewById(R.id.Registerbtn);
    }
    public void Login(View view){

    }

    public void Register(View view)
    {
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);
    }
}
