package week3;

import java.util.*;

public class PanDigital
{
  public static char[][] p = {"1".toCharArray(), "12".toCharArray(),
                              "123".toCharArray(), "1234".toCharArray(),
                              "12345".toCharArray(), "123456".toCharArray(),
                              "1234567".toCharArray(), "12345678".toCharArray(),
                              "123456789".toCharArray()};
 
  public static void main(String[] args)
  {
    for(int i = 7654321; i > 1000000; i -= 2)
    {
      if(isPan(i))
        if(isPrime(i))
        {
          System.out.println(i);
          break;
        }
    }
  }
 //check prime
  public static boolean isPrime(int n)
  {
    if(n < 2)
      return false;
 
    if(n != 2 && n % 2 == 0)
      return false;
 
    for(int i = 3; i * i < n; i++)
    {
      if(n % i == 0)
        return false;
    }
 
    return true;
  }
 
  public static boolean isPan(int n)
  {
    String s = Integer.toString(n);
    char[] c = s.toCharArray();
    Arrays.sort(c);
    return (Arrays.equals(c, p[c.length - 1]));
  }
}