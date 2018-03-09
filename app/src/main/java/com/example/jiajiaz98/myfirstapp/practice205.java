package com.example.jiajiaz98.myfirstapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

// code from https://stackoverflow.com/questions/16650419/draw-in-canvas-by-finger-android

public class practice205 extends AppCompatActivity {

    // Declare DrawingView object
    DrawingView dv;

    // Declare Paint object
    private Paint mPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Drawing View initialization
        dv = new DrawingView(this);

        // Set the Content View to be the Drawing View layout
        setContentView(dv);

        // Instantiate drawing Paint object
        mPaint = new Paint();

        // Set path properties
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);

        // Set paint color to be black
        mPaint.setColor(Color.BLACK);

        // Set paint properties for smoother drawing appearance
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);

        // Set size of stroke
        mPaint.setStrokeWidth(20);
    }

    public class DrawingView extends View {

        // Declare objects needed for drawing view
        private Bitmap mBitmap;
        private Canvas mCanvas;
        private Path mPath;
        private Paint mBitmapPaint;
        Context context;
        private Paint pronunciationPaint;
        private Paint circlePaint;
        private Path circlePath;

        public DrawingView(Context c) {
            super(c);
            context = c;

            // Instantiate drawing Path object
            mPath = new Path();

            // Create a new paint with a flag that enables dithering when blitting
            mBitmapPaint = new Paint(Paint.DITHER_FLAG);
            pronunciationPaint = new Paint(Paint.DITHER_FLAG);

            // Instantiate drawing Paint object
            circlePaint = new Paint();

            // Instantiate drawing Path
            circlePath = new Path();

            // Smooths out edges of what is being drawn
            circlePaint.setAntiAlias(true);

            // Set paint color to blue
            circlePaint.setColor(Color.BLUE);

            // Set paint style to be stroke
            circlePaint.setStyle(Paint.Style.STROKE);

            // Set the outer edges of a join meet at a sharp angle
            circlePaint.setStrokeJoin(Paint.Join.MITER);

            // Set stroke width to 4f
            circlePaint.setStrokeWidth(4f);
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);

            // Construct a bitmap with specified width, height, and store each pixel in 4 bytes.
            mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);

            // Construct a canvas with the specified bitmap to draw into
            mCanvas = new Canvas(mBitmap);
        }

        // Renders custom user interface with defined methods
        @Override
        protected void onDraw(Canvas canvas) {

            // Set text size to 1300
            mBitmapPaint.setTextSize(1300);
            pronunciationPaint.setTextSize(200);

            // Set color to gray
            mBitmapPaint.setColor(Color.GRAY);

            // Set text to be aligned in the center horizontally
            mBitmapPaint.setTextAlign(Paint.Align.CENTER);
            int xPos = (canvas.getWidth() / 2);

            // Set text to be in center vertically
            int yPos = 1400;

            // Draw text on canvas at specified x,y positions
            canvas.drawText("ጹ", xPos, yPos, mBitmapPaint);
            canvas.drawText("tsu", xPos - 120, yPos + 200, pronunciationPaint);

            // Instantiate drawing canvas and bitmap
            canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);

            // Draw the specified path using the specified paint.
            canvas.drawPath(mPath, mPaint);
            canvas.drawPath(circlePath, circlePaint);
        }

        // Declare x, y position variables
        private float mX, mY;

        // Declare touch tolerance value of 4 dp
        private static final float TOUCH_TOLERANCE = 4;

        private void touch_start(float x, float y) {
            mPath.reset();

            // move path position to start at x, y position where user first touches screen
            mPath.moveTo(x, y);
            mX = x;
            mY = y;
        }

        private void touch_move(float x, float y) {

            // Calculate difference in x and y position from previous x and y position
            float dx = Math.abs(x - mX);
            float dy = Math.abs(y - mY);

            // Check if movement is greater than tolerance
            if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {

                // If so, starting from the last point touched, add a quadratic bezier curve that
                // goes to the average of first and current position
                mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
                mX = x;
                mY = y;

                // Display circle showing path direction according to user's touch
                circlePath.reset();
                circlePath.addCircle(mX, mY, 30, Path.Direction.CW);
            }
        }

        private void touch_up() {

            // End the line at last position touched on screen
            mPath.lineTo(mX, mY);
            circlePath.reset();

            // Commit path to offscreen
            mCanvas.drawPath(mPath, mPaint);

            // Reset the path so that there is not double drawing
            mPath.reset();
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {

            // Get the x and y position of where user touches
            float x = event.getX();
            float y = event.getY();

            // Respond to down, move, and up events
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    touch_start(x, y);
                    invalidate();
                    break;
                case MotionEvent.ACTION_MOVE:
                    touch_move(x, y);
                    invalidate();
                    break;
                case MotionEvent.ACTION_UP:
                    touch_up();
                    invalidate();
                    break;
            }
            return true;
        }
    }
}
