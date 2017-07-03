package com.example.sournary.viewpagertest1;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewPagerAdapter  adapter = new MainViewPagerAdapter();
        ViewPager viewPager = (ViewPager)findViewById(R.id.vp_main);

        viewPager.setAdapter(adapter);
    }
}
