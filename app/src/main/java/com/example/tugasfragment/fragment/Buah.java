package com.example.tugasfragment.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tugasfragment.R;

public class Buah extends Fragment {

    public Buah() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buah, container, false);
        String[] listBuah = {"Aple", "Jeruk", "Mangga", "Pepaya", "Jambu", "Pisang", "Durian"};

        ListView ListView = (ListView) view.findViewById(R.id.listBuah);

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                listBuah
        );
        ListView.setAdapter(ListViewAdapter);

        return view;
    }
}
