package ime;
/**
 *
 * @author Saurabh
 */
public class ArrayData 
{
    static int size=10000; 
    static int [] sheet = new int[size];
    static int avail=0;  static int i=0;
    
   static void add( int elm)
    {
        sheet [avail]= elm;
        avail++;
    }
    
   static void sum()
   {
       int sum=0;
       for (i=0; i< avail; i++)
       {
          sum = sum + sheet[i]; 
       }
       System.out.println("\nHere is the required SUM: "+sum);
       
   }
   
   static void print()
   {
       System.out.print("Array: ");
       for (i=0; i< avail; i++)
       {
           System.out.print(" "+ sheet[i]);
       }
   }
   
   static void search(int elm)
   {
       for (i=0; i< avail; i++)
       {
           if ( sheet[i]== elm)
           {
               System.out.println("\nVoila!, Found the element "+ elm  + " at index: " +i );
               break;
           }
           if (i== avail-1)
           {
               System.out.println("\nElement is not available");
               
           }
       }
   }
   
   static int getindex( int elm)
   {
       for (i=0; i< avail; i++)
       {
           if (sheet[i]== elm)
               return i;
        }
       return -1;
       
   }
       
   
static void delete (int elm)
   {
       getindex (elm);
       for (i= getindex(elm); i< avail; i++)
       {
           sheet[i]= sheet[i+1];
       }
       avail--;
       
   }
    
     
static void sort()
    {
        for (int i = 0; i < avail; i++)
                for (int j = 0; j < avail-i-1; j++)
                    if (sheet[j] > sheet[j+1])
                    {

                        int temp = sheet[j];
                        sheet[j] = sheet[j+1];
                        sheet[j+1] = temp;
                    }


    }
}
    