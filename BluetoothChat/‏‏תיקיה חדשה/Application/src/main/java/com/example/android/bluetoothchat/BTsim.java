package com.example.android.bluetoothchat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by User on 04/05/2017.
 */



public class BTsim {
    private  int min_val ;
    private  int max_val ;

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
    public  int giveMeHyper(int lastSug)// simulates high sugar levels
    {
        int min = lastSug -10, max = lastSug+30;
        Random r = new Random();
        if(min < 130 ) min = 130;
        if(max > 250 ) max = 250;

        return r.nextInt(max+1 - min) + min;
    }

    public String GetTime()
    {
        return DateFormat.getDateTimeInstance().format(new Date());
    }
}
