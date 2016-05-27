package com.freesoulapps.baseapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.freesoulapps.baseapplication.R;
import com.freesoulapps.baseapplication.fragments.SampleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, SampleFragment.newInstance()).commit();
    }
}
