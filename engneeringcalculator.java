

import java.util.Scanner;

public class engineeringcalculator{
public static void main(String[]args){

Scanner scanner=new Scanner(System.in);
System.out.println("1.addition");
System.out.println("2.subtraction");
System.out.println("3.multiplication");
System.out.println("4.division");
System.out.println("5.sqaure");
System.out.println("6.Exponentiation");
System.out.println("7.trigonometric function");
System.out.println("8.logarithm");

System.out.print("Enter your choice beetween (1-8):");
int choice=Scanner.nextDouble();

switch(choice){
case 1:
performaddition();
break;
case 2:
performsubtraction();
break;
case 3:
performmultiplication();
break;
case 4:
performdivision();
break;
case 5:
performsqaure();
break;
case 6:
performExponentiation();
break;
case 7:
performtrigonometricfunctions();
break;
case 8:
performlogarithm();
break;
default:
System.out.println("invalid choice");
}
}

private static void
performaddition(){
Scanner scanner=new Scanner(System.in);
double num1=scanner.nextDouble();
double num2=scanner.nextDouble();
double result=num1+num2;
System.out.println(+result);
}

private static void
performsubtraction(){
Scanner scanner= new Scanner(System.in);
System.out.print("enter the first number");
double num1=scanner.nextDouble();
System.out.print("enter the second number");
double num2= scanner.nextDouble();
double result=num1-num2;
System.out.println(+result);
}

private static void
performmultiplication(){
Scanner scanner=new Scanner(System.in);
double num1=scanner.nextDouble();
double num2=scanner.nextDouble();
double result=num1*num2;
System.out.println(+result);
}
private static void
performdivision(){
Scanner scanner=new Scanner(System.in);
double num1=scanner.nextDouble();
double num2=scanner.nextDouble();
double result=num1/num2;
System.out.println(+result);
}
 private static void
performsqaure(){
Scanner scanner=new Scanner(System.in);
double num1=scanner.nextDouble();
if(num1 >= 0){
double result=Math.sqrt(num1);
System.out.println(+result);
}else{
System.out.println("invalid number for square root");
}
}
private static void
performExponentiation(){
Scanner scanner =new Scanner(System.in);
double base=scanner.nextDouble();
System.out.println("enter the exponent");
double exponent=scanner.nextDouble();
double result=Math.pow(base,exponent);
System.out.println(+result);
}

private static void
performtrigonometricfunctions()
{
Scanner scanner=new Scanner(System.in);
System.out.println("entet an angle in degrees");
double angle=scanner.nextDouble();
double angleRadians=Math.toRadians(angle);

double sinresult=Math.sin(angleRadians);
double cosresult=Math.cos(angleRadians);
double tanresult=Math.tan(angleRadians);
System.out.println(+sinresult);
System.out.println(+cosresult);
System.out.println(+tanresult);
}

private static void
performlogarithm(){
Scanner scanner=new Scanner(System.in);
double num=scanner.nextDouble();
if(num>0){
double result=Math.log10(num);
System.out.println(+result);
}
else
{
System.out.print("invalid for logarithm");
}
}
}











