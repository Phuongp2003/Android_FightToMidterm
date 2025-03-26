package com.example.fighttomidterm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import android.widget.BaseAdapter;

import java.util.List;

public class MyObjectAdapter extends BaseAdapter {
    private Context context;
    private List<MyObject> objectList;

    public MyObjectAdapter(Context context, List<MyObject> objectList) {
        this.context = context;
        this.objectList = objectList;
    }

    @Override
    public int getCount() {
        return objectList.size();
    }

    @Override
    public Object getItem(int position) {
        return objectList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_grid, parent, false);
        }

        MyObject currentItem = objectList.get(position);

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView titleView = convertView.findViewById(R.id.titleView);

        imageView.setImageResource(currentItem.getImageResId());
        titleView.setText(currentItem.getTitle());
        convertView.setBackgroundColor(currentItem.getBackgroundColor());

        return convertView;
    }
}