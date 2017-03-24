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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail,editTextPassword;
    Button button1,button2;
    Pattern pattern,patern1;
    Matcher matcher,matcher2;
    /*String EMAIL_PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";*/
    String EMAIL_PATTERN="^(.+)@(.+)$";

    String Password_Pattern="\\d+";

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
       /* Boolean chckmail=false;
        Boolean chckpass=false;*/
        SharedPreferences sharedPreferences=getSharedPreferences("laxmi",Context.MODE_PRIVATE);
        String email=sharedPreferences.getString("email","value");
        String password=sharedPreferences.getString("password","000");
        pattern=Pattern.compile(EMAIL_PATTERN);
        matcher=pattern.matcher(editTextEmail.getText().toString());


        if(editTextEmail.getText().toString().length()==0){
            editTextEmail.setError("Email should not empty");
            editTextEmail.requestFocus();
            //editTextPassword.setError("Valid pswrd");
        }
        else if(matcher.matches()){

        }
        else{
            editTextEmail.setError("invalid Mail");
            editTextEmail.requestFocus();
        }
        patern1=Pattern.compile(Password_Pattern);
        matcher2=patern1.matcher(editTextPassword.getText().toString());
        if(editTextPassword.getText().toString().length()==0){
            editTextPassword.setError("Password should not empty");
            editTextPassword.requestFocus();
        }
        else if(matcher2.matches()){

            //Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
           // editTextPassword.setError("correct");
        }
        else{
            editTextPassword.setError("invalid Password");
            editTextPassword.requestFocus();
        }

        if(editTextEmail.getText().toString().equalsIgnoreCase(email) && editTextPassword.getText().toString().equals(password+"")) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(this, Welcome.class);
            startActivity(intent1);
        }
        else {
            Toast.makeText(getApplicationContext(),"Enter Correct Details Or Register ",Toast.LENGTH_SHORT).show();

        }
    }

   /* private boolean isValidEmail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
*/
    public void Register(View view){
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);


    }
}
