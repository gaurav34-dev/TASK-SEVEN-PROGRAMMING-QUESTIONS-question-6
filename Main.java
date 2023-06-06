import java.util.*;
//import java.util.Arrays;
public class Main {
public static void main(String[] args) 
{
 System.out.println("enter the number");
  Scanner s=new Scanner(System.in);
  int m=s.nextInt();
  int sum=0;
  int r;
  int q=m;
  while(m!=0)
    { r=m%10;
      sum=(sum+(r*r*r));
      m=m/10;
    }
  if(q==sum)
  {
    System.out.println("the number is armstrong");
  }
  else
  {
    System.out.println("the number is not armstrong");
  }
 }
}