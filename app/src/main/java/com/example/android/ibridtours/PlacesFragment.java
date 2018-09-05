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
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content("Lekki conservation center.", "Established in 1990, it is a natural conservation center in Lekki.", R.drawable.lekki_conser));
        contents.add(new Content("Fela's Shrine", "Venue for the great felabration event.", R.drawable.fela_shrine));
        contents.add(new Content("Elegushi Beach", "A Private beach in Lekki, owned by the elegushi royal family.", R.drawable.elegushi));
        contents.add(new Content("National museum", "A 5-star hotel in the heart of lagos", R.drawable.museum));
        contents.add(new Content("Muson center", "A music performance in the heart of Lagos. ", R.drawable.muson));
        contents.add(new Content("Freedom park", "A leisure and memorial park in the downtown side of Lagos.", R.drawable.freedompark));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);
        ListView listView = rootView.findViewById(R.id.content);
        listView.setAdapter(adapter);

        return rootView;
    }
}
