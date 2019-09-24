package ime;

import javax.swing.JOptionPane;
/**
  * @author Saurabh
 */

public class ArrayImplement 
{
    public static void main (String[]args)
    {
        String s1,s2, s3,s4,s5,s6,s7,s8,s9;
        int d1,d2, d3,d4,d5,d6,d7,d8,d9;
        int elm;
        ArrayData a = new ArrayData();
        s1 = JOptionPane.showInputDialog("Enter size of array");
        d1 = Integer.parseInt(s1);
        
        
        for (int i =0; i< d1; i++)
        {
            s2 = JOptionPane.showInputDialog("Enter the element "+ (i+1) +" to add ");
            d2 = Integer.parseInt(s2);
            a.add(d2);
            //System.out.println( elem);
        
        }
        
        //System.out.println("Array Size " +d1);
        s3 = JOptionPane.showInputDialog("Enter 1, If You Want Array to be printed ");
        d3 = Integer.parseInt(s3);
        if (d3 == 1)
        {
            a.print();
        }
        
        s4 = JOptionPane.showInputDialog("Enter 1,To get SUM of elements");
        d4 = Integer.parseInt(s4);
        if  (d4 == 1)
        {
            a.sum();
        }
        
        s5 = JOptionPane.showInputDialog("Enter 1,To delete an element");
        d5 = Integer.parseInt(s5);
        if  (d5 == 1)
        {
            s6 = JOptionPane.showInputDialog("Enter the element you want to delete");
            d6 = Integer.parseInt(s6);
            a.delete(d6);
            a.print();
        }
        
        s7 = JOptionPane.showInputDialog("Enter 1,To find an element");
        d7 = Integer.parseInt(s7);
        if  (d7 == 1)
        {
            s8 = JOptionPane.showInputDialog("Enter the element you want to Find");
            d8 = Integer.parseInt(s8);
            a.search(d8);
        
        }
        
        
        s9 = JOptionPane.showInputDialog("Enter 1,To SORT the ARRAY in ascending order");
        d9 = Integer.parseInt(s9);
        if  (d9 == 1)
        {
            a.sort();
            a.print();
        }
      
    }
    
    
}
