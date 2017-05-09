package com.example.user.glcdemoui;

import android.app.Fragment;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.GridLabelRenderer;

/**
 * Created by User on 04/04/2017.
 */

public class MainFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.content_main, container, false);
        GraphView graph = (GraphView) myView.findViewById(R.id.graph);
        double max = 2;
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 130),
                new DataPoint(1, 150),
                new DataPoint(max, 142)
        });
        LineGraphSeries<DataPoint> dotLine = new LineGraphSeries<>();
        for(int i = 0; i<28;i++) {
         dotLine.appendData(new DataPoint((double)(((double)i)*max/24),200.0),false,1000);
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0);
        paint.setColor(Color.RED);
        dotLine.setCustomPaint(paint);
        graph.getGridLabelRenderer().setGridStyle(GridLabelRenderer.GridStyle.NONE);
        graph.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graph.getGridLabelRenderer().setVerticalLabelsVisible(false);
        series.setColor(Color.WHITE);
        dotLine.setDrawDataPoints(true);
        dotLine.setDataPointsRadius(3);
        graph.addSeries(dotLine);
        graph.addSeries(series);
        return myView;
    }
}