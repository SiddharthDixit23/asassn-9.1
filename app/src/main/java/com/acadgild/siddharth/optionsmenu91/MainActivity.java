package com.acadgild.siddharth.optionsmenu91;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        mtv = (TextView)findViewById(R.id.tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater men = getMenuInflater();
        men.inflate(R.menu.menuu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId = item.getItemId();
        if (menuId == R.id.red) {
            mtv.setTextColor(getResources().getColor(R.color.Red));
            Toast.makeText(getApplicationContext(), "Red", Toast.LENGTH_SHORT).show();
        }
            else if (menuId == R.id.green) {
            mtv.setTextColor(getResources().getColor(R.color.Green));
            Toast.makeText(getApplicationContext(), "Green", Toast.LENGTH_SHORT).show();
        }
            else if (menuId == R.id.blue) {
            mtv.setTextColor(getResources().getColor(R.color.Blue));
            Toast.makeText(getApplicationContext(), "Blue", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
