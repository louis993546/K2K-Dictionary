package org.one2oneworld.k2kdictionary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Louis on 19/1/16.
 */
public class viewPagerAdapter extends FragmentStatePagerAdapter {

    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return VocabularyListFragment.newInstance("1", "2");
    }

    @Override
    public int getCount() {
        return 2;
    }
}
