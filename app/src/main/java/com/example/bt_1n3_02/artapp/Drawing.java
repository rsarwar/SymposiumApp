package com.example.bt_1n3_02.artapp;

import android.graphics.Path;

/**
 * Created by BT_1N3_03 on 6/8/2018.
 */

public class Drawing {

    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;

    public Drawing(int color, boolean emboss, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
/*
The following packages are not available:
- Package id platforms;android-P
 */