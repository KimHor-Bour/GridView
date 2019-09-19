package com.android.grid.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.gridview.R;

public class ImageAdapterTap1 extends BaseAdapter {

    private int[] image_id = {R.drawable.citocafe,R.drawable.cafelatte,R.drawable.cappuccino,R.drawable.cinnamon_coconut_cafe,R.drawable.colcafe,R.drawable.expresso,R.drawable.longblack,R.drawable.matchalatte};
    Context ctx;
    ImageAdapterTap1(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_id.length;
    }

    @Override
    public Object getItem(int i) {
        return image_id[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;
        if(gridView ==null){
            LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_image_layout,null);

        }
        ImageView i1 = (ImageView)gridView.findViewById(R.id.myimage);
        i1.setImageResource(image_id[i]);
        return gridView;
    }
}
