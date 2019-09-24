package ime;

public class P2_Dist
{

    public static void main(String[] args)
    {
        double dist, vel, ac, v;
        vel = 60.0;
        v = 5*vel/18;
        ac = 4.0;
        dist = (v*v)/(2*ac);
        System.out.println("Distance travelled:  "+ String.format("%.2f", dist)+"\nand the Poor Rabbit is Dead ':('.");
                
    }
}