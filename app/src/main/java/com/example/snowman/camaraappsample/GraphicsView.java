package com.example.snowman.camaraappsample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


/**
 * Created by SnowMan on 2016/10/12.
 */

public class GraphicsView extends View {

    public GraphicsView(Context context){

        super(context);


    }


    @Override

    protected void onDraw(Canvas canvas){

        // 描画オブジェクトの生成
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        canvas.drawRect(100,100,600,200,paint);





    }


}
