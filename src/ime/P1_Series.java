/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ime;
import javax.swing.JOptionPane;
import java.util.Random;

public class P1_Series
{

    public static void main(String[] args)
    {
        Random rand =new Random();
        int n,r, evn,od,t;
        String no;
        
        no = JOptionPane.showInputDialog("How many times you would like to run the loop");
        t  = Integer.parseInt (no);
        
        
        for(int i = 0; i<t; i++)
        {
            System.out.println("\nRunning the loop " +(i+1) +"time");
            n=rand.nextInt(23);
            r = (n+2)%4;
            evn = (n)%2; 
            if (evn==0 && n!=0 && n<=11)
            {
                System.out.println("Yay! The number is even from series I: " +n);
            }
            else if(evn!=0 && n<=12)
            {
                System.out.println("It is an odd number, Series II: " +n);
            }
            
            else if(r==0 && n>=6)
            {
                System.out.println("Voila! Number is from series III: " +n );

            
            }
            else
            {
                System.out.println("Required random number not generated: " +n);
            }
        }
    }
}
