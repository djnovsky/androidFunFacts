package com.novsky.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Novsky on 09.06.2016.
 */
public class ColorWheel {

    private String[] mColors = {
            "#EB161C",
            "#8AA369",
            "#5F9970",
            "#365550",
            "#1A1B1F",
            "#D16D9E",
            "#00344F",
            "#006699",
            "#009999",
            "#1E5555",
            "#42125A",
            "#D50200",
            "#28131C",
            "#98192E",
            "#24774F",
            "#0FEA80"
    };

    public int getColor() {
        String color;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}