package com.project.examenfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GridFragmento extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.grid_fragmento, container,false);
        GridView gridView = (GridView) view.findViewById(R.id.grilla);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.paises, android.R.layout.simple_list_item_1);
        gridView.setAdapter(arrayAdapter);
        return view;

    }
}
