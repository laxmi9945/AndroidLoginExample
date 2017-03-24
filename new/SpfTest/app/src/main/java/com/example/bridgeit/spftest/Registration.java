package com.example.bridgeit.spftest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by bridgeit on 21/3/17.
 */

public class Registration extends AppCompatActivity {
    EditText edittextName,edittextemail,edittextpswrd,edittextmobNo;
    Button buttonSave,buttonUpdate,buttonDelete;
    String Name,Email,MobileNo,Password;
    boolean chkName=false;
    boolean chkMail=false;
    boolean chkPassword=false;
    boolean chkMobNo=false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        buttonSave=(Button)findViewById(R.id.saveButton);
        buttonUpdate=(Button)findViewById(R.id.updateButton);
        buttonDelete=(Button)findViewById(R.id.deleteButton);
        edittextName=(EditText)findViewById(R.id.et1);
        edittextemail=(EditText)findViewById(R.id.et2);
        edittextpswrd=(EditText)findViewById(R.id.et3);
        edittextmobNo=(EditText)findViewById(R.id.et4);
    }
    public void Save(View view){

        Name=edittextName.getText().toString();
        Email=edittextemail.getText().toString();
        Password=edittextpswrd.getText().toString();
        //Log.i("", "Save: "+Password);
        MobileNo=edittextmobNo.getText().toString();
        if (Name.isEmpty()) {
            edittextName.setError("First name not entered");
        }
        else{
            chkName=true;
        }

        if(Email.isEmpty()){
            edittextemail.setError("Email should not empty");
        }
        else if (!isValidEmail(Email)){
            edittextemail.setError("Invalid Email");
        }else{
            chkMail=true;
        }

        if (MobileNo.isEmpty()) {
            edittextmobNo.setError("Enter your mobile number");
        }
        else{
            chkMobNo=true;
        }

        if (edittextpswrd.getText().length()==0){
            edittextpswrd.setError("Password should not blank");
        }
        else if(edittextpswrd.getText().length()<4){
            edittextpswrd.setError("The password should contain at least 4 numbers");
        }
        else {
            chkPassword=true;
        }

        if (chkName && chkMail && chkMobNo && chkPassword){
            SharedPreferences sharedPreferences=getSharedPreferences("laxmi", Context.MODE_PRIVATE);//MODE_PVT-file can access by calling the apps
            SharedPreferences.Editor shEditor=sharedPreferences.edit();//Saving data using SharedPreference.Editor class
            shEditor.putString("Username",edittextName.getText().toString());
            shEditor.putString("email",edittextemail.getText().toString());
            shEditor.putString("password",edittextpswrd.getText().toString()+"");
            shEditor.putString("mobileno",edittextmobNo.getText().toString());
            shEditor.commit();
            Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_SHORT).show();
            //Toast.makeText(Registration.this, "Data submitted Succcessfully..", Toast.LENGTH_SHORT).show();
            Intent i = new Intent( Registration.this,MainActivity.class);
            startActivity(i);
            finish();
        }

    }

    public void Update(View view){

    }
    public void Delete(View view){

    }
    private static boolean isValidEmail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
