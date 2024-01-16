import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
      byte m1,m2,m3;
      Scanner sc=new Scanner(System.in);
      
      
System.out.println("enter your os marks");
m1=sc.nextByte();
System.out.println("enter your m2 marks");
m2=sc.nextByte();
System.out.println("enter your m3 marks");
m3=sc.nextByte();
float avg=(m1+m2+m3)/3.0f;
if (avg>=48 && m1>=33&& m2>=33 && m3>= 33){
    System.out.println("congrats pappu pass ho gaya");

}
else {
    System.out.println("pappu ke lag chuke hai");
}
 
  }
}
