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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content("Felabration", "An annual music concert conceived in 1998 in honor of afro music icon, Fela Kuti."));
        contents.add(new Content("Lagos international food and beverage fair.", "This event focuses on the whole Food And Beverage value chain."));
        contents.add(new Content("Nxtfin West Africa", "West Africa's leading banking & financial services innovation event."));
        contents.add(new Content("Lagos Fashion", "International fashion and ready-to-wear garments exhibition."));
        contents.add(new Content("The Business solution Expo", "Nigeria's largest event dedicated to the support of growing business and SMEs."));
        contents.add(new Content("Lagos international trade fair.", "International Trade Fair for Business Services."));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);
        ListView listView = rootView.findViewById(R.id.content);
        listView.setAdapter(adapter);

        return rootView;
    }
}
