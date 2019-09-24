import java.util.Random;

public class P3
{

    public static void main(String[] args)
    {
        Random rand =new Random();
        double sale,pay,sumsale,sumpay;

        for(int i=1; i<11; i++)
        {
            sale = rand.nextDouble()*10000;
            pay = 200 + sale*9.0/100.0;
            System.out.println("Emp" + i+ "  Sales: "+ String.format("%.2f", sale)+ 
                               "  Payment: "+String.format("%.2f", pay));
            
        }
    }
}