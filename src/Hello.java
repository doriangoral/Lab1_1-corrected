import java.util.Scanner;

public class Hello
{
    static String name;
    static String age;
    static String major;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.print("What is your age? ");
        age = scanner.nextLine();
        System.out.print("What is your major? ");
        major = scanner.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Major : " + major);
        scanner.close();
    }
}
