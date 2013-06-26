package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors.Pinks;
import org.teachingextensions.logo.Colors.Reds;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 1; i <= 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      draw0ctagonWithOverlap();
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Pinks.HotPink);
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Pinks.Fuchsia);
    ColorWheel.addColor(Reds.OrangeRed);
    ColorWheel.addColor(Pinks.DeepPink);
    ColorWheel.addColor(Reds.MediumVioletRed);
    ColorWheel.addColor(Reds.Crimson);
    ColorWheel.addColor(Reds.Tomato);
  }
  private static void draw0ctagonWithOverlap()
  {
    for (int i = 1; i <= 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
}
