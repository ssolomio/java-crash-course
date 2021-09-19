package Basic;

public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    return s * 1000 + m * 1000 * 60 + h * 1000 * 60 * 60;
  }
  public static void main (String[]args) {
	  System.out.println (Past(0, 1, 1));
  }
}

