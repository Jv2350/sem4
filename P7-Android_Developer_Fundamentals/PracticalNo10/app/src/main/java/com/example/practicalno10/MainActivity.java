package com.example.practicalno10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
//import androidx.viewpager.widget.PagerAdapter;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new BlankFragment2());
        fragmentList.add(new BlankFragment3());

        List<String>fragmentTitles = new ArrayList<>();
        fragmentTitles.add("Tab one");
        fragmentTitles.add("Tab two");

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), fragmentList, fragmentTitles);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}