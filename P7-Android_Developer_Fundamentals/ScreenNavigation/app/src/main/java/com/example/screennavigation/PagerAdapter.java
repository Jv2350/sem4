package com.example.screennavigation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class PagerAdapter  extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList;
    private final List<String> fragmentTitles;

    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> fragmentTitles){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentList=fragmentList;
        this.fragmentTitles=fragmentTitles;
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles.get(position);
    }
}
