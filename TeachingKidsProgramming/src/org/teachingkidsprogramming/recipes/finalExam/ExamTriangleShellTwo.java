package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellTwo
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Size of Shell?");
    if (shellSize < 300)
    {
      int newshellSize = MessageBox
          .askForNumericalInput("Shell size is too small to be seen. Please enter a shell size greater than 300.");
      for (int i = 1; i <= newshellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = newshellSize / 150;
        Tortoise.move(i - largeLength);
        drawTriangle();
        Tortoise.turn(360 * 6 / newshellSize);
        if ((newshellSize / 150) < 0)
        {
          Tortoise.move(i + 3);
        }
        else
        {
          drawTriangle();
          Tortoise.turn(360 * 6 / newshellSize);
        }
      }
    }
    else if (shellSize >= 300)
      ;
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shellSize / 150;
        Tortoise.move(i - largeLength);
        drawTriangle();
        Tortoise.turn(360 * 6 / shellSize);
        if ((shellSize / 150) < 0)
        {
          Tortoise.move(i + 3);
        }
        else
        {
          drawTriangle();
          Tortoise.turn(360 * 6 / shellSize);
        }
      }
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2; i++)
    {
      Tortoise.move(i);
      Tortoise.turn(360 / 3);
    }
  }
}
