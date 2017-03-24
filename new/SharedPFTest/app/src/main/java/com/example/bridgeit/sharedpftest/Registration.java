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
 * Created by bridgeit on 18/3/17.
 */

public class Registration extends AppCompatActivity {
    EditText editTextName,editTextEmail,editTextPassword;
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        button=(Button)findViewById(R.id.save_button);
        editTextName=(EditText)findViewById(R.id.EditTExtName);
        editTextEmail=(EditText)findViewById(R.id.EditTextEmail);
        editTextPassword=(EditText)findViewById(R.id.EdiTextPassword);
    }

    public void Save(View view)

    {
        Toast.makeText(this,"Registration Complited..",Toast.LENGTH_SHORT).show();
    }
    public void BackToLogin(View view){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
}
