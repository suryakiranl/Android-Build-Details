package com.motorola.env_vars.viewenvvariables;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ShowEnvVariablesActivity extends Activity {
    private TextView displayMessage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_env_variables);


        displayMessage = (TextView) findViewById(R.id.textId);

        updateDisplay("BOARD = " + Build.BOARD);
        updateDisplay("CPU_ABI = " + Build.CPU_ABI);
        updateDisplay("CPU_ABI2 = " + Build.CPU_ABI2);
        updateDisplay("DEVICE = " + Build.DEVICE);
        updateDisplay("DISPLAY = " + Build.DISPLAY);
        updateDisplay("FINGERPRINT = " + Build.FINGERPRINT);
        updateDisplay("HARDWARE = " + Build.HARDWARE);
        updateDisplay("HOST = " + Build.HOST);
        updateDisplay("ID = " + Build.ID);
        updateDisplay("MANUFACTURER = " + Build.MANUFACTURER);
        updateDisplay("MODEL = " + Build.MODEL);
        updateDisplay("PRODUCT = " + Build.PRODUCT);
        updateDisplay("RADIO = " + Build.RADIO);
        updateDisplay("SERIAL = " + Build.SERIAL);
        updateDisplay("TAGS = " + Build.TAGS);
        updateDisplay("TIME = " + Build.TIME);
        updateDisplay("TYPE = " + Build.TYPE);
        updateDisplay("USER = " + Build.USER);
    }

    private void updateDisplay(String message) {
        if(displayMessage == null) {
            return;
        }

        Log.d("ShowEnvVariablesActivity", message);
        CharSequence currMsg = displayMessage.getText();
        displayMessage.setText( currMsg + "\n>" + message );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_env_variables, menu);
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
}
