class fibb{
  public static void main(String arg[])
  {
   int i,sum=0,x=0,y=1,n=10;
    System.out.println("Fibbonacci series is ");
    for (i=0;i<n ;i++ )
 {
     if(i<=1)
     sum=i;
     else
    {
        sum=x+y;
        x=y;
        y=sum;
    }
  System.out.print(sum+" ");


  }
}
}