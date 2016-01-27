package org.one2oneworld.k2kdictionary.view.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import org.one2oneworld.k2kdictionary.R;
import org.one2oneworld.k2kdictionary.view.fragment.VocabularyListFragment;
import org.one2oneworld.k2kdictionary.viewPagerAdapter;

public class MainActivity extends AppCompatActivity implements VocabularyListFragment.OnFragmentInteractionListener {
    Toolbar toolbar;
    TabLayout tabs;
    ViewPager vp;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabs = (TabLayout) findViewById(R.id.tabs);
        vp = (ViewPager) findViewById(R.id.viewpager);

        toolbar.setTitle(R.string.dict);
        setSupportActionBar(toolbar);

        vp.setAdapter(new viewPagerAdapter(getSupportFragmentManager()));
        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.setupWithViewPager(vp);
        tabs.removeAllTabs();
        tabs.addTab(tabs.newTab().setText("All"), 0);
        tabs.addTab(tabs.newTab().setText("Favourite"), 1);

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
