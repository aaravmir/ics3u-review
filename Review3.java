import java.util.Scanner;

public class Review3
{
    static Scanner scan = new Scanner(System.in);
    
    //Question 1:
    public static void q1Reverse(String word)
    {
        String backWord = "";
        char ch;        
        for (int i = 0; i < word.length(); i++)
        {
            ch= word.charAt(i); 
            backWord= ch + backWord;
        }
        System.out.println("Reversed word: "+ backWord);
    }
    
    //Question 2:
    public static String q2Reverse(String word)
    {
        String backWord = "";
        char ch;        
        for (int i = 0; i < word.length(); i++)
        {
            ch= word.charAt(i); 
            backWord= ch + backWord;
        }
        return backWord;
    }
    
    //Question 3:
    public static void q3AreaAndPerimeter(int length, int width)
    {
        int area = length * width;
        int perimeter = 2 * length + 2 * width;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    
    public static int q4Sum(int num1, int num2)
    {
        int sum = num1 + num2;
        int difference = Math.abs(num1 - num2);
        if(num1 < 0 && num2 < 0)
        {
            return difference;
        }
        return sum;
    }
    
    public static int q5AddArrays(int[] inputArray)
    {
        int maxValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++)
        { 
            if(inputArray[i] > maxValue)
            { 
                maxValue = inputArray[i]; 
            } 
        }      
        int minValue = inputArray[0]; 
        for(int i=1;i < inputArray.length;i++)
        { 
            if(inputArray[i] < maxValue)
            { 
                minValue = inputArray[i]; 
            } 
        }      
        return maxValue + minValue; 
    }
}
