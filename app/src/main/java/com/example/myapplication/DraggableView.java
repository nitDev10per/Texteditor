package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;


public class DraggableView extends RelativeLayout implements View.OnTouchListener {

    private float lastX;
    private float lastY;

    public DraggableView(Context context) {
        super(context);
        init();
    }

    public DraggableView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DraggableView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        float x = event.getRawX();
        float y = event.getRawY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;

            case MotionEvent.ACTION_MOVE:
                float deltaX = x - lastX;
                float deltaY = y - lastY;

                float newX = view.getX() + deltaX;
                float newY = view.getY() + deltaY;

                view.setX(newX);
                view.setY(newY);

                lastX = x;
                lastY = y;
                break;
        }

        return true;
    }
}
