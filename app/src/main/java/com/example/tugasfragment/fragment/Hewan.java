package com.example.tugasfragment.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tugasfragment.R;

public class Hewan extends Fragment {

    public Hewan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hewan, container, false);
        String[] listHewan = {"Sapi", "Ayam", "Kerbau", "Kelinci", "Kuda", "Monyet", "Komodo"};

        ListView ListView = (ListView) view.findViewById(R.id.listHewan);

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                listHewan
        );
        ListView.setAdapter(ListViewAdapter);

        return view;
    }
}
