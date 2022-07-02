package pl.codent.nupagadi;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class GameView extends View {

    MainLoop mainLoop;
    Canvas canvas;
    Paint paint = new Paint();
    Paint paint2 = new Paint();
    Paint paint3,paintRect,paint4,paint5;
    float touchX;
    float touchY;

    public GameView(Context context) {
        super(context);
        this.setDrawingCacheEnabled(true);
        canvas = new Canvas();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.argb(255,230,230,230));
        paint.setStrokeWidth(8);
        canvas.drawLine(100,100,touchX,touchY,paint);
        showGui(canvas);

    }

    private void showGui(Canvas canvas) {
        Shader shader = new LinearGradient(0,0,600,1200,Color.argb(255,190,190,190),
                Color.argb(255, 240,240,240), Shader.TileMode.CLAMP);
        Shader shader2 = new LinearGradient(280,150,310,200,Color.argb(255,130,0,0),
                Color.argb(255, 222,0,0), Shader.TileMode.CLAMP);
        Shader shader3 = new LinearGradient(1280,150,1310,200,Color.argb(255,130,0,0),
                Color.argb(255, 222,0,0), Shader.TileMode.CLAMP);
        //rectangle gradient
        Shader shader4 = new LinearGradient(100,100,1310,700,Color.argb(255,244,244,244),
                Color.argb(255, 111,111,111), Shader.TileMode.CLAMP);
        paintRect = new Paint();
        paintRect.setShader(shader4);
        paintRect.setStrokeWidth(18);
        paintRect.setStyle(Paint.Style.STROKE);


         paint4 = new Paint();
         paint5 = new Paint();
        paint4.setShader(shader);
        paint2.setShader(shader2);
        paint5.setShader(shader3);
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(20,30,690,1430,paint4);

        paint3 = new Paint();
        paint3.setColor(Color.BLACK);
        paint3.setStrokeWidth(5);
        paint3.setStyle(Paint.Style.STROKE);


        canvas.drawCircle(280,150,60,paint2);
        canvas.drawCircle(280,150,64,paint3);
        canvas.drawCircle(100,150,60,paint2);
        canvas.drawCircle(100,150,64,paint3);
        canvas.drawCircle(280,1280,60,paint5);
        canvas.drawCircle(280,1280,64,paint3);
        canvas.drawCircle(100,1280,60,paint2);
        canvas.drawCircle(100,1280,64,paint3);


        canvas.drawRect(620,350,160,1100,paint);
        canvas.drawRect(624,346,156,1104,paint3);
        canvas.drawRect(644,326,136,1124,paintRect);

        canvas.drawText(touchX+"  "+touchY,400,700,paint3);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        if (action==MotionEvent.ACTION_DOWN) {
            touchX = (int) event.getX();
            touchY = (int) event.getY();
        }
        Log.d (TAG, "touched: "+touchX+" and: "+touchY);

    // todo getposition
        invalidate();
        return true;
    }

}
