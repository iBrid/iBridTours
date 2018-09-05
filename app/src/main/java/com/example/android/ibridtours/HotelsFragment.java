package com.example.android.ibridtours;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content("Eko Hotel & Suites", "A 5-star conference centre hotel located in Lagos Island with top notch cuisines.", R.drawable.eko_hotels_suites));
        contents.add(new Content("Sheraton Hotel", "Located in Ikeja, provides access to free wifi and complementary breakfast.", R.drawable.sheraton));
        contents.add(new Content("Protea Hotel", "Provides undeniably great service, continental cuisine, and superb shopping experience.", R.drawable.protea_hotel));
        contents.add(new Content("Oriental Hotel", "A Chinese restaurant that makes you feel an atmosphere of dynamic modernity.", R.drawable.oriental_hotel));
        contents.add(new Content("Four Points by Sheraton", "Boasting a terrace and a bar, four points is set in the heart of lagos.", R.drawable.four_points));
        contents.add(new Content("Hotel ibis", "A 3-star hotel in Ikeja which is nearby the international airport.", R.drawable.ibis_hotel));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);
        ListView listView = rootView.findViewById(R.id.content);
        listView.setAdapter(adapter);
        return rootView;
    }

}
