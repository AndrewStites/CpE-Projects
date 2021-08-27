package com.example.a3e8;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

public class Track implements GameObject {

    //private Rect segmentType;
    //private int color;

    private float fDistance = 0.0f;			// Distance car has travelled around track
    private float fCurvature = 0.0f;		// Current track curvature, lerped between track sections
    private int m_nScreenWidth = Constants.WIDTH;
    private int m_nScreenHeight = Constants.HEIGHT;
    private int m_bufScreen = m_nScreenWidth*m_nScreenHeight;
    private float fTrackCurvature = 0.0f;	// Accumulation of track curvature
    private float fTrackDistance = 0.0f;	// Total distance of track

    private float fCarPos = 0.0f;			// Current car position
    private float fPlayerCurvature = 0.0f;			// Accumulation of player curvature
    private float fSpeed = 0.0f;			// Current player speed


   /* public Track(Rect segmentType, int color) {
        this.segmentType = segmentType;
        this.color = color;
    }*/

   //messing with Rectangle class in conjunction here

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        //paint.setColor(color);
        //canvas.drawRect(segmentType, paint);
    }

    @Override
    public void update() {

        // Draw Track - Each row is split into grass, clip-board and track
        for (int y = 0; y < Constants.HEIGHT / 2; y++)
            for (int x = 0; x < Constants.WIDTH; x++)
            {
                // Perspective is used to modify the width of the track row segments
                float fPerspective = (float)y / (Constants.HEIGHT/2.0f);
                float fRoadWidth = 0.1f + fPerspective * 0.8f; // Min 10% Max 90%
                float fClipWidth = fRoadWidth * 0.15f;
                fRoadWidth *= 0.5f;	// Halve it as track is symmetrical around center of track, but offset...

                // ...depending on where the middle point is, which is defined by the current
                // track curvature.
                float fMiddlePoint = (float) (0.5f + fCurvature * Math.pow(1.0d - fPerspective, 3));

                // Work out segment boundaries
                int nLeftGrass = (int) ((fMiddlePoint - fRoadWidth - fClipWidth) * Constants.WIDTH);
                int nLeftClip = (int) ((fMiddlePoint - fRoadWidth) * Constants.WIDTH);
                int nRightClip = (int) ((fMiddlePoint + fRoadWidth) * Constants.WIDTH);
                int nRightGrass = (int) ((fMiddlePoint + fRoadWidth + fClipWidth) * Constants.WIDTH);

                int nRow = Constants.HEIGHT / 2 + y;

                // Using periodic oscillatory functions to give lines, where the phase is controlled
                // by the distance around the track. These take some fine tuning to give the right "feel"
                int nGrassColour = Math.sin(20.0f * Math.pow(1.0d - fPerspective, 3) + fDistance * 0.1f) > 0.0f ? Color.rgb(0, 150,0) : Color.rgb(0, 255,0);
                int nClipColour = Math.sin(80.0f * Math.pow(1.0d - fPerspective, 2) + fDistance) > 0.0f ? Color.RED : Color.WHITE;
                int nRoadColour = Color.rgb(255, 255,255);

                // Start finish straight changes the road colour to inform the player lap is reset
                //int nRoadColour = (nTrackSection-1) == 0 ? FG_WHITE : FG_GREY;

                // Draw the row segments
                if (x >= 0 && x < nLeftGrass)
                    Draw(x, nRow,  nGrassColour);
                if (x >= nLeftGrass && x < nLeftClip)
                    Draw(x, nRow,  nClipColour);
                if (x >= nLeftClip && x < nRightClip)
                    Draw(x, nRow,  nRoadColour);
                if (x >= nRightClip && x < nRightGrass)
                    Draw(x, nRow,  nClipColour);
                if (x >= nRightGrass && x < Constants.WIDTH)
                    Draw(x, nRow,  nGrassColour);



            }

    }

    public void Draw(int x, int y,  int color)
    {
        if (x >= 0 && x < m_nScreenWidth && y >= 0 && y < m_nScreenHeight)
        {
                //segment = new Track(new Rect( 10, 10, 20, 20), color);
        }

    }
}
