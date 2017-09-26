import java.util.Scanner;
class larg{
  public static void main(String arg[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    if(a>b && a>c)
       System.out.println(a+" is largest");
    else
     if(b>c && b>a)
      System.out.println(b+" is largest");
    else
      System.out.println(c+" is largest");

  }
}