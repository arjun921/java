class swap{
public static void main(String[] args) {
   int a=10,b=100;
   System.out.println("Numbers before swap a= "+a+"  b= "+b );
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("Numbers after swap a= "+a+"  b= "+b );
 }
}