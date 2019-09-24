//package temp_convertor;

import javax.swing.JOptionPane;

public class TempFtoC 
{
    
    public static void main(String[] args) 
    {
    
        int t, sum;
        sum = 0;
        double f , c;
        String no, fs ;
        no = JOptionPane.showInputDialog("How many numbers you want to convert");
        t  = Integer.parseInt (no);
            while(t>0)
            {
                /*sum = sum+t;
                no = JOptionPane.showInputDialog("Enter an Integer");
                t  = Integer.parseInt (no);*/

                JOptionPane.showMessageDialog (null,"Converting F to C" );
                fs = JOptionPane.showInputDialog("Enter temp in F");
                f = Double.parseDouble(fs);
                c = (f - 32.0)*5/9;
                System.out.println(f+ "°Fahrenheit  =  "+ c +"°Celsius");

                t--;


            }
        


    }
    
}
