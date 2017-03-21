package com.example.bridgeit.sharedpftest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by bridgeit on 21/3/17.
 */

public class ResetPassword extends AppCompatActivity
{
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        setContentView(R.layout.resetpassword);
    }
}
