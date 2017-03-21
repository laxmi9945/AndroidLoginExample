package com.example.bridgeit.sharedpftest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by bridgeit on 21/3/17.
 */

public class Login extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1,button2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editText1=(EditText)findViewById(R.id.EmailEditText);
        editText2=(EditText)findViewById(R.id.PasswordEditText);
        button1=(Button)findViewById(R.id.loginbtn);
        button2=(Button)findViewById(R.id.Registerbtn);
    }


    public void Login(View view){

        Toast.makeText(getApplicationContext(),"Login Successfull..",Toast.LENGTH_SHORT).show();

    }


    public void Register(View view){
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);
    }
    public void ForgotTextView(View view){
        Intent intent=new Intent(this,ResetPassword.class);
        startActivity(intent);
    }

}
