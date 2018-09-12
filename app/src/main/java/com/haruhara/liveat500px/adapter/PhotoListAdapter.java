package com.haruhara.liveat500px.adapter;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.haruhara.liveat500px.view.PhotoListItem;

public class PhotoListAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return 100000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // how many type of view
    @Override
    public int getViewTypeCount() {
        return 2;
    }

    // get type (before get content)
    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? 0 : 1;
        // photo is 0, 2, 4, ... so %2 return 0, otherwise textview return 1
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (getItemViewType(position) == 0) {
            PhotoListItem item;
            if (convertView != null)
                item = (PhotoListItem) convertView;
            else
                item = new PhotoListItem(parent.getContext());
            return item;
        } else {
            TextView item;
            if (convertView != null)
                item = (TextView) convertView;
            else
                item = new TextView(parent.getContext());
            item.setText("Position : " + position);
            return item;
        }
    }
}
