package Task9;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mark obtained by the student:");
        int marks = sc.nextInt();
        switch(marks/10)
        {
            case 10:
            System.out.println("GRADE=S");
            break;
            case 9:
            System.out.println("GRADE=A");
            break;
            case 8:
            System.out.println("GRADE=B");
            break;
            case 7:
            System.out.println("GRADE=C");
            break;
            case 6:
            System.out.println("GRADE=D");
            break;
            case 5:
            System.out.println("GRADE=E");
            break;
            default:
            System.out.println("GRADE=F");
        }
    }
}
