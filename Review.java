import java.util.Scanner;
import java.util.Random;

public class Review
{
    static Scanner scan = new Scanner(System.in);
  
    //Question 1:
    public static void q1_findSum()
    {   
        System.out.println("Insert 3 integers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sum = a + b + c;
        System.out.println("The total sum is" + sum);
    }
    
    //Question 2:
    public static void q2_findAverage()
    {   
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double average = (a + b + c)/3;
        System.out.println("The average is " + average);
    }
    
    //Question 3:
    public static void q3_findCourseAverage()
    {  
        System.out.println("Enter 4 numbers");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double average = (a + b + c + d)/4;
        System.out.println("Your course average is " + average);
    }
    
    //Question 4:
    public static double q4_round(int precision)
    {
        System.out.println("Enter 4 numbers");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double average = (a + b + c + d)/4;
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(average * scale) / scale;
    }
        
    //Question 5:
    public static void q5_doOperations()
    {
        System.out.println("Type 2 integers between 1 and 9:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a/b);
    }
    
    //Question 6: 
    public static void q6_calculateLarger()
    {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if(a == b)
        {
            System.out.println("A and B are the same!");
        }
        if(a > 0 && b > 0)
        {
            if(a/b > 1)
            {
                System.out.println("A is bigger than B");
            }
            if(a/b < 1 && a/b > 0)
            {
                System.out.println("B is bigger than A");
            }
        }
        if(a < 0 && b < 0)
        {
            if(a/b < -1)
            {
                System.out.println("B is bigger than A");
            }
            if(a/b < 0 && a/b > -1)
            {
                System.out.println("A is bigger than B");
            } 
        }
        if(a < 0 && b > 0)
        {
            System.out.println("B is bigger than A");
        }
        if(a > 0 && b < 0)
        {
            System.out.println("A is bigger than B");
        }
    }
    
    //Question 7:
    static Random rand = new Random();
    public static void q7_canYouAdd()
    {
        for(int i = 0; i < 3; i++)
        {
            int num1 = rand.nextInt(1000);
            int num2 = rand.nextInt(1000);
            System.out.println("The 2 numbers are " + num1 + " " + num2 + ".");
            int sum = num1 + num2;
            System.out.println("What is the sum?");
            int answer = scan.nextInt();
            if(answer == sum)
            {
                System.out.println("You are correct!");
            }
            else
            {
                System.out.println("You are wrong :/");
            }
        }
    }  
    
    //Question 8:
    public static void q8_findSmallest()
    {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a <= b && a <= c)
        {
            System.out.println(a + " is the smallest number");
        }
        else if(b <= a && b <= c)
        {
            System.out.println(b + " is the smallest number");
        }
        else
        {
            System.out.println(c + " is the smallest number");
        }
    }
    
    //Question 9:
    public static void q9_kidOrNot()
    {
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age < 13)
        {
            System.out.println("You are a child");
        }
        else if(age >= 13 && age <= 19)
        {
            System.out.println("You are a teen");
        }
        else if(age > 19 && age <= 65)
        {
            System.out.println("You are an adult");
        }
        else
        {
            System.out.println("You are a senior citizen");
        }
    }
    
    //Question 10:
    public static void q10_barGraph()
    {
        System.out.println("Enter 5 integers between 1 and 50:");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = scan.nextInt();
        }
        for(int n : arr) 
        {
            for (int i = 0; i < n; i++) 
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
