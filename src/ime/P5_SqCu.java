package ime;

public class P5_SqCu
{

    public static void main(String[] args)
    {
     int s,c;
     s = 1;
     c = 1;
             for(int i = 0; i<11; i++)
             {
                s = i*i;
                c = s*i;
                 System.out.println("Numer: " + i+ "  Square: "+ s +"  Cube: "+ c);

             }
    }
}