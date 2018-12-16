//×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
// 		Name: Alec Mingione
//		Prog: Program 1
//		Date: September 23, 2016
//×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
import java.util.Scanner;
//import java.Lang.String;

class prog1

{
    public static void main(String args[])
    {
        String name;
        int total;
        double average;
        int week, days, hours;
        int whatsLeft;
        double wage;
        double amount;
        double totalAmount;
        double w1, w2, w3, w4; // w1 = week1, w2= week2, w3= week3, w4= week4
        double totalW1, totalW2, totalW3, totalW4;
        double averageWage;




		Scanner scan = new Scanner(System.in);

        System.out.println("Please enter name:  ");
        name= scan.nextLine();


        int week1,week2,week3,week4;
        System.out.println("Enter the last 4 weeks' hours worked with whitespace:  ");
        week1= scan.nextInt();
        week2= scan.nextInt();
        week3= scan.nextInt();
        week4= scan.nextInt();

        System.out.println("enter wage per hour:  ");
        wage= scan.nextDouble();

        System.out.println();
        System.out.println(name);

        total = (week1+week2+week3+week4);
        System.out.println("   Total hour worked: " + total);

        average = total/4.0;
        System.out.println("   Average hour worked per week:" + average);

        week = total/40;
        whatsLeft = total%40;
        days = whatsLeft/8;
        whatsLeft = whatsLeft%8;
        hours = whatsLeft;

        System.out.println();
        System.out.println("Full time equivalent:");
        System.out.println("\t" +week + " weeks");
        System.out.println("\t" +days + " days");
        System.out.println("\t" +hours + " hours");

        System.out.println();

        amount = wage;
        totalAmount = total*wage;
        System.out.println("Total salary recieved: " + totalAmount + " dollars");

        w1 = week1;
        totalW1 = week1*wage;
        System.out.println("   First week: " +totalW1 + " dollars");

        w2 = week2;
        totalW2 = week2*wage;
        System.out.println("   Second week: " +totalW2 + " dollars");

        w3 = week3;
        totalW3 = week3*wage;
        System.out.println("   Third week: " +totalW3 + " dollars");

        w4 = week4;
        totalW4 = week4*wage;
        System.out.println("   Fourth week: " +totalW4 + " dollars");

        System.out.println();

        averageWage = totalAmount/4;
        System.out.println("   average salary per week: " + averageWage);





        System.out.println();


	   }
   }

