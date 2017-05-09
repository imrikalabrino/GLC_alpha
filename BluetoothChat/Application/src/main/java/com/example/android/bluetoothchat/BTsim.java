package com.example.android.bluetoothchat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 04/05/2017.
 */



public class BTsim {
    private  int min_val ;
    private  int max_val ;
    private  int state;

    public BTsim(int min_val, int max_val) {
        this.min_val = min_val;
        this.max_val = max_val;
    }

    public int GetSugarLevel(int lastSug){
        int min = lastSug - 15, max = lastSug+20;
        Random r = new Random();
        if(min < min_val ) min = min_val;
        if(max > max_val ) max = max_val;

        return r.nextInt(max+1 - min) + min;
    }
    public int giveMeHypo(int lastSug) // simulates low sugar level
    {
        int min = lastSug - 30, max = lastSug+10;
        Random r = new Random();
        if(min < 40 ) min = 40;
        if(max > 120 ) max = 120;

        return r.nextInt(max+1 - min) + min;
    }
    public  int giveMeHyper(int lastSug){// simulates high sugar levels
        int min = lastSug -10, max = lastSug+30;
        Random r = new Random();
        if(min < 130 ) min = 130;
        if(max > 250 ) max = 250;

        return r.nextInt(max+1 - min) + min;
    }
    public int normal(int lastSug) {
        int min = lastSug - 15, max = lastSug+20;
        Random r = new Random();
        if(min < 30 ) min = 30;
        if(max > 270 ) max = 270;

        return r.nextInt(max+1 - min) + min;
    }
    public String GetTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
        return sdf.format(cal.getTime());
    }
}
