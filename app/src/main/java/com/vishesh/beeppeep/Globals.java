package com.vishesh.beeppeep;

import android.app.Application;

public class Globals extends Application {

    private int speedLimit;

    public int getSpeedLimit(){
        return this.speedLimit;
    }

    public void setSpeedLimit(int s)
    {
        this.speedLimit =s;
    }
}
