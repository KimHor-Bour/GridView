package com.android.grid;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.grid.R;
import com.android.grid.gridview.ImageAdapterTap1;

public class gridView extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.myGrid1);

        ImageAdapterTap1 imageAdapterTap1 = new ImageAdapterTap1(this);
        gridView.setAdapter(imageAdapterTap1);
    }
}
