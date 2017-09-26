import java.util.Scanner;
class pon{
public static void main(String arg[])
{ int flag=7;
Scanner in = new Scanner (System.in);
System.out.println("Enter number");
int n=in.nextInt();
for(int i=2;i<=n/2;i++)
{
  if(n%i==0)
   flag=0;
   else
   flag=1;
}
if(flag==0)
System.out.println("Not a prime");
else
System.out.println("Prime");
}
}