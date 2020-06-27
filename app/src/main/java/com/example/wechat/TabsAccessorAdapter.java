package com.example.wechat;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {
    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                CHATSFragment CHATSFragment = new CHATSFragment();
                return CHATSFragment;
            case 1:
                GROUPSFragment GROUPSFragment = new GROUPSFragment();
                return GROUPSFragment;
            case 2:
                CALLSFragment CALLSFragment = new CALLSFragment();
                return CALLSFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return "Chats";

            case 1:
                return "Groups";

            case 2:
                return "calls";

            default:
                return null;
        }
    }
}