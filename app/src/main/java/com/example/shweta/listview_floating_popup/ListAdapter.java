package com.example.shweta.listview_floating_popup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shweta on 7/1/2017.
 */
public class ListAdapter extends BaseAdapter{
    String[] result;
    Context context;
    int[] imageid;
    private static LayoutInflater inflater=null;
    public ListAdapter(Context context,int[] imageid,String[] result){
        this.context=context;
        this.result=result;
        this.imageid=imageid;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class Holder {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.listdata, null);
        holder.tv = (TextView) rowView.findViewById(R.id.TextView);
        holder.img= (ImageView) rowView.findViewById(R.id.ImageView);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageid[position]);
        return rowView;
    }





}

