package Task9;
public class Question1
{
    public static void main(String[] args)
    {
        String s1 = "madam";
        String reverse = "";
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            char c = s1.charAt(i);
            reverse = reverse + c;
        }
        if (s1.equals(reverse))
        {
            System.out.println("palindrome");
        } else
        {
            System.out.println("not a palindrome");
        }
    }
}
