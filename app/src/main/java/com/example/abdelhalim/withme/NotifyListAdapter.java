package com.example.abdelhalim.withme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by abdelhalim on 08/10/16.
 */

public class NotifyListAdapter extends BaseAdapter {
    private Context mContext;

    public Integer[] mThumbIds = new Integer[100];

    public NotifyListAdapter(Context c, Integer[] mThumbIds) {
        mContext = c;
        this.mThumbIds = mThumbIds;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_notivy,null);
        }
//        ImageView imageView1 = (ImageView) convertView.findViewById(R.id.user_image);
//        imageView1.setImageResource(mThumbIds[position]);
        return convertView;
    }
}
