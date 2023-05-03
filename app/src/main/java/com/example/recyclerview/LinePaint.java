package com.example.recyclerview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LinePaint extends RecyclerView.ItemDecoration{
    public Paint paint;
    public LinePaint(){
this.paint = new Paint();
paint.setColor(Color.BLACK);
paint.setStrokeWidth(10);
    }
    @Override
    public void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state){
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View child = parent.getChildAt(i);
            View nextChild = parent.getChildAt(i + 1);
            canvas.drawCircle(child.getLeft()+250,child.getTop()+100,20,paint);
            canvas.drawLine(child.getLeft()+250, child.getTop()+120, nextChild.getLeft()+250, nextChild.getTop()+80, paint);
        }
    }
}

