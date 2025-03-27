package com.example.fighttomidterm;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentThree extends Fragment {
    private final List<Item> gridItems = new ArrayList<>();
    private final List<Item> listItems = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        GridView gridView = view.findViewById(R.id.grid_v2);
        ListView listView = view.findViewById(R.id.list_v2);

        // Dữ liệu mẫu
        List<MyObject> gridItems = new ArrayList<>();
        gridItems.add(new MyObject("Grid Item 1", "", R.drawable.sample_1, Color.BLUE));
        gridItems.add(new MyObject("Grid Item 2", "", R.drawable.sample_2, Color.LTGRAY));
        gridItems.add(new MyObject("Grid Item 3", "", R.drawable.sample_3, Color.MAGENTA));

        List<MyObject> listItems = new ArrayList<>();
        listItems.add(new MyObject("List Item 1", "Description A", R.drawable.sample_1, Color.WHITE));
        listItems.add(new MyObject("List Item 2", "Description B", R.drawable.sample_2, Color.DKGRAY));
        listItems.add(new MyObject("List Item 3", "Description C", R.drawable.sample_3, Color.MAGENTA));

        // Set adapters
        GridAdapter gridAdapter = new GridAdapter(requireContext(), gridItems);
        gridView.setAdapter(gridAdapter);

        ListAdapter listAdapter = new ListAdapter(requireContext(), listItems);
        listView.setAdapter(listAdapter);

        return view;
    }


}
