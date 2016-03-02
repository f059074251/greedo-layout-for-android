package com.fivehundredpx.greedo_layout_sample;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.TypedValue;

/**
 * Created by Julian Villella on 15-08-05.
 */
public class MeasUtils {
    public static int pxToDp(int px, Context context) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, px,
                context.getResources().getDisplayMetrics());
    }

    public static int dpToPx(float dp, Context context) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
    }

    public static double getRatio(Resources resource, int resId){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds=true;
        BitmapFactory.decodeResource(resource,resId,options);
        return options.outWidth/(double)options.outHeight;
    }
}
