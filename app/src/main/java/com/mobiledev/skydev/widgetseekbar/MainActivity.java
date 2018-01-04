package com.mobiledev.skydev.widgetseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekBar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar1=(SeekBar)findViewById(R.id.seekbar1);
        seekBar1.setOnSeekBarChangeListener(this);
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        Toast.makeText(getApplicationContext(),"seekbar proses: "+progress, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbar mulai!", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbar berhenti!", Toast.LENGTH_SHORT).show();
    }

}