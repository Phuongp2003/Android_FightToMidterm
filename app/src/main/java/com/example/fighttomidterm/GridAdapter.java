package com.example.fighttomidterm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends BaseAdapter {
    private final Context context;
    private final List<MyObject> objects;

    public GridAdapter(Context context, List<MyObject> objects) {
        this.context = context;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_v2, parent, false);
        }

        MyObject obj = objects.get(position);

        TextView titleView = convertView.findViewById(R.id.item_title);
        ImageView imageView = convertView.findViewById(R.id.item_image);

        titleView.setText(obj.getTitle());
        imageView.setImageResource(obj.getImageResId());

        // Áp dụng màu nền từ MyObject
        convertView.setBackgroundColor(obj.getBackgroundColor());

        return convertView;
    }
}
