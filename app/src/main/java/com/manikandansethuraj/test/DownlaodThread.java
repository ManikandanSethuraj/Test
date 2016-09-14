package com.manikandansethuraj.test;

import android.util.Log;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-08-13.
 */
public class DownlaodThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            sleep(4000);
            Log.d("Download","Sleeping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
