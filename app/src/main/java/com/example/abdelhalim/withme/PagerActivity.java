package com.example.abdelhalim.withme;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        Fragment f1 = new ProfileFragment();
        Fragment f2 = new SearchFragment();
        Fragment f3 = new NotificationFragment();
        Fragment [] fragments = {f1,f2,f3};

        TabsAdapter tabsAdapterUser = new TabsAdapter(getSupportFragmentManager(),fragments);
        final ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(tabsAdapterUser);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }
        };
        actionBar.addTab(actionBar.newTab().setText("Profile").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Search").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Notification").setTabListener(tabListener));


        pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

    }
}
