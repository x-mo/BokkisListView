package com.example.xps.bokkislistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by XPS on 25/12/2015.
 */
public class BokkiListAdapter extends /*CursorAdapter*/ BaseAdapter {
    private String[] data;
    private Activity mContext;
    private LayoutInflater mLayoutInflater = null;

    public BokkiListAdapter(Activity context, String[] data) {
        mContext = context;
        this.data = data;
        mLayoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int layoutId = -1;
        switch (position) {
            case 0: {
                layoutId = R.layout.list_item_header;
                break;
            }
            default: {
                layoutId = R.layout.list_item;
                break;
            }
        }

        View view = LayoutInflater.from(mContext).inflate(layoutId, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);
        if (position > 0)
            viewHolder.tv.setText(data[position]);
        return view;
    }


    public static class ViewHolder {
        public final TextView tv;

        public ViewHolder(View view) {

            tv = (TextView) view.findViewById(R.id.list_item_textview);
        }

    }
}
