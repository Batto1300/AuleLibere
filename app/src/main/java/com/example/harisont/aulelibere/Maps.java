package com.example.harisont.aulelibere;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Maps extends AppCompatActivity {
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    ImageView view=null;
    Room A0=new Room(3, (ImageView)view.findViewById(R.id.agm1), (ImageView)view.findViewById(R.id.arm1));
    Room A2=new Room(4, (ImageView)view.findViewById(R.id.ag1), (ImageView)view.findViewById(R.id.ar1));
    Room B1=new Room(6, (ImageView)view.findViewById(R.id.bg1), (ImageView)view.findViewById(R.id.br1));
    Room A2bis=new Room(4, (ImageView)view.findViewById(R.id.ag2), (ImageView)view.findViewById(R.id.ar2));
    Room B2=new Room(100, (ImageView)view.findViewById(R.id.bg2), (ImageView)view.findViewById(R.id.br2));
    Room C2=new Room(8, (ImageView)view.findViewById(R.id.cg2), (ImageView)view.findViewById(R.id.cr2));
    Room D2=new Room(101, (ImageView)view.findViewById(R.id.dg2), (ImageView)view.findViewById(R.id.dr2));
    Room A3=new Room(5, (ImageView)view.findViewById(R.id.ag3), (ImageView)view.findViewById(R.id.ar3));
    Room B3=new Room(7, (ImageView)view.findViewById(R.id.bg3), (ImageView)view.findViewById(R.id.br3));
    Room C3=new Room(13, (ImageView)view.findViewById(R.id.cg3), (ImageView)view.findViewById(R.id.cr3));
    Room AS=new Room(102, (ImageView)view.findViewById(R.id.ag4), (ImageView)view.findViewById(R.id.ar4));
    Room BB=new Room(103, (ImageView)view.findViewById(R.id.bg4), (ImageView)view.findViewById(R.id.br4));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mappe);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mappe, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            switch (position) {
                case 0:
                    Room floormin1_rooms[]; floormin1_rooms=new Room[]{A0};
                    return new Floor(floormin1_rooms, R.layout.floormin1);
                case 1:
                    Room floor1_rooms[]; floor1_rooms=new Room[]{A2, B1};
                    return new Floor(floor1_rooms, R.layout.floor1);
                case 2:
                    Room floor2_rooms[]; floor2_rooms=new Room[]{A2bis, B2, C2, D2};
                    return new Floor(floor2_rooms, R.layout.floor2);
                case 3:
                    Room floor3_rooms[]; floor3_rooms=new Room[]{A3, B3, C3};
                    return new Floor(floor3_rooms, R.layout.floor3);
                case 4:
                    Room floor4_rooms[]; floor4_rooms=new Room[]{AS, BB};
                    return new Floor(floor4_rooms, R.layout.floor4);
                case 5:
                    Room floor5_rooms[]; floor5_rooms=new Room[]{};
                    return new Floor(floor5_rooms, R.layout.floor5);
                case 6:
                    Room floor6_rooms[]; floor6_rooms=new Room[]{};
                    return new Floor(floor6_rooms, R.layout.floor6);
                default: return null;
            }
        }

        @Override
        public int getCount() {
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "PIANO -1";
                case 1:
                    return "PIANO 1";
                case 2:
                    return "PIANO 2";
                case 3:
                    return "PIANO 3";
                case 4:
                    return "PIANO 4";
                case 5:
                    return "PIANO 5";
                case 6:
                    return "PIANO 6";
            }
            return null;
        }
    }
}
