package com.example.a3e8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback
{
    private MainThread thread;

    private Rectangle lilRectangle;
    private Point rectPoint;

    public GamePanel(Context context)
    {
        super(context);

        getHolder().addCallback(this);

        thread = new MainThread(getHolder(), this);

        lilRectangle = new Rectangle(new Rect(100, 100, 200, 200), Color.MAGENTA);
        rectPoint = new Point(Constants.WIDTH / 2, Constants.HEIGHT / 2);

        setFocusable(true);
    }



    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)
    {

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder)
    {
        thread = new MainThread(getHolder(), this);
        thread.setRunning(true);
        thread.start();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){
        boolean retry = true;

        while(retry){
            try{
                thread.setRunning(false);
                thread.join();
                //if fails, then it prints telling us what went wrong
            }catch(Exception e){e.printStackTrace();}
            retry = false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //Needs more work with following finger
        //Fixed by returning just true
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                rectPoint.set((int)event.getX(), (int) (Constants.HEIGHT / 1.18));

        }

        return true;
        //return super.onTouchEvent(event);
    }

    public void update()
    {
        lilRectangle.update(rectPoint);
    }

    @Override
    public void draw(Canvas canvas)
    {
        super.draw(canvas);

        canvas.drawColor(Color.rgb(135, 206, 235));

        lilRectangle.draw(canvas);
    }


}