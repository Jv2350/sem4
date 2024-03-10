package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
//import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

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
        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());

        List<String> fragmentTitles = new ArrayList<>();
        fragmentTitles.add("Tab One");
        fragmentTitles.add("Tab Two");

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), fragmentList, fragmentTitles);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}