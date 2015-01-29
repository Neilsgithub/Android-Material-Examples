package com.saulmm.material.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.saulmm.material.R;

/**
 * Created by Peter.Ding on 2015/1/29.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_color).setOnClickListener(mOnClicklistener);
        findViewById(R.id.btn_sliding).setOnClickListener(mOnClicklistener);
        findViewById(R.id.btn_dialer).setOnClickListener(mOnClicklistener);
        findViewById(R.id.btn_transition).setOnClickListener(mOnClicklistener);
        findViewById(R.id.btn_elevation).setOnClickListener(mOnClicklistener);
    }

    private View.OnClickListener mOnClicklistener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_color:
                    intent = new Intent(MainActivity.this, ColorActivity.class);
                    break;
                case R.id.btn_dialer:
                    intent = new Intent(MainActivity.this, DialerSampleActivity.class);
                    break;
                case R.id.btn_elevation:
                    intent = new Intent(MainActivity.this, ElevationSampleActivity.class);
                    break;
                case R.id.btn_sliding:
                    intent = new Intent(MainActivity.this, SlidingActivity.class);
                    break;
                case R.id.btn_transition:
                    intent = new Intent(MainActivity.this, TransitionFirstActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}
