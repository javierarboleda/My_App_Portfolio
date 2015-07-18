package com.javierarboleda.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showButtonClickToast(View buttonView) {
        switch(buttonView.getId()) {
            case R.id.popular_movie_button:
                showToast("This button will launch my Popular Movies app!");
                break;
            case R.id.super_duo_button:
                showToast("This button will launch my Super Duo app!");
                break;
            case R.id.build_it_bigger_button:
                showToast("This button will launch my Build It Bigger app!");
                break;
            case R.id.xyz_reader_button:
                showToast("This button will launch my XYZ Reader app!");
                break;
            case R.id.capstone_button:
                showToast("This button will launch my Capstone app!");
                break;
        }
    }

    private void showToast(String toastMessage) {
        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        // following code for centering text in a toast I borrowed from
        // http://stackoverflow.com/questions/3522023/center-text-in-a-toast-in-android
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if( v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }
}
