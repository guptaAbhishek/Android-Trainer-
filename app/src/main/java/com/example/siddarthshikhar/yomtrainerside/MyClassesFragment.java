package com.example.siddarthshikhar.yomtrainerside;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MyClassesFragment extends Fragment {

    public MyClassesFragment() {
        // Required empty public constructor
    }
    Context c;
    ArrayList<YogaClass> upcomingClasses;
    GetConsumer getConsumer;
    UpcomingClassesAdapter adapter;
    ListView lv;
    int headerLocations[];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_my_classes, container, false);

        adapter = new UpcomingClassesAdapter(c,0,upcomingClasses,getLayoutInflater(savedInstanceState),getFragmentManager(),headerLocations);
        lv=(ListView)v.findViewById(R.id.upcoming_classes_list);
        lv.setAdapter(adapter);
        return v;
    }
}
