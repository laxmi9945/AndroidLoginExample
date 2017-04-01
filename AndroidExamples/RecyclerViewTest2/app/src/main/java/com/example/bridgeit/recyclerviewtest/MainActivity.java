package com.example.bridgeit.recyclerviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isGrid = true;
    GridView gridview;
    ImageAdapter imageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = (GridView) findViewById(R.id.gridview);
        ListView listView=(ListView)findViewById(R.id.listview);
        gridview.setNumColumns(3);

        imageAdapter = new ImageAdapter(this);

        gridview.setAdapter(imageAdapter);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_viewchange:

                if(isGrid){
                    gridview.setNumColumns(1);
                    imageAdapter.notifyDataSetChanged();
                    isGrid = false;
                }
                else{
                    gridview.setNumColumns(3);
                    imageAdapter.notifyDataSetChanged();
                    isGrid = true;
                }

                return true;
            case R.id.action_settings:
                Toast.makeText(this, "item Selectd", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_skip:
                Toast.makeText(this, "item Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
