package com.example.bridgeit.spftest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail,editTextPassword;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail=(EditText)findViewById(R.id.edittext1);
        editTextPassword=(EditText)findViewById(R.id.edittext2);
        button1=(Button)findViewById(R.id.btn);
        button2=(Button)findViewById(R.id.btnreg);
    }
    public void Login(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("laxmi",Context.MODE_PRIVATE);
        //String UserName=sharedPreferences.getString("Username","value");
        String email=sharedPreferences.getString("email","value");
        String password=sharedPreferences.getString("password","value");
        if(editTextEmail.getText().toString().equalsIgnoreCase(email) && editTextPassword.getText().toString().equalsIgnoreCase(password)) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(this, Welcome.class);
            startActivity(intent1);
        }
        else {
            Toast.makeText(getApplicationContext(),"Enter Correct Details Or Register ",Toast.LENGTH_SHORT).show();

        }
    }
    public void Register(View view){
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);
        /*SharedPreferences spf=getSharedPreferences("monty", Context.MODE_PRIVATE);
        String email=spf.getString("email","no value");
        String password=spf.getString("password","no value");*/

    }
}
