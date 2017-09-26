import java.util.Scanner;
class month{
 public static void main(String[] args){
   Scanner in = new Scanner (System.in);
   System.out.println("Enter month Number:");
   int m= in.nextInt();
   if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
     System.out.println("days=31");
     }
     else if(m==2){
       System.out.println("days=28");
     }
     else
     System.out.println("days=30");
   }
 }