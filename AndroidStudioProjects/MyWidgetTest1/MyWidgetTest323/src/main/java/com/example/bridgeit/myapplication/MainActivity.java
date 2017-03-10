package com.example.bridgeit.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn,btn2;
    TextView textView;
    AutoCompleteTextView actv;
    ToggleButton tgl1,tgl2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText);
        textView=(TextView)findViewById(R.id.tv);
        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        actv=(AutoCompleteTextView)findViewById(R.id.auto);
        tgl1=(ToggleButton)findViewById(R.id.toggle1);
        tgl2=(ToggleButton)findViewById(R.id.toggle2);

        String[] str={"Algeria","Albania","Afghanistan"," Bangladesh"," Bhutan","Brazil","Canada","China","Colombia"," Denmark","Egypt","France","United States","Yemen","Zimbabwe"};
       ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,str);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.RED);
    }
    public void button(View view){

        textView.setText(et.getText().toString());
        Toast.makeText(getApplicationContext(),"Toast notify",Toast.LENGTH_SHORT).show();
    }
    public void button2(View view){
        StringBuilder builder=new StringBuilder();

        builder.append("ToggleButton1 : ").append(tgl1.getText());
        builder.append("\nToggleButton2 : ").append(tgl2.getText());
        Toast.makeText(getApplicationContext(),builder.toString(),Toast.LENGTH_SHORT).show();
    }

}
