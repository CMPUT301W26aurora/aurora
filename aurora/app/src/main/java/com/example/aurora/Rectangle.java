package com.example.aurora;

import android.health.connect.datatypes.units.Length;

public class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int Length, int Width) {
        this.length = Length;
        this.width = Width;
    }
}
