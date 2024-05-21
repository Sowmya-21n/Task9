package Task9;
import java.util.Scanner;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s1 = sc.nextLine();
        String reverse = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            char c = s1.charAt(i);
            reverse = reverse + c;
        }
        System.out.println("Reversed string is:"+ reverse);
    }
}