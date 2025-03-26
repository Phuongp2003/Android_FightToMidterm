package com.example.fighttomidterm;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import androidx.core.content.ContextCompat;

public class FragmentTwo extends Fragment {
    private GridView gridView;
    private List<MyObject> objectList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        gridView = view.findViewById(R.id.gridView);


        objectList = new ArrayList<>();
        objectList.add(new MyObject(
                "Item 1",
                "Description 1",
                R.drawable.sample_1,
                ContextCompat.getColor(getContext(), R.color.bg_item_1)
        ));
        objectList.add(new MyObject(
                "Item 2",
                "Description 2",
                R.drawable.sample_2,
                ContextCompat.getColor(getContext(), R.color.bg_item_2)
        ));
        objectList.add(new MyObject(
                "Item 3",
                "Description 3",
                R.drawable.sample_3,
                ContextCompat.getColor(getContext(), R.color.bg_item_3)
        ));

        // Gán adapter
        MyObjectAdapter adapter = new MyObjectAdapter(getContext(), objectList);
        gridView.setAdapter(adapter);

        // Xử lý sự kiện khi nhấn vào item
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyObject selectedItem = objectList.get(position);

                // Mở DetailActivity
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("title", selectedItem.getTitle());
                intent.putExtra("description", selectedItem.getDescription());
                intent.putExtra("imageResId", selectedItem.getImageResId());
                startActivity(intent);
            }
        });

        return view;
    }
}