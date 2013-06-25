package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Colors.Greens;
import org.teachingextensions.logo.Colors.Purples;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 1; i <= 200; i++)
    {
      adjustPen();
      Tortoise.move(70);
      int degrees = 360 / 5;
      Tortoise.turn(degrees);
      Tortoise.turn(degrees + 1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    int width = 1;
    Tortoise.setPenWidth(width + 1);
    if (4 < width)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.Blue);
    ColorWheel.addColor(Purples.DarkOrchid);
    ColorWheel.addColor(Blues.DarkSlateBlue);
    ColorWheel.addColor(Greens.Teal);
    ColorWheel.addColor(Purples.Indigo);
  }
}
