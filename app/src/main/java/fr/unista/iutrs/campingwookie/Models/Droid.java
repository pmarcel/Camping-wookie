package fr.unista.iutrs.campingwookie.Models;

/**
 * Created by Raphaël on 16/01/2015.
 */

import android.graphics.Bitmap;

public class Droid {

    private Bitmap bitmap; // the actual bitmap
    private int x;   // the X coordinate
    private int y;   // the Y coordinate

    public Droid(Bitmap bitmap, int x, int y) {
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

