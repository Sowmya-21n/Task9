package Task9;
import java.util.Scanner;
public class Question6
{
    public static void main(String[] args)
    {
        {
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            double r=sc.nextInt();
            int d=sc.nextInt();
            double a=(2*20*2000)/100;
            if((m>=4)&&(m<=6)||(m==11)||(m==12))
            {
                System.out.printf("Hotel Tariff: Rs.%.2f",r*d+a);
            }
            else{
                if(m>12)
                {
                    System.out.println("Invalid Input");
                }
                else
                {
                    System.out.printf("Hotel Tariff: Rs.%.2f",r*d);
                }
            }
        }
    }
}