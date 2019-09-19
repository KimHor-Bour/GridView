package com.android.grid.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.grid.R;

public class MainActivity extends AppCompatActivity {
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
