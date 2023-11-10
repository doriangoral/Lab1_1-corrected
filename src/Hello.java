import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What is your age? ");
        String age = scanner.nextLine();
        System.out.print("What is your major? ");
        String major = scanner.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Major : " + major);
        scanner.close();
    }
}
