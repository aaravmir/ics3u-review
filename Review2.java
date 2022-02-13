import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Review2
{
    static Scanner scan = new Scanner(System.in);
    
    //Question 1:
    public static void q1ArrayAdder () 
    {
        // Declare my array and necessary variables
        int[] values;
        int numberOfValues, sum = 0;
        
        // Ask the user how many values?
        System.out.println("How many values?");
        numberOfValues = scan.nextInt();
        
        // Initialize the array to the user's chosen size
        values = new int[numberOfValues];
        
        for (int i = 0; i < values.length; i++)
        {
            System.out.println("Enter value " + i);
            values[i] = scan.nextInt();
        }
        
        int highest = values[0];
        int lowest = values[0]; 
        
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > highest)
            {
                highest = values[i];
            }
            if(values[i] < lowest)
            {
                lowest = values[i];
            }
            if(i == values.length - 1)
            {
                break;
            }
        }            
        System.out.println("The lowest number is " + lowest + ", and the highest number is " + highest + ".");
        
        // Loop to add and display values:
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i]; // add to our sum
            System.out.print(values[i] + " "); // Display value + a space
            if (i == values.length - 1)
            { // last value?
                System.out.print ("= ");
            } else 
            {
                System.out.print ("+ ");
            }
        }
        // Output the final sum to complete the line
        System.out.println ("The sum is " + sum);        
        
        //part b:
        int average = sum / numberOfValues;
        System.out.println("The average is: " + average);
    }
    
    //Question 2:
    public static void q2ProbabilityCount()
    {
        double[] numbers;
        double[] total;
        sop("How many times would you like to roll the dice?");
        int rolls = scan.nextInt();
        total = new double[rolls];
        numbers = new double[]{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        sop("Rolls: ");
        for(int i = 0; i < rolls; i++)
        {
            double result = ((int)(Math.random() * (12-2)) + 2);
            total[i] = result;
            if(total[i] == 2){
                numbers[0]+=1;
            }
            if(total[i] == 3){
                numbers[1]+=1;
            }
            if(total[i] == 4){
                numbers[2]+=1;
            }
            if(total[i] == 5){
                numbers[3]+=1;
            }
            if(total[i] == 6){
                numbers[4]+=1;
            }
            if(total[i] == 7){
                numbers[5]+=1;
            }
            if(total[i] == 8){
                numbers[6]+=1;
            }
            if(total[i] == 9){
                numbers[7]+=1;
            }
            if(total[i] == 10){
                numbers[8]+=1;
            }
            if(total[i] == 11){
                numbers[9]+=1;
            }
            if(total[i] == 12){
                numbers[10]+=1;
            }
        }
        sop("The probability of you rolling a 2 was: " + (100.0 / rolls) * numbers[0] + "%");
        sop("The probability of you rolling a 3 was: " + (100.0 / rolls) * numbers[1] + "%");
        sop("The probability of you rolling a 4 was: " + (100.0 / rolls) * numbers[2] + "%");
        sop("The probability of you rolling a 5 was: " + (100.0 / rolls) * numbers[3] + "%");
        sop("The probability of you rolling a 6 was: " + (100.0 / rolls) * numbers[4] + "%");
        sop("The probability of you rolling a 7 was: " + (100.0 / rolls) * numbers[5] + "%");
        sop("The probability of you rolling a 8 was: " + (100.0 / rolls) * numbers[6] + "%");
        sop("The probability of you rolling a 9 was: " + (100.0 / rolls) * numbers[7] + "%");
        sop("The probability of you rolling a 10 was: " + (100.0 / rolls) * numbers[8] + "%");
        sop("The probability of you rolling a 11 was: " + (100.0 / rolls) * numbers[9] + "%");
        sop("The probability of you rolling a 12 was: " + (100.0 / rolls) * numbers[10] + "%");
        sop("Your roll sums are: " + Arrays.toString(total));
    }
    
    public static void sop(String str)
    {
        System.out.println(str);
    }
}
