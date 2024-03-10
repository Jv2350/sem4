package com.example.practicalno10;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> fragmentTitles;

    public PagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList, List<String> fragmentTitles) {
        super(fm);
    }

    public void pagerAdapter(FragmentPagerAdapter fm , List<Fragment>fragmentList, List<String>fragmentTitles){
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentList=fragmentList;
        this.fragmentTitles=fragmentTitles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
