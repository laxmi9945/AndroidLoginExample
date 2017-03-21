package com.example.bridgeit.spftest;

import android.content.Context;
import android.content.SharedPreferences;
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

public class Registration extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4;
    Button buttonSave,buttonUpdate,buttonDelete;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        buttonSave=(Button)findViewById(R.id.saveButton);
        buttonUpdate=(Button)findViewById(R.id.updateButton);
        buttonDelete=(Button)findViewById(R.id.deleteButton);
    }
    public void Save(View view){
        editText1=(EditText)findViewById(R.id.et1);
        editText2=(EditText)findViewById(R.id.et2);
        editText3=(EditText)findViewById(R.id.et3);
        editText4=(EditText)findViewById(R.id.et4);
        SharedPreferences sharedPreferences=getSharedPreferences("laxmi", Context.MODE_PRIVATE);//MODE_PVT-file can access by calling the apps
        SharedPreferences.Editor spe=sharedPreferences.edit();//Saving data using SharedPreference.Editor class
        spe.putString("Username",editText1.getText().toString());
        spe.putString("email",editText2.getText().toString());
        spe.putString("password",editText3.getText().toString());
        spe.putString("mobileno",editText4.getText().toString());
        spe.commit();
        finish();
        Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_SHORT).show();
    }
    public void Update(View view){
        editText1=(EditText)findViewById(R.id.et1);
        editText1.getText().toString();
    }
    public void Delete(View view){

    }
}
