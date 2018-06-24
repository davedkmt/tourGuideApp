package com.example.android.boraboratourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.restaurants1, getString(R.string.restaurantsname1), getString(R.string.restaurantsdesc1)));
        words.add(new Word(R.drawable.restaurants2, getString(R.string.restaurantsname2), getString(R.string.restaurantsdesc2)));
        words.add(new Word(R.drawable.restaurants3, getString(R.string.restaurantsname3), getString(R.string.restaurantsdesc3)));
        words.add(new Word(R.drawable.restaurants4, getString(R.string.restaurantsname4), getString(R.string.restaurantsdesc4)));
        words.add(new Word(R.drawable.restaurants5, getString(R.string.restaurantsname5), getString(R.string.restaurantsdesc5)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}

