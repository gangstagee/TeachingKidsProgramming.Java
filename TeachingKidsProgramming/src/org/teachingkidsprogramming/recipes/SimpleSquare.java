package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.setSpeed(8);
    for (int i = 1; i <= 4; i++)
    {
      Tortoise.move(50);
      Tortoise.setPenColor(Colors.Blues.Blue);
      Tortoise.turn(90);
    }
  }
}
