package com.example.bridgeit.sharedpftest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by bridgeit on 21/3/17.
 */

public class Login extends AppCompatActivity {
    EditText emailEditText,passwordEditText;
    Button button1;
    //ImageView imageView,imageView2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        emailEditText=(EditText)findViewById(R.id.EmailEditText);
        passwordEditText=(EditText)findViewById(R.id.PasswordEditText);
        button1=(Button)findViewById(R.id.loginbtn);
        /*imageView=(ImageView)findViewById(R.id.facebook);
        imageView2=(ImageView)findViewById(R.id.google);*/
        //button2=(Button)findViewById(R.id.Registerbtn);
    }

    public void Login(View view) {
        if (!validateEmail(emailEditText.getText().toString())){
            emailEditText.setError("invalid Email");
            emailEditText.requestFocus();
    }
    else if(!validatePassword(passwordEditText.getText().toString())){
            passwordEditText.setError("invalid password");
            passwordEditText.requestFocus();
        }
        else {
            Toast.makeText(getApplicationContext(),"Login Successfull..",Toast.LENGTH_SHORT).show();
        }


    }
    //return true if password is valid ifnot then false and show d toast
    private boolean validatePassword(String passwordEditText ) {
        if(passwordEditText!=null && passwordEditText.length()>5 )
        {
            return true;
        }
        else{
            Toast.makeText(this,"Password should be 5 digits",Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean validateEmail(String email)
    {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

    }


    public void Register(View view){
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);
    }
    public void ForgotTextView(View view){
        Intent intent=new Intent(this,ResetPassword.class);
        startActivity(intent);
    }
    public void FacebookButton(View view){

    }
    public void GoogleButton(View view){

    }

}
