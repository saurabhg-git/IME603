import java.util.Scanner;
public class P4_LeapYear 
{
    public static void main (String[] args)
    {
        int yr;
        System.out.println("Enter a Year ??");
        Scanner input = new Scanner(System.in);
        yr = input.nextInt();
        if (yr % 4 == 0)
        {
            if((yr % 100 == 0) &&(yr % 400 == 0))
            {
                System.out.println( yr +" is a leap year");
            }
            
            else if(yr % 100 == 0)
            {
                System.out.println( yr +" is not a leap year");
            }    

            else
            {
                System.out.println( yr +" is a leap year");
            } 
            
        }
            
            
        else
        {
            System.out.println( yr +" is not a leap year");
        }   
    }   
}
