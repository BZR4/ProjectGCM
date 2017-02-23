package com.esdras.projectgcm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.esdras.projectgcm.fragments.TabOne;
import com.esdras.projectgcm.fragments.TabThree;
import com.esdras.projectgcm.fragments.TabTwo;

/**
 * Created by esdras on 17/01/17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            //TODO: Inplementar as Classes referentes a Tabs
            case 0:
                TabOne tab1 = new TabOne();
                return tab1;
            case 1:
                TabTwo tab2 = new TabTwo();
                return tab2;
            case 2:
                TabThree tab3 = new TabThree();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
