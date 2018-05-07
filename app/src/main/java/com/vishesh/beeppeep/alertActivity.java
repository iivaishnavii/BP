package com.vishesh.beeppeep;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class alertActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar simpleSeekBar;
    TextView mprogressText;
    Globals g=(Globals)getApplication();
    int selectedProgressValue;
    Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        mprogressText = (TextView)findViewById(R.id.progress);

        simpleSeekBar = (SeekBar) findViewById(R.id.seekBar);



        simpleSeekBar.setOnSeekBarChangeListener(this);
        simpleSeekBar.setProgress(selectedProgressValue);

        button=findViewById(R.id.save);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));
    }


    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
        int val = (progress * (seekBar.getWidth() - 2 * seekBar.getThumbOffset())) / seekBar.getMax();
        mprogressText.setText("" + progress+"km/hour");
        mprogressText.setX(seekBar.getX() + val + seekBar.getThumbOffset() / 2);
        g.setSpeedLimit(progress);
        selectedProgressValue = progress;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    public void onStopTrackingTouch(SeekBar seekBar) {

    }





}
